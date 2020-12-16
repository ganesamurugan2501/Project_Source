package org.objectrepository;

import java.util.List;

import org.base.ReusableClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordPojo extends ReusableClass {

	public ChangePasswordPojo()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Change Password']")
	private WebElement changePassword;
	
	@CacheLookup
	@FindBys({
		
		@FindBy(xpath="//input[@type='password']"),
		@FindBy(xpath="//input[@id='current_pass']")	
	})
	private WebElement currPass;
	
	@CacheLookup
	@FindAll({
		@FindBy(name="new_password"),
		@FindBy(id="new_password")

	})
	private List<WebElement> newPass;
	
	@CacheLookup
	@FindBys({@FindBy(xpath="//input[@type='password']"),
			@FindBy(xpath="//input[@name='re_password']")
			})
	private List<WebElement> confirmPass;
	
	@FindAll({
		@FindBy(xpath="//input[@type='submit']"),
		@FindBy(name="change_password_Submit")
	})
	private List<WebElement> submit;
	
	public WebElement getChangePassword() {
		return changePassword;
	}

	public WebElement getCurrPass() {
		return currPass;
	}

	public List<WebElement> getNewPass() {
		return newPass;
	}

	public List<WebElement> getConfirmPass() {
		return confirmPass;
	}

	public List<WebElement> getSubmit() {
		return submit;
	}

}
