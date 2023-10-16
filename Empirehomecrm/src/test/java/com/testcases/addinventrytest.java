package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;
import com.pageobjects.Loginfunctionalitywithmulitipuledata;
import com.pageobjects.addinventry;
import com.utils.Testdata;

public class addinventrytest extends Basetest {
	
	Loginfunctionalitywithmulitipuledata lf;
	addinventry add;
	private final String sheetname="addproduct" ;

	public addinventrytest() {
		super();   //invokes the parent class constructor
	}
	@DataProvider
	public String[][]dataread() throws Throwable{
		return Testdata.Customerdata(sheetname);
		
	}
	

	@BeforeMethod
	public void setup() throws Throwable {
 
		initialization();

		lf = new Loginfunctionalitywithmulitipuledata();
		lf.verifylogin();

		add= new addinventry();

	}

	@Test(dataProvider = "dataread",dataProviderClass = addinventrytest.class)

	public void loginvalidation(String Modelnumber,String itemtitel,String ItemDescription, String height,String width,String breadth,String colourname,String actualprice,String qty ) throws Throwable {
		add.verifyaddinventrypage(Modelnumber, itemtitel, ItemDescription, height, width, breadth, colourname, actualprice, qty);
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Inventory/All");
		

	}

	@AfterMethod
	public void teardown() {
	//	  extentreports.flush();
		//driver.close();

	}
}



