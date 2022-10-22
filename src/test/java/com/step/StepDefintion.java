package com.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefintion {
	
	WebDriver driver;
	
	
	@Given("User is on the Login Page")
	public void user_is_on_the_login_page() {
		 driver=new ChromeDriver();
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagarasu\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
			driver.get("http://adactinhotelapp.com/");

	
	
	}
	@When("The user Enter the valid username and Password")
	public void the_user_enter_the_valid_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("Rooban06");  
		driver.findElement(By.id("password")).sendKeys("R12345");
	}
	@When("clicks on the Login button")
	public void clicks_on_the_login_button() {
		driver.findElement(By.id("login")).click();
	}
	@Then("The User should be  navigated to home Page")
	public void the_user_should_be_navigated_to_home_page() {
		 boolean status = driver.findElement(By.linkText("Hello Rooban06!")).isDisplayed();
		    Assert.assertTrue(status);
			

	}

	

//	@Given("User is on the Login Page")
//	public void user_is_on_the_login_page() {
//
//	}
//	@When("The user Enter the valid username and Password")
//	public void the_user_enter_the_valid_username_and_password() {
//
//	}
//	@When("clicks on the Login button")
//	public void clicks_on_the_login_button() {
//
//	}
//	@Then("The User should be navigated to home Page")
//	public void the_user_should_be_navigated_to_home_page() {
//
//	}



	
	
	
	
	
	
	


	
}
