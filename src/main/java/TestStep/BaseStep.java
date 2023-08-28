package TestStep;

import Test.TestRunner;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.WebDriverWait;
import Object.*;

public class BaseStep {

    public static HomePageObject objectHome = new HomePageObject(TestRunner.driver);
    public static RegisterObject objectRegister = new RegisterObject(TestRunner.driver);

    public WebDriverWait wt = new WebDriverWait(TestRunner.driver,55);
    public Faker faker = new Faker();

    public void implicitWait(Integer time){
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {

        }
    }

    public String randEmail() {

        String email = faker.name().firstName();
        String emailFormat = "@yahoo.com";
        return email + emailFormat;

    }

}
