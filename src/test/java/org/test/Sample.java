package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.test.baseclass.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends BaseClass {

	public static void main(String[] args) {

		browserLaunch("chrome");
		urlLaunch("https://www.facebook.com/");
		implicitWait(20);
		
		WebElement textusername = findElement("id", "email");
		fillTextBox(textusername, "Bhuvana");
		
		WebElement textpassword = findElement("id", "pass");
		fillTextBox(textpassword, "12345");
		
		driver.navigate().refresh();
		
		WebElement textusename1 = findElement("id", "email");
		fillTextBox(textusename1, "mithra");
		
		WebElement textpassword1 = findElement("id", "pass");
		fillTextBox(textpassword1, "1234567");
		
	
		
	}
}

//		driver.get("https://www.facebook.com/");
//
//		WebElement textUsername = driver.findElement(By.id("email"));
//		textUsername.sendKeys("Mithra");
//
//		WebElement textPassword = driver.findElement(By.id("pass"));
//		textPassword.sendKeys("12345");
//
//		WebElement btnLogin = driver.findElement(By.name("login"));
//		btnLogin.click();
//
//		driver.quit();
//
//	}

	
