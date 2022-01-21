Feature: Login
  Background:
#    Given The user navigates to "http://practice.automationtesting.in/"

  @LoginValidCredentials
  Scenario Outline: 01 - Verify the Login with username and password
#    Given 01 - Verify the Login with username and <options> password
    Given The user navigates to "http://practice.automationtesting.in/"
    When click on My Account menu
    And enter valid <username> and <password>
    And click on Login button
#    Then the user should be successfully login to the web page <expected>
    Examples:
      | username               | password      |  |
      | "arielh.m25@gmail.com" | "RedBlueGree" |  |
      | "arielh.m25@gmail.com" | "adasQWR"     |  |


