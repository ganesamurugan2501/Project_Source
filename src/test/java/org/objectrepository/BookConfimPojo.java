package org.objectrepository;

import java.util.List;

import org.base.ReusableClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookConfimPojo extends ReusableClass {

	public BookConfimPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement orderNumber;

	public WebElement getOrderNo()
	{
		return orderNumber;
	}
	
	
	
	
	
	
	
	
}
