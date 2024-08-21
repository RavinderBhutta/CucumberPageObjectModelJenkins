package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import pages.locators.CarsGuideUsedSearchPageLocators;
import utilities.SeleniumDriver;

public class UsedCarsPage {

	CarsGuideUsedSearchPageLocators carsGuideUsedSearchPageLocators = null;

	public UsedCarsPage() {

		this.carsGuideUsedSearchPageLocators = new CarsGuideUsedSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideUsedSearchPageLocators);
	}

	public void clicksOnUsedCarsLink() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		Assert.assertEquals(carsGuideUsedSearchPageLocators.buyUsedCarLink().getText(), "Used");
		action.moveToElement(carsGuideUsedSearchPageLocators.buyUsedCarLink()).click().perform();

	}

	public void selectCarMakeOnUserCarSearchPage(String carMake) throws InterruptedException {
		
		Select model = new Select(carsGuideUsedSearchPageLocators.carMakeField());
		model.selectByVisibleText(carMake);
		Thread.sleep(2000);

	}

	public void selectCarModelOnUserCarSearchPage(String carModel) throws InterruptedException {
		
		Select model = new Select(carsGuideUsedSearchPageLocators.carModelField());
		model.selectByVisibleText(carModel);
		Thread.sleep(2000);

	}

	public void selectCarLocationOnUserCarSearchPage(String carLocation) throws InterruptedException {
		Select model = new Select(carsGuideUsedSearchPageLocators.carLocationField());
		model.selectByVisibleText(carLocation);
		Thread.sleep(2000);
	}

	public void selectCarRegionOnUserCarSearchPage(String carRegion) throws InterruptedException {
		Select model = new Select(carsGuideUsedSearchPageLocators.carRegionField());
		model.selectByVisibleText(carRegion);
		Thread.sleep(2000);

	}

	public void clicksShowUsedVehiclesBtnOnSearchPage() throws InterruptedException {

		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideUsedSearchPageLocators.showUsedVehiclesBtn()).click().perform();
		Thread.sleep(2000);
	}

	public void validateListOfUsedCarsPage() {
		carsGuideUsedSearchPageLocators.usedSearchResultsPage().isDisplayed();
		Assert.assertTrue(carsGuideUsedSearchPageLocators.usedSearchResultsPage().getText().contains("Audi"));

	}

	public void validatesTitleOnListOfUsedCarsPage(String title) {
		System.out.println("title : " + title);
//		carsGuideUsedSearchPageLocators.usedCarResultsPageTitle().isDisplayed();
//		System.out.println("title again: " + carsGuideUsedSearchPageLocators.usedCarResultsPageTitle().getText());
//		Assert.assertEquals(carsGuideUsedSearchPageLocators.usedCarResultsPageTitle().getText(), title);
		System.out.println("this is commit to trigger build from jenkins");

	}
}
