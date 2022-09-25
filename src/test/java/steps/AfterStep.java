package steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;

public class AfterStep {

    @After
    public void tearDown(){

        WebDriverRunner.getWebDriver().quit();
    }

    @io.cucumber.java.AfterStep
    public void screenStep(){
        Selenide.screenshot(System.currentTimeMillis() + "_step");
    }

}
