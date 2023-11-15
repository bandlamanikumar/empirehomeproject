package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionalitywithmulitipuledata;
import com.pageobjects.employeeregistration;


public class employeeregistrationfunctionalitylest extends Basetest {
	Loginfunctionalitywithmulitipuledata lf;
	employeeregistration ef;
	
	public employeeregistrationfunctionalitylest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		
		lf = new Loginfunctionalitywithmulitipuledata();
		lf.verifylogin();
		
		ef = new employeeregistration();
		
		
		
	}
	
	@Test
	public void EmployeeRegistrationValidation() throws Throwable {
		
		ef.verifyemployee();
		
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Master/Holidays");

	}
	
	

}


