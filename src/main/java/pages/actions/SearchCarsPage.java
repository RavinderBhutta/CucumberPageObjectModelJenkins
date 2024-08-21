package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import pages.locators.CarsGuideHomePageLocators;
import pages.locators.CarsGuideSearchPageLocators;
import utilities.SeleniumDriver;

public class SearchCarsPage {

	CarsGuideHomePageLocators carsGuideHomePageLocators = null;
	CarsGuideSearchPageLocators carsGuideSearchPageLocators = null;

	public SearchCarsPage() {
		this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
		this.carsGuideSearchPageLocators = new CarsGuideSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideSearchPageLocators);

	}

	public void moveToCarsForSaleMenu() {

		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.carBuySellLink()).perform();

	}

	public void moveToNewCarlinkFromMenu(String newOption) {

		Assert.assertEquals("New", newOption);
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.buyNewCarLink()).click();

	}

	public void clicksOnNewCarsLink(String carOption) {

		Actions action = new Actions(SeleniumDriver.getDriver());
		Assert.assertEquals(carsGuideHomePageLocators.buyNewCarLink().getText(), carOption);
		action.moveToElement(carsGuideHomePageLocators.buyNewCarLink()).click().perform();

	}

	public void newCarForSaleSearchPage() {

//		carsGuideHomePageLocators.buyNewCarLink().click();

		carsGuideSearchPageLocators.newCarForSaleHeader().isDisplayed();
		Assert.assertEquals(carsGuideSearchPageLocators.newCarForSaleHeader().getText(), "New Cars For Sale");
//		
//		for (Map<String, String> data : dataTable.asMaps(String.class, String.class)) {
//			Assert.assertEquals(data.get("Title"), newCarForSaleHeader);
//			data.get("Title").get;
//			data.get("Title")
//
//			System.out.println("First Name is " + data.get("FirstName") + " Last Name is " + data.get("LastName"));
//		}

	}

	public void selectCarMakeOnSearchPage(String carMake) throws InterruptedException {

		Select make = new Select(carsGuideSearchPageLocators.carMakeField());
		make.selectByVisibleText(carMake);
		Thread.sleep(1000);

	}

	public void selectCarModelOnSearchPage(String carModel) throws InterruptedException {

		Select model = new Select(carsGuideSearchPageLocators.carModelField());
		model.selectByVisibleText(carModel);
		Thread.sleep(1000);

	}

	public void selectCarLocationOnSearchPage(String carLocation) throws InterruptedException {

		Select model = new Select(carsGuideSearchPageLocators.carLocationField());
		model.selectByVisibleText(carLocation);
		Thread.sleep(1000);

	}

	public void selectCarRegionOnSearchPage(String carRegion) throws InterruptedException {

		Select model = new Select(carsGuideSearchPageLocators.carRegionField());
		model.selectByVisibleText(carRegion);
		Thread.sleep(1000);

	}

	public void clicksShowNewVehiclesBtnOnSearchPage() {

		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideSearchPageLocators.showNewVehiclesBtn()).click().perform();

	}

	public void validateListOfCarsPage() {
		carsGuideSearchPageLocators.searchResultsPage().isDisplayed();
		Assert.assertTrue(carsGuideSearchPageLocators.searchResultsPage().getText().contains("BMW"));

	}

	public void validatesTitleOnListOfCarsPage(String title) {
		System.out.println("title : " + carsGuideSearchPageLocators.searchResultsPageTitle().getText());
		carsGuideSearchPageLocators.searchResultsPageTitle().isDisplayed();
		System.out.println("title again: " + carsGuideSearchPageLocators.searchResultsPageTitle().getText());
		Assert.assertEquals(carsGuideSearchPageLocators.searchResultsPageTitle().getText(), title);

	}

}
