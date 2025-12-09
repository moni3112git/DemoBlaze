package com.ProjectObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Base_Class;
import com.InterfaceElements.LoginPageInterfaceElements;
import com.PageObjectManager.PageObjectManager;

public class LoginPage extends Base_Class implements LoginPageInterfaceElements{

	@FindBy(linkText = login_linkText)
	private WebElement login;
	
	@FindBy(id = username_id)
	private WebElement username;
	
	@FindBy(css = password_css)
	private WebElement password;
	
	@FindBy(xpath = signin_Xpath)
	private WebElement signin;
	
	@FindBy(id = title_id)
	private WebElement title;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public void validLogin() throws IOException, InterruptedException {
		elementclick(login);
		implicitwait(20);
		passInput(username,PageObjectManager.getpageobjectmanager().getFileReader().getDataProperty("Username"));
		passInput(password,PageObjectManager.getpageobjectmanager().getFileReader().getDataProperty("Password"));
		elementclick(signin);
		Thread.sleep(5000);
		getText(title);
		
	}
}
