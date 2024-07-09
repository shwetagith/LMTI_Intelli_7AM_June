Feature: Test Hdfc bank page

  Scenario: Tovalidate login and switch from one page to another
    Given User has navigatet to HDFC bank page
    When user click on maximize icon
    Then window get minimized and get the title of the page
    When user click on the know more link
    Then user switch to child window and get the title of the page
    And again switch to parent window and get the title of the page
    And close the parent window