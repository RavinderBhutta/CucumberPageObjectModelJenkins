package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarsGuideSearchPageLocators {

	@FindBy(xpath = "//div[1]/div[2]/h1")
	private WebElement newCarForSaleHeader;

	public WebElement newCarForSaleHeader() {
		return newCarForSaleHeader;
	}

	@FindBy(xpath = "//div[1]/div[2]/h1")
	private WebElement findYourNextCarText;

	public WebElement findYourNextCarText() {
		return findYourNextCarText;
	}

	@FindBy(xpath = "//*[@id='make']")
	private WebElement carMakeField;

	public WebElement carMakeField() {
		return carMakeField;
	}

	@FindBy(xpath = "//*[@id='model']")
	private WebElement carModelField;

	public WebElement carModelField() {
		return carModelField;
	}

	@FindBy(xpath = "//*[@id='state']")
	private WebElement carLocationField;

	public WebElement carLocationField() {
		return carLocationField;
	}

	@FindBy(xpath = "//*[@id='region']")
	private WebElement carRegionField;

	public WebElement carRegionField() {
		return carRegionField;
	}

	@FindBy(xpath = "//button[contains(text(),'Show new vehicles')]")
	private WebElement showNewVehiclesBtn;

	public WebElement showNewVehiclesBtn() {
		return showNewVehiclesBtn;
	}

	@FindBy(xpath = "//h1[contains(text(),'6 BMW 3 Series for Sale in Central Coast, NSW')]")
	private WebElement searchResultsPageTitle;

	public WebElement searchResultsPageTitle() {
		return searchResultsPageTitle;
	}

	@FindBy(xpath = "//span[contains(text(),'BMW')]")
	private WebElement searchResultsPage;

	public WebElement searchResultsPage() {
		return searchResultsPage;
	}
}
