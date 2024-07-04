Feature: Learn More Automation

  @lmti01
  Scenario: Confirmation box message validation
    Given user clicks on the confirmation box
    When user get the confirmation message text and click the cancel button
    Then validate the confirmation and UI text