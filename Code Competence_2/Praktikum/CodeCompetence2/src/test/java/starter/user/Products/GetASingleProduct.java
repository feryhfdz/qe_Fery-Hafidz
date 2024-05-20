package starter.user.Products;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetASingleProduct {
    private static String url = "https://fakestoreapi.com/";

    @Step("I set product API endpoint with the desired id")
    public String setApiGetEndValidIdProduct(){
        return url + "products/1";
    }

    @Step("I send GET request endpoint for get products info by ID")
    public void sendGetRequestValidIdProduct(){
        SerenityRest.given().get(setApiGetEndValidIdProduct());
    }

    @Step("I receive a product details by ID request")
    public void receiveProductDetail(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_PRODUCT_SCHEMA);

        restAssuredThat(response -> response.body("'id'",notNullValue()));
        restAssuredThat(response -> response.body("'title'",notNullValue()));
        restAssuredThat(response -> response.body("'price'",notNullValue()));
        restAssuredThat(response -> response.body("'description'",notNullValue()));
        restAssuredThat(response -> response.body("'category'",notNullValue()));
        restAssuredThat(response -> response.body("'image'",notNullValue()));
        restAssuredThat(response -> response.body("'rating'.'rate'",notNullValue()));
        restAssuredThat(response -> response.body("'rating'.'count'",notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}