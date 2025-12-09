package com.runner;

import java.io.IOException;

import com.BaseClass.Base_Class;
import com.PageObjectManager.PageObjectManager;

public class Test_Class extends Base_Class {
	public static void main(String []args) throws Exception
	{
		launchBrowser(PageObjectManager.getpageobjectmanager().getFileReader().getDataProperty("Browser"));
		launchurl(PageObjectManager.getpageobjectmanager().getFileReader().getDataProperty("Url"));
		PageObjectManager.getpageobjectmanager().getLoginPage().validLogin();
		PageObjectManager.getpageobjectmanager().getsearchproduct().searchproduct();  
		PageObjectManager.getpageobjectmanager().getCheckoutpage().CheckOutPage();
	}
}
