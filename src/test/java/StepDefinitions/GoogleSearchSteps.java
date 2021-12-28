package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {
	WebDriver driver=null;
	
	@Given("User navigates to google search")
	public void user_navigates_to_google_search() {
	   WebDriverManager.chromedriver().setup();
	   driver =new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	   driver.navigate().to("http://www.google.com");
	}

	@When("User enters the search data")
	public void user_enters_the_search_data() {
	   driver.findElement(By.name("q")).sendKeys("Apple");
	}

	@When("clicks Enter")
	public void clicks_enter() {
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("User navigates to the search results")
	public void user_navigates_to_the_search_results() {
	    driver.getPageSource().contains("Iphone");
	    driver.close();
	    driver.quit();
	}


}
