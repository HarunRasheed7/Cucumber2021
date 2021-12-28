package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

//public class LoginDemoSteps_POM {
//	
//	WebDriver driver =null;
//	
//	LoginPage login;
//	
//	@Given("User is in the login page")
//	public void user_is_in_the_login_page() {
//		 WebDriverManager.chromedriver().setup();
//		   driver =new ChromeDriver();
//		   System.out.println("inside login POM");
//		   driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		   driver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("^User enters the (.*) and (.*)$")
//	public void user_enters_the_username_and_password(String username,String password) {
//		login=new LoginPage(driver);
//		login.enterUsername(username);
//		login.enterPassword(password);
//	   //driver.findElement(By.id("name")).sendKeys(username);
//	  // driver.findElement(By.id("password")).sendKeys(password);
//	}
//
//	@When("User clicks enter")
//	public void user_clicks_enter() {
//		login=new LoginPage(driver);
//		login.clickLogin();
//	   //driver.findElement(By.id("login")).click();
//	}
//
//	@Then("User is in the Homepage")
//	public void user_is_in_the_homepage() {
//	login=new LoginPage(driver);
//	Assert.assertTrue(login.checkLogoutIsDisplayed());
//	driver.close();
//    driver.quit();
//	}
//
//}
