package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.$$;


public class CreateAccPage {

    private final SelenideElement email         = $(By.id("email_create"));
    private final SelenideElement firstName     = $(By.id("customer_firstname"));
    private final SelenideElement secondName    = $(By.id("customer_lastname"));
    private final SelenideElement passwd        = $(By.id("passwd"));
    private final SelenideElement address       = $(By.id("address1"));
    private final SelenideElement city          = $(By.id("city"));
    private final SelenideElement postalCode    = $(By.id("postcode"));
    private final SelenideElement add_info      = $(By.id("other"));
    private final SelenideElement mobileNumber  = $(By.id("phone_mobile"));
    private final SelenideElement secondAddress = $(By.id("alias"));
    private final ElementsCollection state      = $$("#id_state>option");

    private SelenideElement registerBtn = $x("//*[text()='Register']");

    public void inputEmail(String text){
        email.setValue(text);
    }

    public void inputFirstName(String text){
        firstName.setValue(text);
    }

    public void inputLastName(String text){secondName.setValue(text);}

    public void inputPassword(String text){
        passwd.setValue(text);
    }

    public void inputAddress(String text){
        address.setValue(text);
    }

    public void inputCity(String text){
        city.setValue(text);
    }

    public void inputState(String stateName){
        SelenideElement element = state.findBy(text(stateName));

        Assertions.assertTrue(element.exists());
        element.click();
    }

    public void inputPostalCode(String text){
        postalCode.setValue(text);
    }

    public void inputAdd_info(String text){
        add_info.setValue(text);
    }

    public void inputMobileNumber(String text){
        mobileNumber.setValue(text);
    }

    public void inputSecondAddress(String text){secondAddress.setValue(text);}

    public void pressRegister(){registerBtn.click();}

}
