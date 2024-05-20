package starter.user.Products;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;

public class GetInCategory {

    private static String url = "https://fakestoreapi.com/";

    @Step("I set category API endpoint for get in category")
    public String setApiCategory() {
        return url + "products/category/electronics";
    }

    @Step("I send GET request endpoint for get in category")
    public void sendInCategory() {
        SerenityRest.given().get(setApiCategory());
    }

    @Step("I receive detail information by category")
    public void receiveValidDataForCategory() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_IN_CATEGORY_SCHEMA);

        restAssuredThat(response -> response.body("'id'",notNullValue()));
        restAssuredThat(response -> response.body("'title'",notNullValue()));
        restAssuredThat(response -> response.body("'price'",notNullValue()));
        restAssuredThat(response -> response.body("'description'",notNullValue()));
        restAssuredThat(response -> response.body("'category'",notNullValue()));
        restAssuredThat(response -> response.body("'image'",notNullValue()));
        restAssuredThat(response -> response.body("'rating.rate'",notNullValue()));
        restAssuredThat(response -> response.body("'rating.count'",notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}