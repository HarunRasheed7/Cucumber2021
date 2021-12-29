package HooksSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksDemo {
	WebDriver driver =null;

	@Before(value="@smoke",order=1)
	public void browserSetup() {
		System.out.println("I am inside browser setup");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}


	@Before(order=2)
	public void setup2() {
		System.out.println("Inside setup2");
	}


	@After(order=1)
	public void teardown() {
		System.out.println("I am inside teardown ");
		driver.close();
		driver.quit();
	}


	@After(order=2)
	public void teardown2() {
		System.out.println("Inside teardown2");
	}

	@BeforeStep
	public void beforeSteps() {
		System.out.println("I am in before steps");
	}

	@AfterStep
	public void afterSteps() {
		System.out.println("I am in After steps");
	}
	@Given("User in inside the login page")
	public void user_in_inside_the_login_page() {
	}

	@When("User enters the credential")
	public void user_enters_the_credential() {
	}

	@When("user enters login")
	public void user_enters_login() {
	}

	@Then("User is inside the homepage")
	public void user_is_inside_the_homepage() {
	}

}
