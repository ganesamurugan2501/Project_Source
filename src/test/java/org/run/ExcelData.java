package org.run;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static void main(String[] args) throws IOException {
		File f=new File("D:\\CoreJava\\Selenium\\Adactin\\TestData\\InputData.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		Workbook work=new XSSFWorkbook(fis);
		Sheet sh=work.getSheet("Sheet1");
		/*Row r=sh.getRow(1);
		Cell c=r.getCell(0);
		System.out.println(c);*/
		/*int row=sh.getPhysicalNumberOfRows();
		System.out.println(row);
		
		Row r=sh.getRow(0);
		int cell=r.getPhysicalNumberOfCells();
		System.out.println(cell);*/
		
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			
			Row r=sh.getRow(i);
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c=r.getCell(j);
				System.out.println(c);
			}
			
		}
		
		
		
		
	}

}
