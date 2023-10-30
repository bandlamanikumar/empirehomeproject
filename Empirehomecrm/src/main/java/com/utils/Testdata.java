package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.stream.Stream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	}
