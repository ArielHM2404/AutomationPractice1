Feature: ShoppingBasketView
  Background:
#    Given The user navigates to "http://practice.automationtesting.in/"

  @ShoppingBasketView
  Scenario: Verify the shopping page sorting products
    Given The user navigates to "http://practice.automationtesting.in/"
    When The user clicks on Shop menu
    And The user clicks on the Add To Basket button
      Then The user can view the Book in the Menu
    And The user clicks on View Basket link
      Then The user finds total and subtotal values
   #   And The total value is less than the subtotal
    And The user clicks on on Proceed to Check out button
      Then The user confirms visibility of Billing Details
      Then The user confirms visibility of Order Details
      Then The user confirms visibility of Additional details
      Then The user confirms visibility of Payment gateway details
