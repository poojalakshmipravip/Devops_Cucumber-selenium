package skelton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class login {

	 WebDriver driver;
	
	@Given("user should enter url")
	public void user_should_enter_url() {
	    	   
		System.setProperty("webdriver.chrome.driver", "C:\\C2C.04.02_Softwares\\chromedriver.exe");
		  
		  driver = new ChromeDriver();
		  
		  driver.get("http://newtours.demoaut.com");
	}

	@Given("user shoul enter valid credentials")
	public void user_shoul_enter_valid_credentials() {
	  
		  
		driver.findElement(By.name("userName")).sendKeys("mercury");
		 
		driver.findElement(By.name("password")).sendKeys("mercury");
		
		
	}

	@Given("user should click signin button")
	public void user_should_click_signin_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("login")).click();
	}

	@Given("user should close the page")
	public void user_should_close_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.close();
	}
	
	
}
