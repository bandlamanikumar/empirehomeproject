package com.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.Basetest;

public class Customerfunctionalitytest extends Basetest{
	
	@FindBy(xpath = "//span[normalize-space()='Masters']")
	WebElement masters;
	@FindBy(xpath = "//a[normalize-space()='Holidays']")
	WebElement holidays;
	@FindBy(xpath = "//a[normalize-space()='Add New']")
	WebElement add;
	@FindBy(xpath = "//input[@name='HolidayDate']")
	WebElement date;
	@FindBy(xpath = "//input[@id='HolidayName']")
	WebElement name;
	@FindBy(xpath = "//input[@id='HolidayDesc']")
	WebElement desc;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement save;
	@FindBy(xpath = "//i[@class='fa fa-pencil']")
	WebElement eddit;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-sm']")
	WebElement delite;
	
	}


