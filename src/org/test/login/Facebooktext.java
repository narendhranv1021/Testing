package org.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooktext {
public static void main(String[]args){
	System.setProperty("webdriver.chrome.driver","E:\\Workspaces\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
WebElement createTxt= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[1]/div/div"));
String text=createTxt.getText();
System.out.println(text);
}
}
