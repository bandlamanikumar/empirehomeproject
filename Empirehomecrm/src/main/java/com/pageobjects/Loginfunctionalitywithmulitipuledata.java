package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Loginfunctionalitywithmulitipuledata extends Basetest {
	@FindBy (xpath="//input[@placeholder='example@gmail.com']")   
WebElement userid;

@FindBy (name="pword")
WebElement pass;


@FindBy (xpath="//button[@class='btn green_btn']")
WebElement loginbutton;

public  Loginfunctionalitywithmulitipuledata() {           //constructor
	   
	   PageFactory.initElements(driver,this);
}


public void verifylogin() throws Throwable {
	   
	  userid.sendKeys(prop.getProperty("username")); 
	   pass.sendKeys(prop.getProperty("password"));
	   Thread.sleep(2000);
	   loginbutton.click();
}
}
