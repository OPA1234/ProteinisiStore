package Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.LoginPage;
import pages.ProteiniPage;
import pages.Strings;

public class BaseTest {
	ChromeDriver driver = null;

	public ChromeDriver openChromeDriver() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments(new String[]{"--start-maximized"});
		options.addArguments(new String[]{"--ignore-certificate-errors"});
		options.addArguments(new String[]{"--disable-popup-blocking"});
		options.addArguments(new String[]{"--incognito"});
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		ChromeDriver driver = new ChromeDriver(options);
		return driver;
	}

	public LoginPage loginToHomePage(ChromeDriver driver) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickOnLogInIcon();
		loginPage.enterEmail(Strings.PETAR_USER);
		loginPage.enterPassword(Strings.VALID_PASSWORD);
		loginPage.clickSubmitButtonSuccess();
		return loginPage;
	}

	public void print(String s) {
		System.out.println(s);
	}

}





