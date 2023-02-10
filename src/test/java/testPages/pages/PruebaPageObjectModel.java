package testPages.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PruebaPageObjectModel {
	
	WebDriver driver;
	
	public PruebaPageObjectModel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='orangehrm-copyright-wrapper']//following-sibling::p")
	WebElement nombreUsuario;

}
