package starter.user.Login;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class Login {

    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint to Login")
    public String setApiLogin() {
        return url + "auth/login";
    }

    @Step("I send request to login and fill valid credential(email, password)")
    public void sendLoginValid() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("username", "mor_2314");
        requestBody.put("password", "83r5^_");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setApiLogin());
    }

    @Step("I receive my token")
    public void receiveValidLogin() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.LOGIN_SCHEMA);

        restAssuredThat(response -> response.body("token", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }


    @Step("I send request to login and fill blank credentials")
    public void sendLoginBlank() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("username", "");
        requestBody.put("password", "");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setApiLogin());
    }

    @Step("I send request to login with invalid email")
    public void sendRequestLoginInvalidEmail() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "perr");
        requestBody.put("password", "83r5^_");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setApiLogin());
    }

    @Step("I receive error message with empty field")
    public void receiveErrorMessageEmpty() {
        restAssuredThat(response -> response.body("message",notNullValue()));
    }

    @Step("I receive error message stating that username or password is incorrect")
    public void receiveErrorMessageInvalidEmail(){
        restAssuredThat(response -> response.body("message", notNullValue()));
    }
}