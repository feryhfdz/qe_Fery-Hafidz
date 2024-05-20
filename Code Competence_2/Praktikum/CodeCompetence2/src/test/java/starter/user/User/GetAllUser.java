package starter.user.User;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetAllUser {

    private static String url = "https://fakestoreapi.com/";

    @Step("I set users API endpoint for get all users")
    public String setApiAllUser(){
        return url + "users";
    }

    @Step("I send GET request to get all users")
    public void sendRequestAllUser(){
        SerenityRest.given().get(setApiAllUser());
    }

    @Step("I receive all of users")
    public void receiveValidUser(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_USER_SCHEMA);

        restAssuredThat(response -> response.body("address.geolocation.lat", notNullValue()));
        restAssuredThat(response -> response.body("address.geolocation.long", notNullValue()));
        restAssuredThat(response -> response.body("address.city", notNullValue()));
        restAssuredThat(response -> response.body("address.street", notNullValue()));
        restAssuredThat(response -> response.body("address.number", notNullValue()));
        restAssuredThat(response -> response.body("address.zipcode", notNullValue()));
        restAssuredThat(response -> response.body("id", notNullValue()));
        restAssuredThat(response -> response.body("email", notNullValue()));
        restAssuredThat(response -> response.body("username", notNullValue()));
        restAssuredThat(response -> response.body("password", notNullValue()));
        restAssuredThat(response -> response.body("name.firstname", notNullValue()));
        restAssuredThat(response -> response.body("name.lastname", notNullValue()));
        restAssuredThat(response -> response.body("phone", notNullValue()));
        restAssuredThat(response -> response.body("__v", notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));

    }

}