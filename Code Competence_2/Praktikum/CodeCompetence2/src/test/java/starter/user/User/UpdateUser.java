package starter.user.User;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class UpdateUser {
    private static String url = "https://fakestoreapi.com/";

    @Step("I set users api endpoint for update user")
    public String setApiUpdateUser(){
        return url + "users/7";
    }

    @Step("I send PUT request to update user")
    public void sendPUTupdateUser(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "Johntor@gmail.com");
        requestBody.put("username", "johnd");
        requestBody.put("password", "m38rmF$");

        JSONObject nameObject = new JSONObject();
        nameObject.put("firstname", "John");
        nameObject.put("lastname", "Doe");
        requestBody.put("name", nameObject);

        JSONObject addressObject = new JSONObject();
        addressObject.put("city", "kilcoole");
        addressObject.put("street", "7835 new road");
        addressObject.put("number", 3);
        addressObject.put("zipcode", "12926-3874");

        JSONObject geolocationObject = new JSONObject();
        geolocationObject.put("lat", "-37.3159");
        geolocationObject.put("long", "81.1496");

        addressObject.put("geolocation", geolocationObject);
        requestBody.put("address", addressObject);

        requestBody.put("phone", "1-570-236-7033");
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .get(setApiUpdateUser());
    }

    @Step("I receive newly updated user")
    public void receiveValidUser(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.UPDATE_USER_SCHEMA);

        restAssuredThat(response -> response.body("email", notNullValue()));
        restAssuredThat(response -> response.body("username", notNullValue()));
        restAssuredThat(response -> response.body("password", notNullValue()));
        restAssuredThat(response -> response.body("name.firstname", notNullValue()));
        restAssuredThat(response -> response.body("name.lastname", notNullValue()));
        restAssuredThat(response -> response.body("address.city", notNullValue()));
        restAssuredThat(response -> response.body("address.street", notNullValue()));
        restAssuredThat(response -> response.body("address.number", notNullValue()));
        restAssuredThat(response -> response.body("address.zipcode", notNullValue()));
        restAssuredThat(response -> response.body("address.geolocation.lat", notNullValue()));
        restAssuredThat(response -> response.body("address.geolocation.long", notNullValue()));
        restAssuredThat(response -> response.body("phone", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}