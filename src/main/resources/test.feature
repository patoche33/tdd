Feature: Calculator
  Scenario: Addition
    Given I have a calculator
    When I add 2 and 3
    Then the result should be 5

  Scenario: Subtract
    Given I have a calculator
    When I subtract 3 and 2
    Then the result should be 1

  Scenario: Multiply
    Given I have a calculator
    When I multiply 3 and 2
    Then the result should be 6

  Scenario: Divide
    Given I have a calculator
    When I divide 4 and 2
    Then the result should be 2

  Scenario:  DivideByZero
    Given I have a calculator
    When I divide 4 by 0
    Then the result should be IllegalArgumentException
