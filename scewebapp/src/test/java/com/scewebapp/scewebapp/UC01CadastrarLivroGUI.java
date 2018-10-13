package com.scewebapp.scewebapp;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UC01CadastrarLivroGUI {
	@Test
	public void testGoogleSearch() throws InterruptedException {
	  // Optional, if not specified, WebDriver will search your path for chromedriver.
	  System.setProperty("webdriver.chrome.driver", "H://edson//spring boot//webdriver//chromedriver_win32");

	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.google.com/xhtml");
	  Thread.sleep(5000);  // Let the user actually see something!
	  WebElement searchBox = driver.findElement(By.name("q"));
	  searchBox.sendKeys("ChromeDriver");
	  searchBox.submit();
	  Thread.sleep(5000);  // Let the user actually see something!
	  driver.quit();
	}
}
