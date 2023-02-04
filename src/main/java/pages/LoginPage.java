package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.DriverManagerUtil;

public class LoginPage {
    private WebDriver driver = null;
    public LoginPage(){
        driver = DriverManagerUtil.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    private WebElement usernameTextBox;

    @FindBy(id = "password")
    private WebElement passwordTextBox;

    @FindBy(id = "tp-sign-in")
    private WebElement loginButton;

    @FindBy(linkText = "Login")
    private WebElement login;

    public void clickLogin(){
        login.click();
    }

    public void enterUserName(String username){
        usernameTextBox.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordTextBox.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }
}
