Feature: Testing actitime application

  Scenario: Testing actitime login functionality for valid user
    Given User is already haveing application URL
    And also having username and password
    When user enter the username and password
    And clicks on login button
    Then Actitime home page will be displayed
    And close the browser

  Scenario Outline: Testing actitime login functionality for <user> <username> <password>
    Given User is already having application URL as <url>
    And also having username as <username> and password as <password> for the application
    When user enter the username and password
    And clicks on login button
    Then Actitime home page will be displayed with the application title as <title>
    And close the browser

    Examples: 
      | user    | url                        | username | password  | title                       |
      | valid   | https://demo.actitime.com/ | admin    | manager   | actiTIME - Enter Time-Track |
      | invalid | https://demo.actitime.com/ | admin12  | manager   | actiTIME - Login            |
      | invalid | https://demo.actitime.com/ | admin    | manager23 | actiTIME - Login            |
