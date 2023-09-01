package Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosPage {

	
	WebDriver driver;
	
	public void abrirNavegador (String url) {
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	}

	public void clicar(By elementos) {
		driver.findElement(elementos).click();
	}	
		public void pausar (int tempo)throws InterruptedException{
		Thread.sleep(4000);
	}

	public void preencherTexto(By elementos, String Texto) {
		driver.findElement(elementos).sendKeys(Texto);
		
	}

}

