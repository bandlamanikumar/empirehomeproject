package com.pageobjects;

import java.awt.AWTException;

import javax.swing.text.Utilities;
import javax.xml.xpath.XPath;

import org.apache.poi.sl.usermodel.Notes;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.google.common.base.Throwables;
import com.utils.Testdata;
import com.utils.Utils;

import io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.NotEnoughDataDecoderException;

public class StockmoveFunctionality extends Basetest {

	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement element;

	@FindBy(xpath = "//span[normalize-space()='Inventory']")
	WebElement inventory;

	@FindBy(xpath = "//a[normalize-space()='Move Stock']")
	WebElement movestock;

	@FindBy(xpath = "//select[@id='movedFromD']")
	WebElement movefrome;

	@FindBy(xpath = "//select[@id='movedToD']")
	WebElement moveto;

	@FindBy(xpath = "//input[@id='MoStNot']")
	WebElement notes;

	@FindBy(xpath = "//span[@id='select2-invId-container']")
	WebElement modalnumber;

	@FindBy(xpath = "//input[@role='textbox']")
	WebElement searchbar;

	@FindBy(xpath = "//input[@id='qtymoving']")
	WebElement qty;

	@FindBy(xpath = "//input[@id='btnAdd']")
	WebElement add;

	@FindBy(xpath = "//button[@id='btnSave']")
	WebElement save;	

	

	public StockmoveFunctionality() {      //constructor
		
		PageFactory.initElements(driver,this);
		
		
	}
	public void verifyaddinventrypage() throws Throwable{
		Thread.sleep(3000);
		element.click();
		Thread.sleep(3000);

		inventory.click();
		Thread.sleep(2000);
		movestock.click();
		Thread.sleep(2000);
		Testdata.dropdowns(movefrome, 0);
		Testdata.dropdowns(moveto,1);
		notes.sendKeys(prop.getProperty("notes"));
		Thread.sleep(2000);
		modalnumber.click();
		searchbar.sendKeys(prop.getProperty("searchbar"));
		qty.sendKeys(prop.getProperty("qty"));
		add.click();
		save.click();
		

	

	}

}
