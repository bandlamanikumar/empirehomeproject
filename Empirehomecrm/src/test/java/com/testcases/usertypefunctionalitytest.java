package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionalitywithmulitipuledata;
import com.pageobjects.Usertypefunctionality;

public class usertypefunctionalitytest extends Basetest {

	Loginfunctionalitywithmulitipuledata lf;
	Usertypefunctionality ut;
	
	public usertypefunctionalitytest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Throwable {
		
		initialization();

		lf = new Loginfunctionalitywithmulitipuledata();
		lf.verifylogin();
		
		ut = new Usertypefunctionality();
	}
	
	@Test
	public void loginvalidation() throws Throwable {
		ut.Usertypefunctionality();
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Inventory/All");
	}
	
	@AfterMethod
	public void teardown() {
		//driver.close();
		
	}

}
	



