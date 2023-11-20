package com.testcases;


import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.base.Basetest;
import com.pageobjects.Compenytest;
import com.pageobjects.Loginfunctionalitywithmulitipuledata;
import com.utils.Testdata;

public class compenyfunctionalitytest extends Basetest {
	Loginfunctionalitywithmulitipuledata lf;
	Compenytest cf;

	public compenyfunctionalitytest() {
		super();
	}

	@BeforeTest
	public void setup() throws Throwable {

		initialization();

		lf = new Loginfunctionalitywithmulitipuledata();
		lf.verifylogin();

		cf = new Compenytest();

	}

	@Test
	public void editcompanyvalidation() throws Throwable {

		cf.verifyeditcompany();

		List<WebElement> rows = driver.findElements(By.xpath(".//td[normalize-space()='Sundar Pichai']"));

		if (rows.isEmpty()) {

			Assert.fail("no rows found");
			
		} else {

			String expectedTest = "Sundar Pichai";

		}
		for (WebElement row : rows) {
			String actualText = row.getText();
			System.out.println(actualText);

		}

	}

}


