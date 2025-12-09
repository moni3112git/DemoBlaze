package com.DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utility.ReadExcelData;

public class TestRunner {

	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		String search = ReadExcelData.readParticularData(5, 0);
		WebElement search_box = driver.findElement(By.xpath("//input[@name='search_query']"));
		search_box.sendKeys(search);
		search_box.clear();
		String search1 = ReadExcelData.readParticularData(6, 0);
		search_box.sendKeys(search1);
		driver.findElement(By.xpath("//button[@title='Search']")).click();
	}
}
