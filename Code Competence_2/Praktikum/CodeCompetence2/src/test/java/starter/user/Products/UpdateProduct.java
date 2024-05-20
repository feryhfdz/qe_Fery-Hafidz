package starter.user.Products;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;
// import starter.utils.ProductGetter;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class UpdateProduct {
    private static String url = "https://fakestoreapi.com/";

    @Step("I set product api endpoint for update product")
    public String setApiUpdateProduct(){
       // int productId = ProductGetter.getProductID();
        return url + "products/9";
    }

    @Step("I send PUT request to update product")
    public void sendPUTupdate(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "keyboard");
        requestBody.put("price", 35.2);
        requestBody.put("description", "for gaming");
        requestBody.put("image", "https://i.pravatar.cc");
        requestBody.put("category", "electronic");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .put(setApiUpdateProduct());
    }

    @Step("I receive detail information product")
    public void receiveValidComment(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.UPDATE_PRODUCT_SCHEMA);
        restAssuredThat(response -> response.body("'id'",notNullValue()));
        restAssuredThat(response -> response.body("'title'",notNullValue()));
        restAssuredThat(response -> response.body("'price'",notNullValue()));
        restAssuredThat(response -> response.body("'description'",notNullValue()));
        restAssuredThat(response -> response.body("'image'",notNullValue()));
        restAssuredThat(response -> response.body("'category'",notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}