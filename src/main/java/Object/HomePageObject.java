package Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObject extends AbstractObject {
    public HomePageObject(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div[1]/div[2]/a[3]")
    public WebElement loginBtn;

    @FindBy (xpath = "/html/body/div[2]/div/span/div/div/div/div[2]/div/div[4]/div[4]/div/a")
    public WebElement registerBtn;
}
