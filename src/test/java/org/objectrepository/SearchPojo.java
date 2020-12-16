package org.objectrepository;

import java.util.List;

import org.base.ReusableClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPojo extends ReusableClass {
	
	public SearchPojo()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="location")
	private List<WebElement> location;
	
	@FindBy(id="hotels")
	private List<WebElement> hotels;
	
	@FindBy(id="room_type")
	private List<WebElement> roomType;
	
	@FindBy(id="room_nos")
	private List<WebElement> roomNos;
	
	@FindBy(id="datepick_in")
	private List<WebElement> dateIn;
	
	@FindBy(id="datepick_out")
	private List<WebElement> dateOut;
	
	@FindBy(id="adult_room")
	private List<WebElement> adulPer;
	
	@FindBy(id="child_room")
	private List<WebElement> childPer;
	
	@FindBy(id="Submit")
	private List<WebElement> search;

	public List<WebElement> getLocation() {
		return location;
	}

	public List<WebElement> getHotels() {
		return hotels;
	}

	public List<WebElement> getRoomType() {
		return roomType;
	}

	public List<WebElement> getRoomNos() {
		return roomNos;
	}

	public List<WebElement> getDateIn() {
		return dateIn;
	}

	public List<WebElement> getDateOut() {
		return dateOut;
	}

	public List<WebElement> getAdulPer() {
		return adulPer;
	}

	public List<WebElement> getChildPer() {
		return childPer;
	}

	public List<WebElement> getSearch() {
		return search;
	}
}
