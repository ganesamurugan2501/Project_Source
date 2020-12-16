package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReusableClass {
	public static Select s;

	public static WebDriver driver;
	public static WebDriver launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\CoreJava\\Selenium\\Adactin\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		return driver;
	}
	
	public static void loadUrl(String url)
	{
		driver.get(url);
	}
	
	public static void fill(WebElement ele, String value)
	{
		ele.sendKeys(value);
	}
	
	public static void btnClick(WebElement ele)
	{
		ele.click();
	}

	public static void selectValue(WebElement ele, String val)
	{
		s=new Select(ele);
		s.selectByValue(val);
	}
	
	public static void getValue(WebElement ele) {
		System.out.println(ele.getAttribute("value"));
	}
	
	public static String excelRead(int row, int cell) throws IOException
	{
		File f=new File("D:\\CoreJava\\Selenium\\Adactin\\TestData\\Adactin_Input.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fis);
		Sheet sh=w.getSheet("Sheet1");
		Row r=sh.getRow(row);
		Cell c=r.getCell(cell);
		String value=c.getStringCellValue();
		return value;
	}
	
	public static void excelWrite(int row, int cell, String orderId) throws IOException
	{
		File f=new File("D:\\CoreJava\\Selenium\\Adactin\\TestData\\Adactin_Input.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fis);
		Sheet sh=w.getSheet("Sheet1");
		sh.createRow(row).createCell(cell).setCellValue(orderId);
		FileOutputStream fo=new FileOutputStream(f);
		w.write(fo);
		fo.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
