package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{
  @Test
  public void f() {
	  
	  LoginPage a = PageFactory.initElements(driver, LoginPage.class);
		a.enterUsername("tomsmith");
		a.enterPassword("SuperSecretPassword!");
		a.clickLogin();
		Assert.assertTrue(driver.getPageSource().contains("Secure Area"));

  }
}
