package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.ProteiniPage;
import pages.Strings;

import java.util.List;

public class ComparingNumberOfItemsTest extends BaseTest {

	@Test

	public void testForComparingNumberOfItems() {
		ChromeDriver driver = openChromeDriver();
		LoginPage loginPage = loginToHomePage(driver);
			ProteiniPage proteiniPage = new ProteiniPage(driver);
			proteiniPage.getNumberOfProduct();
			List<WebElement> allProteinsOnPage = proteiniPage.getAllProteins();
			Assert.assertEquals("We expected that the numbers will be equals", "[proteinPage.getNumberOfProduct()]", "[allProteinsOnPage]");
			System.out.println("Test is passed");

		}
	}

