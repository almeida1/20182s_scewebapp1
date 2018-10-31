package com.scewebapp.scewebapp;

import static org.junit.Assert.*;

import org.junit.AfterClass;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import org.junit.Before;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UC01CadastrarLivro {

	private static WebDriver driver;

	// Método que inicia tudo que for necessário para o teste
	// Cria uma instância do navegador e abre a página inicial da DevMedia.
	@Before
	public void setUpTest() {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");

		driver = new ChromeDriver();

	}

	// Testa título
	@Test
	public void testaTituloDaPagina() {

		//driver.get("https://scewebapp.herokuapp.com/cadastrarLivro");
		driver.get("localhost:8080");
		assertEquals("SCEWebApp", driver.getTitle());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// Testa título
	@Test
	public void quandoEntraComDadosValidosRetornaMensagemOK() {
		driver.get("https://scewebapp.herokuapp.com/cadastrarLivro");
		WebElement elemento = driver.findElement(By.ByName.name("isbn"));
		elemento.sendKeys("1111");
		elemento = driver.findElement(By.ByName.name("titulo"));
		elemento.sendKeys("Engenharia de Software");
		elemento = driver.findElement(By.ByName.name("autor"));
		elemento.sendKeys("Pressam");

	}

	// Método que finaliza o teste, fechando a instância do WebDriver.
	@AfterClass
	public static void tearDownTest() {
		driver.quit();
	}

}
