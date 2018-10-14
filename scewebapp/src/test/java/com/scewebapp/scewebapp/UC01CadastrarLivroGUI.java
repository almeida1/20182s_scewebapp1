package com.scewebapp.scewebapp;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UC01CadastrarLivroGUI {
	//https://support.mozilla.org/en-US/kb/install-older-version-of-firefox
	@Test
	public void testGoogleSearch() throws InterruptedException {
	  // Optional, if not specified, WebDriver will search your path for chromedriver.
	  //System.setProperty("webdriver.chrome.driver", "H://edson//spring boot//webdriver//chromedriver_win32//chromedriver.exe");

	 // WebDriver driver = new ChromeDriver();
	  System.setProperty("webdriver.gecko.driver", "WebContent/WEB-INF/lib/geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	 
	  
	  driver.get("http://localhost:8080");
//	  Thread.sleep(5000);  // Let the user actually see something!
//	  WebElement searchBox = driver.findElement(By.name("q"));
//	  searchBox.sendKeys("ChromeDriver");
//	  searchBox.submit();
//	  Thread.sleep(5000);  // Let the user actually see something!
//	  driver.quit();
	}
}
