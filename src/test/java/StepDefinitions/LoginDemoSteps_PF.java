package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

public class LoginDemoSteps_PF {
	WebDriver driver =null;
	
	LoginPage_PF login;
	HomePage_PF home;
	
	@Given("User is in the login page")
	public void user_is_in_the_login_page() {
		 WebDriverManager.chromedriver().setup();
		   driver =new ChromeDriver();
		   System.out.println("inside login PageFactory");
		   driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		   driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^User enters the (.*) and (.*)$")
	public void user_enters_the_username_and_password(String username,String password) {
		login=new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);
	   //driver.findElement(By.id("name")).sendKeys(username);
	  // driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("User clicks enter")
	public void user_clicks_enter() {
		login=new LoginPage_PF(driver);
		login.clickLogin();
	   //driver.findElement(By.id("login")).click();
	}

	@Then("User is in the Homepage")
	public void user_is_in_the_homepage() {
	home=new HomePage_PF(driver);
	Assert.assertTrue(home.checkLogoutIsDisplayed());
	driver.close();
    driver.quit();
	}

}


