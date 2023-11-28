package com.testcases;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.aventstack.extentreports.util.Assert;
import com.base.Basetest;
import com.pageobjects.Loginfunctionality;
import com.pageobjects.Loginfunctionalitywithmulitipuledata;
import com.pageobjects.subcatogory;

public class subcategorytest extends Basetest {
	Loginfunctionalitywithmulitipuledata lf;
	subcatogory sf;
	
	public subcategorytest() {
		super();
	}
	
	@BeforeTest
	public void setup() throws Throwable  {
		
		initialization();
		
		lf = new Loginfunctionalitywithmulitipuledata();
		lf.verifylogin();
		
		sf = new subcatogory();
		
	}
	
	@Test (priority = 1)
	public void addsubcategoryvalidation() throws Throwable {
		
		sf.verifyaddnewsubcategory();
		
		List<WebElement> records = driver.findElements(By.tagName("tr"));
		int recordcount = records.size();
	    AssertJUnit.assertEquals(recordcount, 2);
		
	}
	
	@Test (priority = 2)
	public void editsubcategoryvalidation() throws Throwable {
		
		sf.verifyeditsubcategory();
		
		String urltest = driver.getCurrentUrl();
		AssertJUnit.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Master/Subcategories?catId=527");
	}
	
	@Test (priority = 3)
	public void deletesubcategoryvalidation() throws Throwable {
		
		sf.verifydeletesubcategory();
		
		List<WebElement> records = driver.findElements(By.tagName("tr"));
		int recordcount = records.size();
	    AssertJUnit.assertEquals(recordcount, 1);
		
	}

}


