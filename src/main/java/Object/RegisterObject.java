package Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterObject extends AbstractObject{
    public RegisterObject(WebDriver driver) {
        super(driver);
    }

    @FindBy (id ="fullname")
    public WebElement fullNameField;

    @FindBy (id = "email")
    public WebElement emailField;

    @FindBy (id = "password")
    public WebElement newPassword;

    @FindBy (id = "confirmPassword")
    public WebElement confirmPassword;

    @FindBy (id = "phone")
    public WebElement phoneNumberField;

    @FindBy (xpath = "//*[@id=\"app\"]/div/span/div/div/div/div[2]/div/div[2]/div/div[1]/button")
    public WebElement registerBtn;
}
