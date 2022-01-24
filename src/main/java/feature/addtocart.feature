Feature: AddtoCart
  Scenario Outline: Add product to the cart

    Given when user select any product
    When User add product to the cart "<productName>"
    Then Verify product in the cart


    Examples:
      | productName |
      |bango|