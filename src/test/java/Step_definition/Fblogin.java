package Step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fblogin {
	WebDriver driver;
	@Given("User on the login page")
	public void user_on_the_login_page() {
		 System.setProperty("webdriver.edge.driver","C:\\Users\\Jai\\Desktop\\Automation\\edgedriver_win64\\msedgedriver.exe");
		  driver = new EdgeDriver();
		  driver.get("https://www.facebook.com/");
	   
	}

	@When("User enters a valid email address or phone number")
	public void user_enters_a_valid_email_address_or_phone_number() {
		 WebElement username = driver.findElement(By.id("email"));
		    username.sendKeys("rakenth");
		  
	   
	}

	@When("User enters a valid password")
	public void user_enters_a_valid_password() {
		  WebElement password = driver.findElement(By.name("pass"));
		    password.sendKeys("12345");
	    
	}

	@Then("User clicks the submit button and the user login should be successfull")
	public void user_clicks_the_submit_button_and_the_user_login_should_be_successfull() {
		 WebElement login = driver.findElement(By.name("login"));
		    login.click();
		    driver.close();
	    
	}

}
