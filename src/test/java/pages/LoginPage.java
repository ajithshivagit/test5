package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "//input[@id='username']")
    WebElement username;
    
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    
  
    @FindBy(xpath = "//button[@type='submit']")
    WebElement login;
    

    public void enterUsername(String user) {
        username.sendKeys(user);
    }
    
    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }
    
    public void clickLogin() {
        login.click();
    }
    
	
}
