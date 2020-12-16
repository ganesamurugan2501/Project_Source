package org.objectrepository;

import java.util.List;

import org.base.ReusableClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel extends ReusableClass{

	public BookAHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private List<WebElement> firstName;

	@FindBy(id="last_name")
	private List<WebElement> lastName;

	@FindBy(id="address")
	private List<WebElement> address;

	@FindBy(id="cc_num")
	private List<WebElement> ccNum;

	@FindBy(id="cc_type")
	private List<WebElement> ccType;

	@FindBy(id="cc_exp_month")
	private List<WebElement> ccExpMonth;

	@FindBy(id="cc_exp_year")
	private List<WebElement> ccExpYear;

	@FindBy(id="cc_cvv")
	private List<WebElement> cvv;

	@FindBy(id="book_now")
	private List<WebElement> bookNow;

	public List<WebElement> getFirstName() {
		return firstName;
	}

	public List<WebElement> getLastName() {
		return lastName;
	}

	public List<WebElement> getAddress() {
		return address;
	}

	public List<WebElement> getCcNum() {
		return ccNum;
	}

	public List<WebElement> getCcType() {
		return ccType;
	}

	public List<WebElement> getCcExpMonth() {
		return ccExpMonth;
	}

	public List<WebElement> getCcExpYear() {
		return ccExpYear;
	}

	public List<WebElement> getCvv() {
		return cvv;
	}

	public List<WebElement> getBookNow() {
		return bookNow;
	}

	
	
	
	
	
	
}
