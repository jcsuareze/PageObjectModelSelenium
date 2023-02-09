package testPages.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	WebDriver driver;
	// LoginPage lp;
	LoginPage2 lp;

	@BeforeClass
	void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		// lp = new LoginPage(driver);
		lp = new LoginPage2(driver);
	}

	@Test(priority = 1)
	void checkLogo() {

		Assert.assertEquals(lp.checkLogoPresence(), true);

	}

	@Test(priority = 2)
	void testLogin() {

		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.clickSubmit();

		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@AfterClass
	void tearDown() {
		driver.quit();
	}
}
