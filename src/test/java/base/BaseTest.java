package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public WebDriver driver;

	
  @BeforeMethod
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver",
              "C:\\Users\\ajith\\OneDrive\\Desktop\\Vcube\\chromedriver-win64\\chromedriver.exe");

      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://the-internet.herokuapp.com/login");
  
  }

  @AfterMethod
  public void afterTest() {
	  driver.quit();
  }

}
