package com.ProjectObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Base_Class;
import com.InterfaceElements.LogOutPageInterfaceELement;

public class LogoutPage extends Base_Class implements LogOutPageInterfaceELement {
	@FindBy(id = logout_id)
	private WebElement logOut;
	
	public LogoutPage() {
		PageFactory.initElements(driver, this);
	}
	public void logOutPage() {
		implicitwait(20);
		elementclick(logOut);
	}
}
