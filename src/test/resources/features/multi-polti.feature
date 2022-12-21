# Created by mani at 21.12.22
Feature: a new feature for multiple things

  Scenario Outline: give matrix items
    Given I give multiple items  <name>
    When Start the Test for <family>
    Then Multiple Names are going to print for this family
    Examples:
      | name    | family       |
      | "mani"  | "Movassagh"  |
      | "sahar" | "Morattab"   |
      | "mehdi" | "Rahmaniyan" |
      | "Amir"  | "Khaki"      |
