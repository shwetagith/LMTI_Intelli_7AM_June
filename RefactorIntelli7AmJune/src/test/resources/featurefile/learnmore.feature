Feature: Learn More Automation

  @lmti01
  Scenario: Confirmation box message validation
    Given user clicks on the confirmation box
    When user get the confirmation message text and click the cancel button
    Then validate the confirmation and UI text

  @lmti02
  Scenario: Text validation
    Given user clicks on change to text button
    Then user verify the text in UI

  @lmti03
  Scenario: login scenario
    Given user enters the credi and navigate to homepage
    Then verify the navigation

