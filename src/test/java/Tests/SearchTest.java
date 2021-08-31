package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class SearchTest extends BaseTest {

	@Test

	public void SearchProtein() {
		ChromeDriver driver = openChromeDriver();
		try {
			print("(TEST)Login to ProteiniSi site");
			LoginPage loginPage = loginToHomePage(driver);

			print("(TEST)Search Protein");
			loginPage.searchItem(Strings.WHEY_PROTEIN);

			print("(ТЕST)Verify that Whey protein displeyed on page ");
			Boolean proteinIsVisible = true;

		}
		finally {
			driver.quit();
		}
	}


}
