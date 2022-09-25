package steps;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.Given;
import org.junit.Assert;


public class BeforeStep {

    @Given("Open site {string}")
    public void open(String address){
        Configuration.timeout = 120000;
        Selenide.open(address);
    }

}
