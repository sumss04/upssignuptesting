package com.usa.ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Upssignupfinaltest {
	
	WebDriver driver;
	
	
	@Given("^User able to open browser$")
	public void user_able_to_open_browser() throws Throwable {
		
	   driver= new FirefoxDriver();
	   
	   
	    
	}

	@Given("^go to UPS home page$")
	public void go_to_UPS_home_page() throws Throwable {
		
		 driver.navigate().to("https://www.ups.com/us/en/Home.page");
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	   
	}

	@When("^User navigate signup button link$")
	public void user_navigate_signup_button_link() throws Throwable {
		
		driver.findElement(By.xpath(".//*[@id='ups-navItems']/ul/li[2]/a")).click();
	   
	    
	}

	@When("^User put user name-Sumon$")
	public void user_put_user_name_Sumon() throws Throwable {
		 driver.findElement(By.xpath(".//*[@id='ups-full_name_input']")).sendKeys("Sumon");
	    
	    
	}

	@When("^User put valid user email-sumss(\\d+)@yahoo\\.com$")
	public void user_put_valid_user_email_sumss_yahoo_com(int arg1) throws Throwable {
		
		 driver.findElement(By.xpath(".//*[@id='ups-email_input']")).sendKeys("sumss04@yahoo.com");
	    
	    
	}

	@When("^User put user id-Sumss(\\d+)cdm$")
	public void user_put_user_id_Sumss_cdm(int arg1) throws Throwable {
		
		 driver.findElement(By.xpath(".//*[@id='ups-user_id_input']")).sendKeys("Sumss1238cdm");
	    
	}

	@When("^User put valid password-M(\\d+)a\\$\\$$")
	public void user_put_valid_password_M_a$$(int arg1) throws Throwable {
		
		 driver.findElement(By.xpath(".//*[@id='ups-user_password_input']")).sendKeys("M131187a$$");
	    
	    
	}

	@When("^User able to Nevigate to check box button link$")
	public void user_able_to_Nevigate_to_check_box_button_link() throws Throwable {
		
		 driver.findElement(By.xpath(".//*[@id='ups-checkbox_group']/div/label")).sendKeys(Keys.SPACE);
	    
	   
	}

	@When("^User able to click continue button$")
	public void user_able_to_click_continue_button() throws Throwable {
		 driver.findElement(By.xpath(".//*[@id='SignupDiv']/div[1]/div/div/div[2]/div[2]/form/div[4]/div/button")).sendKeys(Keys.SPACE);
	    
	    
	}

	@Then("^Signup successfully$")
	public void signup_successfully() throws Throwable {
		
		  driver.findElement(By.xpath(".//*[@id='SignupConfirmationDiv']/div[1]/div/div/div[2]/div[4]/div/button")).sendKeys(Keys.SPACE);
	        
	        System.out.println("Test has passed");
	    
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
