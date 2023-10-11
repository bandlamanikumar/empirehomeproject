package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;
import com.pageobjects.Loginfunctionalitywithmulitipuledata;

public class Loginfunctionalitytest extends Basetest {
	
	Loginfunctionalitywithmulitipuledata lf;

	public Loginfunctionalitytest() {
		super();   //invokes the parent class constructor
	}

	@BeforeMethod
	public void setup() {

		initialization();

		lf = new Loginfunctionalitywithmulitipuledata();

	}

	@Test

	public void loginvalidation() throws Throwable {
		lf.verifylogin();
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/EmpireHome/Dashboard");
		

	}

	@AfterMethod
	public void teardown() {
	//	  extentreports.flush();
		//driver.close();

	}
}



