Feature: Amazon Functionality Automation

  @Amazon01
  Scenario: Baby wishlist Benefits page validation
    Given user enters the product name and click on baby wishlist page
    When user clicks on benefits
    Then user verify the Baby wishlist Benefits page

  Scenario: Filter by Memory Storage Capacity Validation
    Given user enters the product name
    When user selects the memory capacity

