package starter.user.Products;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetAllCategories {
    private static String url = "https://fakestoreapi.com/";
    @Step("I set categories API endpoint for get all categories")
    public String setApiCategories() {
        return url + "products/categories";
    }

    @Step("I send GET request body for get all categories")
    public void sendCategories() {SerenityRest.given().get(setApiCategories());}

    @Step("I receive data for all categories")
    public void receiveValidDataForAllCategories() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_CATEGORIES_1_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}