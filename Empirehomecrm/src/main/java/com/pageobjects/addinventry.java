package com.pageobjects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight;

import com.base.Basetest;
import com.google.common.base.Throwables;
import com.utils.Testdata;

//import io.reactivex.rxjava3.functions.Action;
//import lombok.SneakyThrows;

public class addinventry extends Basetest{
	
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement element;
//	@FindBy(xpath="//i[@class='fa fa-tachometer']")
//	WebElement dashboardbutton;
	@FindBy(xpath="//span[normalize-space()='Inventory']")
	WebElement inventary;
	@FindBy(xpath="//a[normalize-space()='Add Inventory']")
	 WebElement addinventry;
	@FindBy(name = "ModelNumber")
	WebElement modalenumber;
	@FindBy(xpath = "//textarea[@name='Title']")
	WebElement Itemtitel;
	@FindBy(xpath = "//textarea[@name='ItemDescription']")
	WebElement Itemdescription;
	@FindBy(name ="Height" )
	WebElement hight;
	@FindBy(name = "Width")
	WebElement Width;
	@FindBy(name = "Breadth")
	WebElement Breadth;
	@FindBy(name = "ColorName")
	WebElement Colorname;
	@FindBy(name = "ActualPrice")
	WebElement Actualprice;
	@FindBy(xpath ="//*[@id=\"lobicard-custom-control1\"]/div[2]/form/div[1]/div[17]/div/span/span[1]/span")
	WebElement Mrpfacter;
	@FindBy (xpath = "//li[contains(text(), '1.00')]")
	WebElement factorselect;
	@FindBy(name = "MRPPrice")
	WebElement Mrpprice;
	@FindBy(name = "Qty")
	WebElement Qty;
	@FindBy(xpath="//input[@name='ProductMainImageUploaded']")
	WebElement primeryimageupload;
	@FindBy(xpath =  "//button[normalize-space()='Save']")
	WebElement savebutton;
	
	public addinventry() {       //constructor
		
		 PageFactory.initElements(driver,this);
	
	}
	
	public void verifyaddinventrypage(String Modelnumber,String itemtitel,String ItemDescription, String height,String width,String breadth,String colourname,String actualprice,String qty) throws Throwable {
		Thread.sleep(3000);
		//Actions ac=new Actions(driver);
		//ac.moveToElement(dashboar).click().perform();
		
		element.click();
		inventary.click();
		addinventry.click();
		modalenumber.sendKeys(Modelnumber);
		Itemtitel.sendKeys(itemtitel);
		Itemdescription.sendKeys(ItemDescription);
		hight.sendKeys(height);
		Width.sendKeys(width);
		Breadth.sendKeys(breadth);
		Colorname.sendKeys(colourname);
		Actualprice.sendKeys(actualprice);
		Thread.sleep(3000);

		Mrpfacter.click();
		Thread.sleep(2000);
		factorselect.click();
		Thread.sleep(2000);
		Qty.sendKeys(qty);
		Actions ac=new Actions(driver);
		ac.moveToElement(primeryimageupload).click().perform();
		

		
		Testdata.robot("\"C:\\Users\\sys\\Downloads\\stefan-chair-brown-black__0727320_pe735593_s5.avif\"");
	
		
	
		savebutton.click();
	
		
		

		
	

		
	}
	
	
		
		

		
	}
	
	
 
		 
	


