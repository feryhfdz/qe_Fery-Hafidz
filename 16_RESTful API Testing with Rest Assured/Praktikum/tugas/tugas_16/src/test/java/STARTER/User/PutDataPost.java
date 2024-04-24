package STARTER.User;

import STARTER.utils.JsonSchema;
import STARTER.utils.JsonSchemaHelper;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;
import org.json.JSONObject;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PutDataPost {
    private static String url = "https://jsonplaceholder.typicode.com/posts/";

    @Step("I set API endpoint for put data with ID")
    public String setApiEndPoint(){
        return url + "1";
    }

    @Step("I send a PUT request to the endpoint with the ID and updated data")
    public void putPostDataUpdate(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("id", 1);
        requestBody.put("title", "foo" );
        requestBody.put("body", "bar");
        requestBody.put("userId", 1);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .put(setApiEndPoint());
    }

    @Step("The post data should be updated successfully")
    public void postDataUpdated(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.PUT_DATA_POST_SCHEMA);

        restAssuredThat(response -> response.body("'id'", Matchers.equalTo(1)));
        restAssuredThat(response -> response.body("'title'", Matchers.equalTo("foo")));
        restAssuredThat(response -> response.body("'body'", Matchers.equalTo("bar")));
        restAssuredThat(response -> response.body("'userId'", Matchers.equalTo(1)));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I send a PUT request to update the post data with that invalid ID")
    public void sendRequestUpdateInvalidID(){
        GetDataPostbyID getDataPostbyID = new GetDataPostbyID();
        SerenityRest.given()
                .get(getDataPostbyID.setApiEndPointInvalidID());
    }

    @Step("the response body contains an error message Post not found")
    public void receiveErrorMessage(){
        restAssuredThat(response -> response.body("'error'", equalTo("TypeError: Cannot read properties of undefined (reading 'id')")));
    }
}
