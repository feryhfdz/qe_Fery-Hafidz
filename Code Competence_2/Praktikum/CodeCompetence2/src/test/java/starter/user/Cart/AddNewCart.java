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

public class AddNewCart {
    private static String url = "https://fakestoreapi.com/";
    @Step("I set cart API endpoint for create new cart")
    public String setApiNewCart() {
        return url + "carts";
    }

    @Step("I send POST request endpoint for create new cart")
    public void sendNewCreateCart() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("userId", 3);
        requestBody.put("date", "2019-03-29");

        JSONArray productsArray = new JSONArray();
        JSONObject product1 = new JSONObject();
        product1.put("productId", 5);
        product1.put("quantity", 100);
        productsArray.put(product1);

        JSONObject product2 = new JSONObject();
        product2.put("productId", 1);
        product2.put("quantity", 500);
        productsArray.put(product2);

        requestBody.put("products", productsArray);

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(setApiNewCart());
    }

    @Step("I receive request body input data added successfully")
    public void receiveValidDataForCreateNewCart() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.ADD_NEW_CART_SCHEMA);
        restAssuredThat(response -> response.body("id", notNullValue()));
        restAssuredThat(response -> response.body("userId", notNullValue()));
        restAssuredThat(response -> response.body("date", notNullValue()));
        restAssuredThat(response -> response.body("products[0].productId", notNullValue()));
        restAssuredThat(response -> response.body("products[0].quantity", notNullValue()));
        restAssuredThat(response -> response.body("products[1].productId", notNullValue()));
        restAssuredThat(response -> response.body("products[1].quantity", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}