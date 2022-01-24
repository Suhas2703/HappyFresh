Feature: ProductDetails
  Scenario Outline: Get the details of the product

    Given when user select the product
    When Fetch the details of the product "<productName>"

    Examples:
      | productName |
      |bango|