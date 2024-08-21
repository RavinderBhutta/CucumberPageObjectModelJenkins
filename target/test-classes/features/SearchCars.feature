@Search-Cars
Feature: Acceptance testing to validate search cars page is working fine
  In order to validate
  the search cars page is working fine
  we will do the acceptance testing

  Background: 
    Given I am on the Home page of "https://www.carsguide.com.au/" website
    When I move to buy plus sell car menu

  @Search-Cars-PositiveCases
  Scenario: Validate search new cars page
    And I select the "New" option under buy
    And I enter "BMW" as car make
    And I enter "3 Series" as car model
    And I enter "New South Wales" as car location
    And I enter "Central Coast" as car region
    And I click on show new vehicles button
    Then I see list of new cars selected on the new page
    And I validate "6 BMW 3 Series for Sale in Central Coast, NSW" title is being displayed
