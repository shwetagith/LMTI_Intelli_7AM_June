Feature:  Wiki Automation

  @Wiki01 @RegressionTest
  Scenario: validation of Shareholders and Shareholding values
    Given user extract the shareholders and shareholding values
    Then user compares the table value
