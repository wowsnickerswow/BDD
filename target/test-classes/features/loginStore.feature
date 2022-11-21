Feature: Go to product store main page

  Scenario: Buyt a phone
    Given I am on the Home Page of "https://www.demoblaze.com/index.html" website
    When login into product store
    And Select phone category
    And click on forst phone from the list
    Then I add phone to the cart
    And redirect to cart page
