package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.webdriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinitions {
	
	WebDriver driver = null;

	public void setUpDriver() {

	System.setProperty("webdriver.chrome.driver", "C:Selenium-java-chromedriver_win32chromedriver.exe");
	driver = new ChromeDriver();
	}

	    @Given("^User is on the \"([^\"]*)\" page on URL \"([^\"]*)\"$")
	    public void i_am_on_the_page_on_URL(String arg1, String arg2) throws Throwable {
	        driver.get(arg2);
	       
	    }
	 
	    @When("^User fill in \"([^\"]*)\" with \"([^\"]*)\"$")
	    public void i_fill_in_with(String arg1, String arg2) throws Throwable {
	        driver.findElement(By.id(arg1)).sendKeys(arg2);
	    }
	 
	    @When("^User click on the \"([^\"]*)\" button$")
	    public void i_click_on_the_button(String arg1) throws Throwable {
	        driver.findElement(By.id(arg1)).click();
	    }
	 
	    @Then("^User should see \"([^\"]*)\" message$")
	    public void i_should_see_message(String arg1) throws Throwable {
	       
	    String messageFromUi = driver.findElement(By.id(arg1)).getText();
	    Assert.assertEquals(messageFromUi, arg1);
	    }
	 
	    @Then("^User should see the \"([^\"]*)\" button$")
	    public void i_should_see_the_button(String arg1) throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	        throw new PendingException();
	    }

	 

	
	
}