package starter.user.Products;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;


public class GetAllProducts {

    private static String url = "https://fakestoreapi.com/";

    @Step("I set product API endpoint to get all products")
    public String setApiEndGetAllProduct(){
        return url + "products";
    }

    @Step("I send GET request endpoint for get all products")
    public void sendRequestProduct(){
        SerenityRest.given().get(setApiEndGetAllProduct());
    }



    @Step("I receive all products details")
    public void receiveValidProfile(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_PRODUCT_SCHEMA);

        restAssuredThat(response -> response.body("'id'",notNullValue()));
        restAssuredThat(response -> response.body("'title'",notNullValue()));
        restAssuredThat(response -> response.body("'price'",notNullValue()));
        restAssuredThat(response -> response.body("'description'",notNullValue()));
        restAssuredThat(response -> response.body("'category'",notNullValue()));
        restAssuredThat(response -> response.body("'rating.rate'",notNullValue()));
        restAssuredThat(response -> response.body("'rating.count'",notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));

    }


}