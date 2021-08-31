package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DiscountPage extends HomePage {

	@FindBy(xpath = "/html/body/div[1]/div[1]/main/div[2]/div[1]/div[1]")
	WebElement ishranaDiscountLocator;

	@FindBy(xpath = "//*[@id=\"product_list\"]/div[1]/div/div[2]")
	WebElement discountFlagLocator;

	public DiscountPage(ChromeDriver driver) {
		super(driver);
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("We are not on Inventory page. Expected: " +
				Strings.DISCOUNT_URL + ". Actual: " + currentUrl, currentUrl.equals(Strings.DISCOUNT_URL));
	}

	public List<WebElement> getAllIshranaItems() {
		List<WebElement> items = driver.findElements(By.xpath("//*[@id=\"product_list\"]"));
		System.out.println(items.size());
		for (WebElement item : items) {
			String currentName = item.findElement(By.xpath("//*[@id=\"product_list\"]/div[1]/div/div[1]/a")).getText();
			System.out.println(items.indexOf(item) + "." + currentName);
		}
		return items;
	}

	public DiscountPage ItemsIsVisible() {
		if (driver.findElements(By.xpath("//*[@id=\"product_list\"]/div[1]/div/div[1]/a/span")).size() != 0) {
			System.out.println("Element is Present");
		} else {
			System.out.println("Element is Absent");
		}
		return this;


	}
}