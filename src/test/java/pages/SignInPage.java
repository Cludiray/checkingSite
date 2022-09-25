package pages;

import com.codeborne.selenide.SelenideElement;
import config.UserConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.$x;

public class SignInPage {

    private final SelenideElement signInButton = $x("//a[@class='login']");
    private final SelenideElement createAnAccountBtn = $x("//*[@class='icon-user left']");

    private CreateAccPage createAccPage = new CreateAccPage();

    public static void sleep(){
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @When("Click Sign in")
    public void clickSignIn(){
        signInButton.click();
    }
    @And("Click Create Account")
    public void createAccount() {
        createAnAccountBtn.click();
    }

    @Then("Input email")
    public void inputEmail() {
        createAccPage.inputEmail(UserConfig.USER_EMAIL);
    }

    @Then("Input First Name")
    public void inputFirstName() {
        createAccPage.inputFirstName(UserConfig.USER_FIRST_NAME);
    }

    @And("Input Last Name")
    public void inputLastName() {
        createAccPage.inputLastName(UserConfig.USER_LAST_NAME);
    }

    @And("Input Password")
    public void inputPassword() {
        createAccPage.inputPassword(UserConfig.USER_PASSWORD);
    }

    @And("Input Address")
    public void inputAddress() {createAccPage.inputAddress(UserConfig.ADDRESS);}

    @And("Input City")
    public void input() {createAccPage.inputCity(UserConfig.CITY);}

    @And("Input State")
    public void inputState(){
        createAccPage.inputState(UserConfig.State);}

    @And("Input Postal Code")
    public void inputPostalCode() {
        createAccPage.inputPostalCode(UserConfig.POSTAL_CODE);
    }

    @And("Input Additional Info")
    public void inputAddInfo(){
        createAccPage.inputAdd_info(UserConfig.ADD_INFO);
    }

    @And("Input Mobile phone")
    public void inputMobilePhone() {createAccPage.inputMobileNumber(UserConfig.PHONE_NUMBER);}

    @And("Input Second Address")
    public void inputSecondAddress() {
        createAccPage.inputSecondAddress(UserConfig.SECOND_ADD);
    }

    @Then("Click register button")
    public void clickRegisterButton(){
        createAccPage.pressRegister();
    }

}
