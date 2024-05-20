package starter.user.User;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;

public class GetASingleUser {

    private static String url = "https://fakestoreapi.com/users/";

    @Step("I set users API endpoint by ID")
    public String setApiMyUserById(){
        return url + "2";
    }

    @Step("I send GET request to get user information by ID")
    public void sendRequestMyUserById(){
        SerenityRest.given()
                .get(setApiMyUserById());
    }

    @Step("I receive detail user information by ID")
    public void receiveValidUserById(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_USER_BY_ID_SCHEMA);

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