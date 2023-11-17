package com.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.base.Basetest;
import com.pageobjects.Loginfunctionalitywithmulitipuledata;
import com.pageobjects.logout;

public class Logoutfunctionalitytest extends Basetest {

	Loginfunctionalitywithmulitipuledata lf;
	logout lout;
	
	public Logoutfunctionalitytest() {
		
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws Throwable {
		
		initialization();
		
		lf = new Loginfunctionalitywithmulitipuledata();
		lf.verifylogin();
		
		lout = new logout();
		
		}
	
	@Test
	public void logoutvalidation() throws Throwable {
		
		lout.verifylogout();
		
		Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Login']")).isDisplayed());
		
			}
	
	@AfterMethod
	public void teardown() {
		
	}

}

