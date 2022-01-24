Feature: ProductList
  Scenario Outline: Get the list of the product

    Given when user select pantry option
    When Fetch the list of the product
    Examples:
      |pantry|
      |pantry|

