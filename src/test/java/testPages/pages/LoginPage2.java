package testPages.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage2 {
	// Esta es una forma de hacer POM usando PAGE FACTORY
	// En esta version no se usa FINDELEMENTS
	WebDriver driver;
	WebDriverWait myWait; 

	// Se debe especificar la clase PageFactory
	public LoginPage2(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// Se captura los WebElements Directamente
	// @FindBy (localizadores) WebElement + identificacion
	@FindBy(xpath = "//img[@alt='company-branding']")
	WebElement img_logo; // <--------- WebElement, No localizador

	@FindBy(name = "username")
	WebElement txt_userName;

	@FindBy(css = "input[placeholder='Password']")
	WebElement txt_password;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement btn_submit;
	
	@FindBy(tagName="a") //Para capturar varios elementos 
	List<WebElement> links;

	// Action Methods
	public void setUserName(String userName) {
		txt_userName.sendKeys(userName);
	}

	public void setPassword(String password) {
		txt_password.sendKeys(password);
	}

	public void clickSubmit() {
		btn_submit.click();
	}

	public boolean checkLogoPresence() {

		myWait.until(ExpectedConditions.visibilityOf(img_logo));
		boolean status = img_logo.isDisplayed();

		return status;

	}
}
