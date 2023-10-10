package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.stream.Stream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.base.Basetest;

public class Testdata extends Basetest {
	public static String[][]customerdata(String sheetname)throws Throwable{ 
		File file=new File("C:\\Users\\91810\\git\\EmpireHome_Crm\\Empirehomecrm\\src\\main\\java\\com\\testdata\\loginfunctionality testcases.xlsx");
		FileInputStream steram=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(Stream<T>);
		XSSFSheet sheet=workbook.getSheet(sheetname);
		intt rows=sheet.getPhysicalNumberOfRows()[Rows();
		int cells=sheet.getrow(1).getlastcellnum();
		String[][]data=new String[rows_1][cells];
		for(int i=0;i<rows-1;i++) {
			for(int j=0;j<cells;j++) {
				DataFormatter df =new dataformatter();
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
			
		}
		return data;
		
				
	}

}
