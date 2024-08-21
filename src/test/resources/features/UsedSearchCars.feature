@Search-Used-Cars
Feature: Acceptance testing to validate search cars page is working fine
  In order to validate
  the search cars page is working fine
  we will do the acceptance testing

  Background: 
    Given I am on the Home page of "https://www.carsguide.com.au/" website
    When I move to buy plus sell car menu

  @Search-Used-Cars-PositiveCases
  Scenario: Validate search cars page
    And I select the used option under buy
    And I enter "Audi" as car make on used car page
    And I select a car model on used car page
      | carModel |
      | A5       |
      | A7       |
    And I enter "Queensland" as car location on used car page
    And I enter "Brisbane" as car region on used car page
    And I click on show used vehicles button on used car page
    #Then I see list of used cars selected on the new page
    And I validate "3 Audi A7s for Sale in Brisbane, QLD" title on used car page is being displayed
