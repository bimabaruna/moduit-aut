package TestStep;

import Test.TestRunner;
import io.cucumber.java.en.Given;

public class HomePageStep extends BaseStep {

    @Given("user go to register page")
    public void userGoToRegisterPage() {
        objectHome.loginBtn.click();
        TestRunner.driver.getWindowHandles().forEach(tab->TestRunner.driver.switchTo().window(tab));
        objectHome.registerBtn.click();
    }
}
