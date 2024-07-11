Feature: Amazon Functionality Automation

  #before
  @Amazon01
  Scenario: Baby wishlist Benefits page validation
    #beforestep
    Given user enters the product name and click on baby wishlist page
    #afterstep
    #beforestep
    When user clicks on benefits
    #afterstep
    #beforestep
    Then user verify the Baby wishlist Benefits page
    #afterstep
#after
    @amazon02
  Scenario: Filter by Memory Storage Capacity Validation
    Given user enters the product name

  @sales01
  Scenario: Broken link validation
    Then verify the response code of forget your password link



