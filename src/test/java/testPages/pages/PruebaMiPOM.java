package testPages.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PruebaMiPOM {
	
	WebDriver driver;
	PageObjectModelMetodos metodos;

	@BeforeClass
	void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		metodos = new PageObjectModelMetodos(driver);

	}
	@Test
	@Parameters({"CopyRight"})
	void pruebaTexto(String CopyRight) {
		Assert.assertEquals(metodos.getText(), CopyRight);
	}
	
	@AfterClass
	void cierra() {
		//driver.quit();
	}

}
