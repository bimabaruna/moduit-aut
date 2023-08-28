package TestStep;


import io.cucumber.java.en.And;


public class RegisterPageStep extends BaseStep {


    @And("user input nama lengkap {string}")
    public void userInputNamaLengkap(String fullName) {
        objectRegister.fullNameField.sendKeys(fullName);
    }

    @And("user input valid email")
    public void userInputValidEmail() {
        String email = randEmail();
        objectRegister.emailField.sendKeys(email);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        objectRegister.newPassword.sendKeys(password);
    }

    @And("user input confirm password {string}")
    public void userInputConfirmPassword(String password) {
        objectRegister.confirmPassword.sendKeys(password);
    }

    @And("user input phone number {string}")
    public void userInputPhoneNumber(String phoneNumber) {
        objectRegister.phoneNumberField.sendKeys(phoneNumber);
    }

    @And("user click daftar")
    public void userClickDaftar() {
        objectRegister.registerBtn.click();
    }

}
