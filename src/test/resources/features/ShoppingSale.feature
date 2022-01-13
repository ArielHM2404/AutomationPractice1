Feature: ShoppingSale
  Background:
#    Given The user navigates to "http://practice.automationtesting.in/"

  @ShoppingSaleFeature
  Scenario: Verify the shopping page sorting products
    Given The user navigates to "http://practice.automationtesting.in/"
    When The user clicks on Shop menu
    And The user clicks on Sale product label
    Then The user can see actual and old price