package starter.user.Products;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class AddNewProduct {
    private static String url = "https://fakestoreapi.com/";
    @Step("I set product API endpoint for create new product")
    public String setApiNewProduct() {
        return url + "products";
    }

    @Step("I send POST request for create a new product with valid credentials")
    public void sendCreateProductRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("title", "mouse");
        requestBody.put("price", 10.5);
        requestBody.put("description", "Experience optimal comfort while working or gaming");
        requestBody.put("image", "https://i.pravatar.cc");
        requestBody.put("category", "electronic");

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(setApiNewProduct());
    }

    @Step("I receive The product that has been created has been successfully added with a customized ID number")
    public void receiveValidDataForCreateNewProduct() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.ADD_NEW_PRODUCT_SCHEMA);

        restAssuredThat(response -> response.body("'id'",notNullValue()));
        restAssuredThat(response -> response.body("'title'",notNullValue()));
        restAssuredThat(response -> response.body("'price'",notNullValue()));
        restAssuredThat(response -> response.body("'description'",notNullValue()));
        restAssuredThat(response -> response.body("'image'",notNullValue()));
        restAssuredThat(response -> response.body("'category'",notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}