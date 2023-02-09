package testPages.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	// Esta es una forma de hacer POM sin usar PAGE FACTORY

	// En esta clase solo se introducen los localizadores de los elementos y los
	// metodos usa el constructor para recibir una instancia del webdriver
	/****
	 * driver.findElement(By.id('xyz')).accion(); *
	 * **************************************** La idea es dividir esta instruccion
	 * By nombreWebElement = By.id('xyz');
	 */
	// instancia driver con alcance de clase
	WebDriver driver;
	WebDriverWait myWait;

	// Constructor que usa driver
	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	// localizadores
	By img_logo_loc = By.xpath("//img[@alt='company-branding']");
	By txt_userName_loc = By.name("username");
	By txt_password_loc = By.cssSelector("input[placeholder='Password']");
	By btn_submit_loc = By.xpath("//button[normalize-space()='Login']");

	// Action Methods
	public void setUserName(String userName) {
		driver.findElement(txt_userName_loc).sendKeys(userName);
	}

	public void setPassword(String password) {
		driver.findElement(txt_password_loc).sendKeys(password);
	}

	public void clickSubmit() {
		driver.findElement(btn_submit_loc).click();
	}

	public boolean checkLogoPresence() {

		boolean status = driver.findElement(img_logo_loc).isEnabled();

		return status;

	}

}
