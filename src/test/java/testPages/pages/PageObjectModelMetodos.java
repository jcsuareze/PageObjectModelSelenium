package testPages.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectModelMetodos {

	PruebaPageObjectModel pomTest;
	/***********************webElements********************************/
	
	WebElement pasaTexto1;
	
	
	public PageObjectModelMetodos(WebDriver driver) {
		
		pomTest  = new PruebaPageObjectModel(driver);
		
	}
	
	
	
	String getText() {
		
		pasaTexto1 = pomTest.nombreUsuario;
		String pasaTexto = pasaTexto1.getText();
		return pasaTexto;
	}
}
