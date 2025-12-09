package com.PageObjectManager;

import com.ProjectObjectModel.CheckOutPage;
import com.ProjectObjectModel.LoginPage;
import com.ProjectObjectModel.LogoutPage;
import com.ProjectObjectModel.SearchProductPage;
import com.Utility.FileReaderManager;

public class PageObjectManager {

	private FileReaderManager fileReader;
	private static PageObjectManager pageobjectmanager;
	private LoginPage loginpage;
	private SearchProductPage searchproduct;
	private CheckOutPage Checkoutpage;
	private LogoutPage Logoutpage;
	
	public CheckOutPage getCheckoutpage() {
		if(Checkoutpage == null) {
			Checkoutpage = new CheckOutPage();
		}return Checkoutpage;
	}
	public LogoutPage getLogoutpage() {
		if(Logoutpage == null) {
			Logoutpage = new LogoutPage();
		}return Logoutpage;
	}
	public FileReaderManager getFileReader() {
		if(fileReader == null) {
			fileReader = new FileReaderManager();
		}return fileReader;
	}
	public LoginPage getLoginPage() {
		if(loginpage == null) {
			loginpage = new LoginPage();
		}return loginpage;
	}
	public static PageObjectManager getpageobjectmanager() {
		if(pageobjectmanager == null) {
			pageobjectmanager = new PageObjectManager();
		}return pageobjectmanager;
	}
	public SearchProductPage getsearchproduct() {
		if(searchproduct == null) {
			searchproduct = new SearchProductPage();
		}return searchproduct;
	
		
	}
}