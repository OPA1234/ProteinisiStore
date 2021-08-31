package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


	public class HomePage extends BasePage {

		@FindBy(className = "hero-content row")
		WebElement HomeItems;

		@FindBy(xpath = "//*[@id=\"main-menu\"]/nav/ul[1]/li[1]")
		WebElement categoryItems;

		@FindBy(className = "main-menu")
		WebElement mainMenuLocator;


		@FindBy(className = "featured-section")
		WebElement discountArticalMenu;


		public HomePage(ChromeDriver driver) {
			super(driver);
			String currentUrl = driver.getCurrentUrl();
			Assert.assertTrue("We are not on Inventory page. Expected: " +
					Strings.HOME_URL + ". Actual: " + currentUrl, currentUrl.equals(Strings.HOME_URL));
		}

		public HomePage discountArticalMenu() {
			discountArticalMenu.isDisplayed();
			return this;
		}

		public HomePage redirectAction() {
			discountArticalMenu.click();
			return new DiscountPage(driver);
		}

		}


