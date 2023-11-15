package com.testcases;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionalitywithmulitipuledata;
import com.pageobjects.shiftfunctionality;


public class Shiftfunctionaliytest extends Basetest {
	Loginfunctionalitywithmulitipuledata lf;
	shiftfunctionality sf;
	public Shiftfunctionaliytest() {
	super();

}
	@BeforeMethod
	public void setup() throws Throwable {
		
		initialization();
		lf=new Loginfunctionalitywithmulitipuledata();
		lf.verifylogin();
		sf= new shiftfunctionality();
	}
	@Test (priority = 1)
	public void addnewshiftvalidation() throws Throwable {
		
		sf.verifyaddnewshift();
		
		List<WebElement> records = driver.findElements(By.tagName("tr"));
		int recordcount = records.size();
	    Assert.assertEquals(recordcount, 20);
	}

	
	@Test (priority = 2)
	public void editshiftvalidation() throws Throwable {
		
		sf.verifyeditshift();
		
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Master/Shifts");
			
	}
	
	@Test (priority = 3)
	public void deleteshiftvalidation() throws Throwable {
		
		sf.verifydeliteshift();
		
		List<WebElement> records = driver.findElements(By.tagName("tr"));
		int recordcount = records.size();
		Assert.assertEquals(recordcount, 19);
		
		}
	
	@AfterTest
	public void teardown() {
		
	
}
}
