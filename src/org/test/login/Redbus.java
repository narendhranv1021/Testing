package org.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Workspaces\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in");
		WebElement fromTxt = driver.findElement(By.id("src"));
		fromTxt.sendKeys("chennai");
		WebElement toTxt = driver.findElement(By.id("dest"));
		toTxt.sendKeys("tirunelveli");

	}
}
