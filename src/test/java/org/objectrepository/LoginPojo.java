package org.objectrepository;

import java.util.List;

import org.base.ReusableClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends ReusableClass {

	public LoginPojo()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="password")
	private List<WebElement> passWord;
	
	@FindBy(id="login")
	private WebElement login;

	public WebElement getUserName() {
		return userName;
	}

	public List<WebElement> getPassWord() {
		return passWord;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
