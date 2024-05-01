Feature: all login related scenarios

  Scenario: to test the functionality of login button for valid input
    Given Login page should be opened
    When I enter username and password
    And I click on Login button
    Then I should be redirected to home page