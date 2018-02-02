Feature: To add a product from the site and checkout

  Background: List of steps run before each of the scenarios
    Given Initialise the Webdriver

  Scenario: To login on shopping site
    Given Site "Shop.demoqa.com" is up
    When Navigate to women
    And click on  Jackets
    And select color from dropdown
    And sort jacket by newness
    Then fbgbfd
