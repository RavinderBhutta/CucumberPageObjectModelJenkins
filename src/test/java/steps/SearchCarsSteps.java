package steps;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.SearchCarsPage;
import utilities.SeleniumDriver;

public class SearchCarsSteps {

	SearchCarsPage searchCarsPage = new SearchCarsPage();

	@Given("I am on the Home page of {string} website")
	public void i_am_on_the_home_page_of_website(String url) {
		SeleniumDriver.openURL(url);
	}

	@When("I move to buy plus sell car menu")
	public void i_move_to_buy_plus_sell_car_menu() {
		searchCarsPage.moveToCarsForSaleMenu();
	}
	
	@When("I select the {string} option under buy")
	public void i_select_the_option_under_buy(String carOption) {
		searchCarsPage.clicksOnNewCarsLink(carOption);
		
	}

	@And("I enter {string} as car make")
	public void i_enter_as_car_make(String carMake) throws InterruptedException {
		searchCarsPage.selectCarMakeOnSearchPage(carMake);
	}

	@And("I enter {string} as car model")
	public void i_eneter_as_car_model(String carModel) throws InterruptedException {
		searchCarsPage.selectCarModelOnSearchPage(carModel);
	}

	@And("I enter {string} as car location")
	public void i_enter_as_car_location(String carLocation) throws InterruptedException {
		searchCarsPage.selectCarLocationOnSearchPage(carLocation);
	}

	@And("I enter {string} as car region")
	public void i_enter_as_car_region(String carRegion) throws InterruptedException {
		searchCarsPage.selectCarRegionOnSearchPage(carRegion);
	}

	@And("I click on show new vehicles button")
	public void i_click_on_show_new_vehicles_button() {
		searchCarsPage.clicksShowNewVehiclesBtnOnSearchPage();
	}

	@Then("I see list of new cars selected on the new page")
	public void i_see_list_of_new_cars_selected_on_the_new_page() {
		searchCarsPage.validateListOfCarsPage();
	}

	@And("I validate {string} title is being displayed")
	public void i_validate_title_is_being_displayed(String title) {
		searchCarsPage.validatesTitleOnListOfCarsPage(title);
	}
}
