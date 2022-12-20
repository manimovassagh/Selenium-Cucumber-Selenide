Feature: test google
  Scenario: open and search
    Given just open google
    When input some search
    Then search shows