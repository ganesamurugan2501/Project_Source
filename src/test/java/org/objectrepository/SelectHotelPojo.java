package org.objectrepository;

import java.util.List;

import org.base.ReusableClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPojo extends ReusableClass  {
	
	public SelectHotelPojo()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private List<WebElement> radioButton;

	@FindBy(id="continue")
	private List<WebElement> btnContinue;

	public List<WebElement> getRadioButton() {
		return radioButton;
	}

	public List<WebElement> getBtnContinue() {
		return btnContinue;
	}
	
	
	
	
	
	
	

}
