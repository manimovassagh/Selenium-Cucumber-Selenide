# Created by mani at 21.12.22
Feature: Want to test multiple names

  Scenario Outline: give three names to print
    Given I give multiple names <name>
    When Start the Test
    Then Multiple Names are going to print
    Examples:
      | name    |
      | "mani"  |
      | "sahar" |
      | "mehdi" |
      | "Amir"  |
