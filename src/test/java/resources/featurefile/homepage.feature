@regression
Feature: Home Page Test
  As a user I want to verify page navigation

  @sanity
  Scenario: Verify Page Navigation
  Given   I am on Home Page
    And   I click on Computers
    Then  verify if computer tab open