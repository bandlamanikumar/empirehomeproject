package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

import net.bytebuddy.asm.Advice.This;

public class customerfunctionality extends Basetest  {
	
	@FindBy(xpath = "//span[normalize-space()='Customers']")
	WebElement customer; 
	@FindBy(xpath = "//input[@placeholder='Enter Customer Name']")
	WebElement name; 
	@FindBy(xpath = "//input[@placeholder='Enter Mobile Number']")
	WebElement mobilenumber; 
	@FindBy(xpath = "//input[@placeholder='Enter Email Id']")
	WebElement email; 
	@FindBy(xpath = "//input[@placeholder='Enter Whatsapp Number']")
	WebElement whatsapp;  
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement save; 
	@FindBy(xpath = "//tr[@class='odd']//i[@class='fa fa-pencil']")
	WebElement eddit;
	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement search;
	public customerfunctionality() {
		
		PageFactory.initElements(driver,this);
		
	}
	public void customerfunctionality1() throws Throwable{
		Thread.sleep(2000);
		customer.click();
		Thread.sleep(2000);
		name.sendKeys(prop.getProperty("manikumar"));
		email.sendKeys(prop.getProperty("manikumar.marolix@gmail.com"));
		whatsapp.sendKeys(prop.getProperty("7989328756"));
		save.click();
		search.sendKeys(prop.getProperty("manikumar"));
		
		
		
		
		
		
	}
	
}




