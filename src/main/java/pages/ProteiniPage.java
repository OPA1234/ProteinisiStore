package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProteiniPage extends HomePage {


	@FindBy(className = "rs-select-button")
	WebElement allProteinLocator;

	@FindBy(className = "product_filter_count")
	WebElement prodactFillterNumber;

	@FindBy(className = "l3-a")
	WebElement proteinsPageLocator;

	@FindBy(className = "rs-select-button")
	WebElement sortDropDown;

	{

	}

	public ProteiniPage(ChromeDriver driver) {
		super(driver);
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("We are not on ProteiniPage. Expected: " +
				Strings.PROTEINI_URL + ". Actual: " + currentUrl, currentUrl.equals(Strings.PROTEINI_URL));
	}

	public List<WebElement> getAllProteins() {
		List<WebElement> proteins = driver.findElements(By.className("product_list"));
		System.out.println(proteins.size());
		for (WebElement protein : proteins) {
			String currentName = protein.findElement(By.xpath("//*[@id=\"product_list\"]/div[1]/div/div[1]/a/span/img")).getText();
			System.out.println(proteins.indexOf(protein) + "." + currentName);
		}
		return proteins;
	}

	public  ProteiniPage proteinIsVisible() {
		if (driver.findElements(By.xpath("//*[@id=\"product_list\"]/div[1]/div/div[1]/a/span/img")).size() != 0) {
			System.out.println("Element is Present");
		} else {
			System.out.println("Element is Absent");
		}
		return this;
	}
	//public ProteiniPage getProteiniPage() {
		//mainMenuLocator.click();
		//categoryItems.click();
		//proteinsPageLocator.click();
		//allProteinLocator.click();



	public ProteiniPage getNumberOfProduct() {
		prodactFillterNumber.getText();
		return this;
	}
		}









