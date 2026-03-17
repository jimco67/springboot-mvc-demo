Feature: Simple Hello World
  Scenario: Say Hello
    Given I have a greeting service
    When I ask for a greeting
    Then I should receive "Hello from Cucumber!"
