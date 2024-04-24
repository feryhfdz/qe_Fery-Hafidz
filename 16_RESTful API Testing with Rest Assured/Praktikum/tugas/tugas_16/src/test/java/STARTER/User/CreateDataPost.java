package STARTER.User;

import STARTER.utils.JsonSchema;
import STARTER.utils.JsonSchemaHelper;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class CreateDataPost {
    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set API endpoint for create a post data")
    public String setApiEndPoint(){
        return url + "posts";
    }

    @Step("I send a request to create a post data")
    public void sendPostRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "TUGAS16" );
        requestBody.put("body", "SUSAH");
        requestBody.put("id", 101);
        requestBody.put("userId", 1);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setApiEndPoint());
    }

    @Step("I receive status code 201")
    public void receiveStatusCode201(){
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I receive valid data for created post data")
    public void receiveCreatedPostData(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.CREATE_DATA_POST_SCHEMA);

        restAssuredThat(response -> response.body("'title'", equalTo("TUGAS16")));
        restAssuredThat(response -> response.body("'body'", equalTo("SUSAH")));
        restAssuredThat(response -> response.body("'id'", equalTo(101)));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I send a request to create a post data with unrecognized additional parameter")
    public void sendUnrecognizedParameter(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Halo!" );
        requestBody.put("body", "Hallo word");
        requestBody.put("id", 101);
        requestBody.put("userId", 1);
        requestBody.put("add_param", 700);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setApiEndPoint());
    }

    @Step("the response body should contain an error message that mentions the unrecognized parameter")
    public void receiveValidParameter(){
        restAssuredThat(response -> response.body("'title'", notNullValue()));
        restAssuredThat(response -> response.body("'body'", notNullValue()));
        restAssuredThat(response -> response.body("'id'", notNullValue()));
        restAssuredThat(response -> response.body("'userId'", notNullValue()));
    }
}
