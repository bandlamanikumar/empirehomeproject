package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.base.Basetest;
import com.pageobjects.Loginfunctionalitywithmulitipuledata;
import com.pageobjects.MoveStockFunctionality;

public class Movestockfunctionalitytest extends Basetest{
	
	Loginfunctionalitywithmulitipuledata lf;
	MoveStockFunctionality stock;

	public Movestockfunctionalitytest() {
		super();
	}

	@BeforeMethod
	public void setup() throws Throwable {

		initialization();

		lf = new Loginfunctionalitywithmulitipuledata();
		lf.verifylogin();

		stock = new MoveStockFunctionality();

	}

	@Test
	public void stockmovevalidation() throws Throwable {

		stock.verifymovingstock();

		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Inventory/StockMovement");

	}

}


