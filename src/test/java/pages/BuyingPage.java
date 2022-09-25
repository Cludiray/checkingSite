package pages;


import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.$$;

public class BuyingPage {

    private final SelenideElement womenBtn = $x("//a[@title='Women']");
    private final SelenideElement blousesBtn = $x("//*[@title='Blouses']");
    private final SelenideElement blouseImg = $x("//img[@title='Blouse']");
    private final SelenideElement addBtn = $x("//span[text()='Add to cart']");
    private final SelenideElement proceedToCheckout = $x("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span");
    private final SelenideElement nextProceed= $x("//span[text()='Proceed to checkout']");
    private final SelenideElement checkBox= $x("//input[@type='checkbox']");
    private final SelenideElement nextProceedShipping = $$(By.xpath("//span[contains(text(),'Proceed to checkout')]")).last();
    private final SelenideElement bankPay = $x("//a[@class='bankwire']");
    private final SelenideElement confirmOrder = $x("//span[contains(text(),'I confirm my order')]");

    private final SelenideElement emailField = $("#email");
    private final SelenideElement passwdField = $("#passwd");
    private final SelenideElement signInBtn = $x("//i[@class='icon-lock left']");

    @When("Click move to Woman button")
    public void moveToWomanButton() {
            womenBtn.hover();
    }


    @Then("Click Blouses button")
    public void clickBlouses(){
        if(blousesBtn.isDisplayed())
                blousesBtn.click();
    }

    @When("Move to Blouse")
    public void moveToBlouseImg(){
        blouseImg.hover();
    }

    @Then("Click add to cart")
    public void addBtb(){
        if(addBtn.isDisplayed())
            addBtn.click();

        SignInPage.sleep();
    }

    @And("Click Proceed to checkout")
    public void clickProceedToCheckout(){
        if(proceedToCheckout.isDisplayed())
            proceedToCheckout.click();
    }

    @And("Click next proceed")
    public void clickNextProceed(){
        nextProceed.click();
        SignInPage.sleep();
    }

    @Then("Input {string} email")
    public void inputEmail(String email){
        if(emailField.isDisplayed())
            emailField.setValue(email);
    }

    @And("Input {string} password")
    public void inputPasswd(String passwd){
        if(passwdField.isDisplayed())
            passwdField.setValue(passwd);
    }

    @Then("Click sign in btn")
    public void clickSignInBtn(){
        if(signInBtn.isDisplayed())
            signInBtn.click();
    }

    @When("Click checkbox - I agree to the terms of service")
    public void clickCheckBox(){
        checkBox.click();
    }

    @Then("Click next proceed shipping")
    public void nextProceedShipping(){
        nextProceedShipping.click();
    }

    @And("Click Pay by bank wire")
    public void clickToBankPay(){
        bankPay.click();
    }

    @When("Click I confirm my order")
    public void clickConfirmOrder(){
        confirmOrder.click();
        SignInPage.sleep();
    }

}
