package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PulsaPage extends PageObject {
    private static By PulsaTitle(){
            return By.xpath("//*[@id=\"__next\"]/div/div[1]/header/div/div[2]/h1");
    }

    public boolean validatePulsaPage() {
        return $(PulsaTitle()).isDisplayed();
    }

    private static By PhoneNumber(){
        return By.id("phone_number");
    }

    @Step
    public void inputPhoneNumber(String phoneNumber){
        $(PhoneNumber()).type(phoneNumber);
    }

    private By NominalPulsa(){
        return By.id("Tri Rp1.000");
    }

    @Step
    public void selectNominalPulsa(){
        $(NominalPulsa()).click();
    }


}
