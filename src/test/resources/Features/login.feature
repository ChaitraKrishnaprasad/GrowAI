Feature: Login Page Automation

  Background: user is logged in to sauceDemo app
    Given user is on login page
    When user enters valid "<username>" and "<password>"
    And click on login button

 Scenario: Check login is successful with valid credentials
    Then user should be navigated to home page
    And close the browser

   Scenario: Add to the cart
     Then add products to the cart
     And close the browser





