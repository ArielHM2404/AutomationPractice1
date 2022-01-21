
  Feature: Shopping by filtering
    @Shopping
    Scenario: Filter by price
      Given The user navigates to "http://practice.automationtesting.in/"
      Then The user click on Shop Menu
      And The user adjust the price filter between 150 and 450
      When The user click on filter button
      And The user should view only books between "150" and "450"

