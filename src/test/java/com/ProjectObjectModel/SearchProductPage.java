package com.ProjectObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Base_Class;
import com.InterfaceElements.SearchProductInterfaceElements;

public class SearchProductPage extends Base_Class implements SearchProductInterfaceElements {

	@FindBy(xpath = laptop_Xpath)
	private WebElement laptop;
	
	@FindBy(linkText = model_linkText)
	private WebElement model;
	
	@FindBy(xpath = cart_Xpath)
	private WebElement cart;
	
	public SearchProductPage() {
		PageFactory.initElements(driver, this);
	}
	public void searchproduct() throws InterruptedException {
		elementclick(laptop);
		Thread.sleep(2000);
		elementclick(model);
		Thread.sleep(2000);
		elementclick(cart);
		Thread.sleep(2000);
		System.out.println("Product added successfully");
		getAlert();
	}
}
