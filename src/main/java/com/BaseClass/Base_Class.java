package com.BaseClass;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public abstract class Base_Class {
	public static WebDriver driver;
	protected static WebDriver launchBrowser(String browsername) {
		try {
			if(browsername.equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver();		
			}else if(browsername.equalsIgnoreCase("Edge")) {
				driver = new EdgeDriver();
			}else if(browsername.equalsIgnoreCase("Firefox")) {
				driver = new FirefoxDriver();
			}
		}
		catch(Exception e)
		{
			Assert.fail("Error: Occured while Launching browser");
		}
		driver.manage().window().maximize();
		return driver;
	}
	protected static void passInput(WebElement element, String text) {
		try {
			element.click();
			element.sendKeys(text);
		} catch (Exception e) {
			Assert.fail("Error:Occured while passing inputs");
		}
	}
	protected static void elementclick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			Assert.fail("Error:Occured while clicking element");
		}
	}
	protected static void launchurl(String url)
	{
		try {
			driver.get(url);
			
		}
		catch( Exception e)
		{
			Assert.fail("Error: Occured while Launching URL");
		}
	}
	protected static void Closebrowser()
	{
		try {
			driver.close();
		}
		catch(Exception e){
			Assert.fail("Error: Occured while closing browser");
		}
	}
	protected static void getUrl()
	{
		try {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		}catch(Exception e){
			Assert.fail("Error: Occured while getting current url");
		}
	}
	protected static void getText(WebElement element)
	{
		try {
			String gettext = element.getText();
			System.out.println(gettext);
		}catch(Exception e) {
			Assert.fail("Error: Occured while getting text");
		}
	}
	protected static void getAttribute(WebElement element,String attributename)
	{
		try {
			String attribute_name = element.getAttribute(attributename);
			System.out.println(attribute_name);
		}catch(Exception e) {
			Assert.fail("Error: Occured while getting Attribute");
		}
	}
	protected static void getAlert()
	{
		try {
			driver.switchTo().alert().accept();
		}catch(Exception e) {
			Assert.fail("Error: Occured while getting alert");
		}
	}
	protected static void navigate_To(String value,String url)
	{
		try {
			if(value.equalsIgnoreCase("to")) {
				driver.navigate().to(url);
			}else if(value.equalsIgnoreCase("back")) {
				driver.navigate().back();
			}else if(value.equalsIgnoreCase("forward")) {
				driver.navigate().forward();
			}else if(value.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();
			}
		}catch(Exception e) {
			Assert.fail("Error: Occured while navigating");
		}
	}
	protected static void Windows_Handling(int num) {
		try {
		List<String> allwindows = new ArrayList <>(driver.getWindowHandles());	
		driver.switchTo().window(allwindows.get(num));
		}catch(Exception e) {
			Assert.fail("Error: Occured while windows handling");
		}
	}
	protected static void selectbyoption(WebElement element,String type, String value) {
		try {
			Select select = new Select(element);
			if(type.equalsIgnoreCase("text")) {
					select.selectByVisibleText(value);
			}else if(type.equalsIgnoreCase("index")) {
				select.selectByIndex(Integer.parseInt(value));
			}else if(type.equalsIgnoreCase("value")) {
				select.selectByValue(value);
			}
		}catch(Exception e) {
			Assert.fail("Error: Occured while selection by option");
		}
	}
	protected static void implicitwait(int seconds) {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
		} catch (Exception e) {
			Assert.fail();
		}
	}
	protected static void explicitwait(String value, int seconds) {
		try {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(seconds));
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURE DURING EXPLICITYWAIT ");
		}
	}
}
