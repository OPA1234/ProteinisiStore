package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "login-form-email")
	WebElement eMailField;

	@FindBy(id = "login-form-pass")
	WebElement passwordField;

	@FindBy(id = "btn_login-form_prijava")
	WebElement logInButton;

	@FindBy(className = "login-icon")
	WebElement loginLocator;

	@FindBy(className = "modal-close")
	WebElement errorMessage;

	@FindBy(id = "search-input")
	WebElement searchfieldLocator;

	@FindBy(xpath = "/html/body/div[1]/div[1]/main/section[2]/div/div[2]")
	WebElement discountArticleMenu;

	@FindBy(xpath = "//*[@id=\"main-menu\"]/nav")
	WebElement mainMenuLocator;

	@FindBy(xpath = "//*[@id=\"categories_list\"]/li[3]")
	WebElement proteiniPageLocator;


	ChromeDriver driver = null;

	public LoginPage(ChromeDriver driver) {
		driver.get("https://www.proteini.si/rs/");
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public LoginPage enterEmail(String eMail) {
		eMailField.sendKeys(eMail);
		return this;
	}

	public LoginPage clickOnLogInIcon() {
		loginLocator.click();
		return this;
	}

	public LoginPage enterPassword(String password) {
		passwordField.sendKeys(password);
		return this;
	}

	public LoginPage clickSubmitButtonSuccess() {
		logInButton.click();
		return this;

	}

	public LoginPage clickToCloseMessage() {
		errorMessage.click();
		return this;
	}

	public LoginPage searchItem(String wheyProtein) {
		searchfieldLocator.sendKeys("");
		return this;
	}

	public ProteiniPage goToProteiniPage() {
		mainMenuLocator.click();
		proteiniPageLocator.click();
		return new ProteiniPage(driver);
	}



	public DiscountPage redirectAction() {
		discountArticleMenu.click();
		return new DiscountPage(driver);
	}

}


