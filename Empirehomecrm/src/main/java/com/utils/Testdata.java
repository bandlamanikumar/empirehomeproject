package com.utils;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.stream.Stream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.base.Basetest;

public class Testdata extends Basetest {

	public static String[][] Customerdata(String sheetname) throws Throwable {

		File file = new File("./src/main/java/com/testdata/ADDTOPRODUCT.xlsx");
		FileInputStream stream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(stream);
		XSSFSheet sheet = workbook.getSheet(sheetname);
		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(1).getLastCellNum();

		String[][] data = new String[rows - 1][cells];

		for (int i = 0; i < rows - 1; i++) {
			for (int j = 0; j < cells; j++) {

				DataFormatter df = new DataFormatter();

				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));

			}
		}
		return data;

	}
	
	public static void dropdowns(WebElement value,int text) {
		Select sl=new Select(value);
		sl.deselectAll();
	}


public static void actions(WebDriver driver,WebElement value) {
	Actions ac = new Actions(driver);
	ac.moveToElement(value).click().perform();;
}

public static void robot(String filepath) throws Throwable {
	
	Robot rb = new Robot();
	rb.delay(3000);
	
	StringSelection path = new StringSelection(filepath);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
	
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	 
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
}

public static void scroll() {
	
	JavascriptExecutor js = (JavascriptExecutor)driver;	
	js.executeScript("window.scrollBy(0,1000)");
}
	

}







