Feature: Login
  Scenario Outline: Login to happyfresh application

    Given when user opens application
    When user enters valid "<email>" and "<password>"
    Then click on login button and verify "<email>"


    Examples:
      |email||password|
      |bakoy38398@peykesabz.com||Test@123|
