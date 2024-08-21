package steps;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.UsedCarsPage;

public class UsedCarsSteps {

	UsedCarsPage usedCarsPage = new UsedCarsPage();

	@When("I select the used option under buy")
	public void i_select_the_option_under_buy() {
		usedCarsPage.clicksOnUsedCarsLink();

	}

	@And("I enter {string} as car make on used car page")
	public void i_enter_as_car_make_on_used_car_page(String carMake) throws InterruptedException {
		usedCarsPage.selectCarMakeOnUserCarSearchPage(carMake);
	}

	@And("I enter {string} as car model on used car page")
	public void i_enter_as_car_model_on_used_car_page(String carModel) throws InterruptedException {
		usedCarsPage.selectCarModelOnUserCarSearchPage(carModel);
		
	}

	@And("I select a car model on used car page")
	public void i_select_a_car_model_on_used_car_page(List<String> list) throws InterruptedException {
	
		String model = list.get(1);
		System.out.println("The Car Menu is : " + model);
		usedCarsPage.selectCarModelOnUserCarSearchPage(model);
	}

	@And("I enter {string} as car location on used car page")
	public void i_enter_as_car_location_on_used_car_page(String carLocation) throws InterruptedException {
		usedCarsPage.selectCarLocationOnUserCarSearchPage(carLocation);
	}

	@When("I enter {string} as car region on used car page")
	public void i_enter_as_car_region_on_used_car_page(String carRegion) throws InterruptedException {
		usedCarsPage.selectCarRegionOnUserCarSearchPage(carRegion);
	}

	@And("I click on show used vehicles button on used car page")
	public void i_click_on_show_used_vehicles_button() throws InterruptedException {
		usedCarsPage.clicksShowUsedVehiclesBtnOnSearchPage();
	}

	@Then("I see list of used cars selected on the new page")
	public void i_see_list_of_used_cars_selected_on_the_new_page() {
		usedCarsPage.validateListOfUsedCarsPage();
	}

//	@Then("I validate {string} title on used car page is being displayed")
//	public void i_validate_title_on_used_car_page_is_being_displayed(String title) {
//		usedCarsPage.validatesTitleOnListOfUsedCarsPage(title);
//	}

	@And("I validate {string} title on used car page is being displayed")
	public void i_validate_title_on_used_car_page_is_being_displayed(String title) {
//		usedCarsPage.validatesTitleOnListOfUsedCarsPage(title);
	}

}
