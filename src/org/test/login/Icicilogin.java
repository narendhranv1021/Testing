package org.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icicilogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Workspaces\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		WebElement txtUserName = driver.findElement(By.xpath("//input[@name=\"DUMMY1\"]"));
		txtUserName.sendKeys("narendhran");
		WebElement btnArrow = driver.findElement(By.xpath("(//img[@class=\"goahead\"])[1]"));
		btnArrow.click();
		WebElement txtPassword = driver.findElement(By.xpath("//input[@title=\"Password\"]"));
		txtPassword.sendKeys("pass123456");
	}
}
