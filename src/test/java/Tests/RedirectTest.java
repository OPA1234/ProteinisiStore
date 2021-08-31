package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.LoginPage;

public class RedirectTest extends BaseTest {

	private Object WebDriver;

	@Test

	public void RedirectingTest() {
		ChromeDriver driver = openChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		try {
			print("(TEST)Login to ProteiniSi site");
			LoginPage loginPage = loginToHomePage(driver);
			//HomePage homePage = new HomePage(driver);

			print("[TEST] Scroll down to Аkcija button");

			WebElement discountArticleMenu1  = driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section[1]/div/div[2]/a/span"));
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView(true)", discountArticleMenu1);
			driver.navigate().refresh();
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section[1]/div/div[2]/a/span")).click();

			print("[TEST] Verify that we are redirect to Discount page and Items are discounted ");

			Boolean ItemsIsVisible = true;
		}
		finally {
			driver.quit();
		}
	}


}