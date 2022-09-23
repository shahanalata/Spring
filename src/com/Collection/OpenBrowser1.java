package com.Collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser1 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\shahana\\Downloads"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");

	}

}
