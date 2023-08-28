package Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractObject {
    public static WebDriver driver;

    public AbstractObject(WebDriver driver) {

        AbstractObject.driver = driver;
        PageFactory.initElements(driver, this);

    }
}
