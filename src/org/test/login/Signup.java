package org.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup {
			public static void main (String[] args) {
			System.setProperty("webdriver.chrome.driver","E:\\Workspaces\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement sgnup =driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		sgnup.click();
		WebElement tooltip=driver.findElement(By.xpath("//div[@class=\"_5633 _5634 _53ij\"]"));
		String tiptext = tooltip.getText();
		System.out.println(tiptext);
		}
		}


