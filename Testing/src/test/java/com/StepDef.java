package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDef {
	WebDriver d=null;
	@Given("^user on the users login page$")
	public void goToHackerRank() {
		System.setProperty("webdriver.gecko.driver","/root/Downloads/Compressed/geckodriver");
		d=new FirefoxDriver();
		 d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.navigate().to("https://www.hackerrank.com");
		   d.findElement(By.xpath("/html/body/div[3]/header/div/div/nav[2]/div/ul/li[1]/a")).click();   
		   d.findElement(By.xpath("/html/body/div[3]/div[3]/main/article/div/div/div[1]/div/div/div[2]/div[1]/div/div[4]/div/div/a/span")).click();
	}
	
	@When("^any user login into website with username \"(.+\\@.+\\.com)\" and password \"(.+)\"$")
	public void Login(String us,String ps) throws Throwable{
		d.findElement(By.name("username")).sendKeys(us);
		d.findElement(By.name("password")).sendKeys(ps);
		d.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/div[2]/div/div/div[2]/div/div/div[2]/div[1]/form/div[4]/button")).click();
	}
	@When("^click on the submit button$")
	public void click_on_the_submit_button() throws Throwable {
		d.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/div[2]/div/div/div[2]/div/div/div[2]/div[1]/form/div[4]/button")).click();
	}
	
	

}
