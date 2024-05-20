package starter.user.Cart;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetASingleCart {
    private static String url = "https://fakestoreapi.com/";

    @Step("I set carts API endpoint with an valid ID to get cart by ID")
    public String setApiGetEndValidCart(){
        return url + "carts/3";
    }

    @Step("I send GET request endpoint for get cart by ID")
    public void sendGetRequestValidCart(){
        SerenityRest.given().get(setApiGetEndValidCart());
    }

    @Step("I receive detail a product cart by ID")
    public void receiveCart(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_SINGLE_CART_SCHEMA);

        restAssuredThat(response -> response.body("id",notNullValue()));
        restAssuredThat(response -> response.body("userId",notNullValue()));
        restAssuredThat(response -> response.body("date",notNullValue()));
        restAssuredThat(response -> response.body("products[0].productId",notNullValue()));
        restAssuredThat(response -> response.body("products[0].quantity",notNullValue()));
        restAssuredThat(response -> response.body("products[1].productId",notNullValue()));
        restAssuredThat(response -> response.body("products[1].quantity",notNullValue()));
        restAssuredThat(response -> response.body("__v",notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}