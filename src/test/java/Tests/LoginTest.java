package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.Strings;

public class LoginTest extends BaseTest {

	@Test

	public void testSuccessfullLogiIn() {
		ChromeDriver driver = openChromeDriver();
		try {
			LoginPage loginPage = new LoginPage(driver);
			loginPage.clickOnLogInIcon();
			loginPage.enterEmail(Strings.PETAR_USER);
			loginPage.enterPassword(Strings.VALID_PASSWORD);
			loginPage.clickSubmitButtonSuccess();
			String currentPageURL = driver.getCurrentUrl();
			Assert.assertTrue("We are not logged in. Expected url : " + Strings.HOME_URL +
					". Actual: " + currentPageURL, currentPageURL.contains(Strings.HOME_URL));
		} finally {
			driver.quit();
		}
	}



	@Test

	public void testUnSuccessfullLogiIn() {
		ChromeDriver driver = openChromeDriver();
		try {
			LoginPage loginPage = new LoginPage(driver);
			loginPage.clickOnLogInIcon();
			loginPage.enterEmail(Strings.PETAR_USER);
			loginPage.enterPassword(Strings.INVALID_PASSWORD);
			loginPage.clickSubmitButtonSuccess();
			String currentPageURL = driver.getCurrentUrl();
			Assert.assertTrue("We are not logged in. Expected url : " + Strings.HOME_URL +
					". Actual: " + currentPageURL, currentPageURL.contains(Strings.HOME_URL));
		} finally {
			driver.quit();
		}
	}
}






	//@Test
//	public void testUnSuccessfullLogiIn () {
	//	ChromeDriver driver = openChromeDriver();
	//	LoginPage loginPage = new LoginPage (driver);
	//	loginPage.clickOnLogInIcon();
	//	loginPage.enterEmail(Strings.PETAR_USER);
	//	loginPage.enterPassword(Strings.INVALID_PASSWORD);
	//	loginPage.clickSubmitButtonSuccess();
	//	loginPage.clickToCloseMessage();










