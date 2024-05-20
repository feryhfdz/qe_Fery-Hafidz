package starter.user.Cart;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetAllCart {

    private static String url = "https://fakestoreapi.com/";

    @Step("I set cart API endpoint for get all cart")
    public String setApiEndGetAllCart(){
        return url + "carts";
    }

    @Step("I send GET request endpoint for get all cart")
    public void sendRequestCart(){
        SerenityRest.given().get(setApiEndGetAllCart());
    }

    @Step("I receive data for all cart")
    public void receiveValidCart(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_CART_SCHEMA);
        restAssuredThat(response -> response.body("id",notNullValue()));
        restAssuredThat(response -> response.body("userId",notNullValue()));
        restAssuredThat(response -> response.body("date",notNullValue()));
        restAssuredThat(response -> response.body("products.productId",notNullValue()));
        restAssuredThat(response -> response.body("products.quantity",notNullValue()));
        restAssuredThat(response -> response.body("__v",notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));

    }


}