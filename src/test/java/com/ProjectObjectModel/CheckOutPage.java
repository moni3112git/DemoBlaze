package com.ProjectObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Base_Class;
import com.InterfaceElements.CheckoutProductInterfaceElement;
import com.PageObjectManager.PageObjectManager;

public class CheckOutPage extends Base_Class implements CheckoutProductInterfaceElement {

	@FindBy(xpath = cart_xpath)
	private WebElement cart;
	@FindBy(xpath = placeOrder_xpath)
	private WebElement placeOrder;
	@FindBy(id = nameDetails_Id)
	private WebElement nameDetails;
	@FindBy(id = country_Id)
	private WebElement country;
	@FindBy(id = city_Id)
	private WebElement city;
	@FindBy(id = card_Id)
	private WebElement card;
	@FindBy(id = month_Id)
	private WebElement month;
	@FindBy(id = year_Id)
	private WebElement year;
	@FindBy(xpath = purchase_Xpath)
	private WebElement purchase;
	@FindBy(xpath = okButton_Xpath)
	private WebElement ok;
	
	public CheckOutPage() {
		PageFactory.initElements(driver, this);
	}
	public void CheckOutPage() throws InterruptedException, IOException {
		implicitwait(20);
		//Thread.sleep(3000);
		//getAlert();
		Thread.sleep(1000);
		elementclick(cart);
		elementclick(placeOrder);
		passInput(nameDetails,PageObjectManager.getpageobjectmanager().getFileReader().getDataProperty("nameDetail"));
		passInput(country,PageObjectManager.getpageobjectmanager().getFileReader().getDataProperty("country"));
		passInput(city,PageObjectManager.getpageobjectmanager().getFileReader().getDataProperty("city"));
		passInput(card,PageObjectManager.getpageobjectmanager().getFileReader().getDataProperty("card"));
		passInput(month,PageObjectManager.getpageobjectmanager().getFileReader().getDataProperty("month"));
		passInput(year,PageObjectManager.getpageobjectmanager().getFileReader().getDataProperty("year"));
		elementclick(purchase);
		getAlert();
		elementclick(ok);
		
	}
}