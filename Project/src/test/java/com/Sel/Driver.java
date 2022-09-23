package com.Sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/login"); //userid: mailto:user@phptravels.com___pass: demouser
        driver.manage().window().maximize();
        driver.quit();
		//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shahana\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		//driver.findElement( By.id("input")).sendKeys("Florida");
		//System.out.println(driver.getCurrentUrl());

	}

}
