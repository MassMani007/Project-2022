package org.test.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\W\\eclipse-workspace\\FaceBook\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement textfrom= driver.findElement(By.className("db"));
		textfrom.sendKeys("Devakottai");
		WebElement textto=driver.findElement(By.id("dest"));
		textto.sendKeys("Chennai");
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
