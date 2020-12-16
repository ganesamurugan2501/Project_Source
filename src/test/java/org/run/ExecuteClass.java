package org.run;

import java.io.IOException;

import org.base.ReusableClass;
import org.objectrepository.BookAHotel;
import org.objectrepository.BookConfimPojo;
import org.objectrepository.ChangePasswordPojo;
import org.objectrepository.LoginPojo;
import org.objectrepository.SearchPojo;
import org.objectrepository.SelectHotelPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExecuteClass extends ReusableClass {
	 
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver d=launchBrowser();
		loadUrl("http://adactinhotelapp.com/index.php");
		LoginPojo l=new LoginPojo();
		SearchPojo s=new SearchPojo();
		SelectHotelPojo sh=new SelectHotelPojo();
		BookAHotel bh=new BookAHotel();
		BookConfimPojo bc=new BookConfimPojo();

		//Login Page
		fill(l.getUserName(), excelRead(1,0));
		fill(l.getPassWord().get(0), excelRead(1,1));
		btnClick(l.getLogin());
		
		/*//Search Page
		selectValue(s.getLocation().get(0),excelRead(1,2));
		selectValue(s.getHotels().get(0),excelRead(1,3));
		selectValue(s.getRoomType().get(0),excelRead(1,4));
		selectValue(s.getRoomNos().get(0),excelRead(1,5));
		fill(s.getDateIn().get(0), excelRead(1,6));
		fill(s.getDateOut().get(0), excelRead(1,7));
		selectValue(s.getAdulPer().get(0), excelRead(1,8));
		selectValue(s.getChildPer().get(0), excelRead(1,9));
		btnClick(s.getSearch().get(0));
		
		//Select Hotel Page
		btnClick(sh.getRadioButton().get(0));
		btnClick(sh.getBtnContinue().get(0));
		
		//Book A Hotel
		fill(bh.getFirstName().get(0), excelRead(1,10));
		fill(bh.getLastName().get(0), excelRead(1,11));
		fill(bh.getAddress().get(0), excelRead(1,12));
		fill(bh.getCcNum().get(0), excelRead(1,13));
		Thread.sleep(2000);
		selectValue(bh.getCcType().get(0), excelRead(1,14));

		selectValue(bh.getCcExpMonth().get(0), excelRead(1,15));
		Thread.sleep(2000);
		selectValue(bh.getCcExpYear().get(0), excelRead(1,16));
		fill(bh.getCvv().get(0), excelRead(1,17));
		WebElement bookNow=driver.findElement(By.id("book_now"));
		btnClick(bh.getBookNow().get(0));
		Thread.sleep(4000);
		//String orderId=driver.findElement(By.xpath("(//table//tr//td)[46]")).getAttribute("value");
		Thread.sleep(1000);
		//System.out.println(orderId);		
		//JavascriptExecutor js=(JavascriptExecutor)(d);
		//js.executeScript("document.getElementById('order_no').setAttribute('value','NEW_VALUE');");
		//System.out.print("value: "+driver.findElement(By.id("order_no")).getAttribute("value"));
		String v=bc.getOrderNo().getAttribute("value");
		System.out.println(v);
		Thread.sleep(1000);
		excelWrite(5,3,v);*/
		
	//Change Password	
		ChangePasswordPojo cp=new ChangePasswordPojo();
		btnClick(cp.getChangePassword());
		Thread.sleep(1000);
		fill(cp.getCurrPass(),excelRead(1,18));
		fill(cp.getNewPass().get(1),excelRead(1,19));
		fill(cp.getConfirmPass().get(1),excelRead(1,20));
		btnClick(cp.getSubmit().get(0));
		
		
		
		
		
	}

}
