package starter.user.Cart;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;
import org.json.JSONArray;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class UpdateCart {
    private static String url = "https://fakestoreapi.com/";

    @Step("I set carts API endpoint for update cart")
    public String setApiUpdateCart(){
        return url + "carts/2";
    }

    @Step("I send PUT request to update cart")
    public void sendPutRequestUpdateCart(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("userId", 4);
        requestBody.put("date", "2018-10-19");

        JSONArray productsArray = new JSONArray();
        JSONObject product = new JSONObject();
        product.put("productId", 1);
        product.put("quantity", 300);
        productsArray.put(product);

        requestBody.put("products", productsArray);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .put(setApiUpdateCart());
    }

    @Step("I should get the data cart that I updated")
    public void receiveDataCartUpdated(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.UPDATE_CART_SCHEMA);

        restAssuredThat(response -> response.body("id",notNullValue()));
        restAssuredThat(response -> response.body("userId",notNullValue()));
        restAssuredThat(response -> response.body("date",notNullValue()));
        restAssuredThat(response -> response.body("products.productId",notNullValue()));
        restAssuredThat(response -> response.body("products.quantity",notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}