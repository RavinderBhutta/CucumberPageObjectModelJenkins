package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarsGuideUsedSearchPageLocators {

	@FindBy(xpath = "//a[text()='Used']")
	private WebElement buyUsedCarLink;

	public WebElement buyUsedCarLink() {
		return buyUsedCarLink;
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

	@FindBy(xpath = "//button[contains(text(),'Show used vehicles')]")
	private WebElement showUsedVehiclesBtn;

	public WebElement showUsedVehiclesBtn() {
		return showUsedVehiclesBtn;
	}

	@FindBy(xpath = "//h1[contains(text(),'3 Audi A7s for Sale in Brisbane, QLD')]")
	private WebElement usedCarResultsPageTitle;

	public WebElement usedCarResultsPageTitle() {
		return usedCarResultsPageTitle;
	}

	@FindBy(xpath = "//span[contains(text(),'Audi')]")
	private WebElement usedSearchResultsPage;

	public WebElement usedSearchResultsPage() {
		return usedSearchResultsPage;
	}
}
