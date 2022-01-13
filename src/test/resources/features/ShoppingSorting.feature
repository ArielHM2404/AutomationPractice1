Feature: ShoppingSort
  Background:
#    Given The user navigates to "http://practice.automationtesting.in/"

  @ShoppingProductSort
  Scenario Outline: Verify the shopping page sorting products
    Given The user navigates to "http://practice.automationtesting.in/"
    When The user clicks on Shop menu
    And The user clicks on sort by <sortByValues>
    Then The user can view the sorted product <sortByValues>
    Examples:
      | sortByValues  |
      | "popularity"  |
      | "rating"      |
      | "date"        |
      | "price"       |
      | "price-desc"  |