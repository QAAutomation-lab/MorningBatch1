Feature: As a end user I want to verify Vtiger application login functionality

  Scenario: Verify Vtiger application login page
    Given User has a valid application URL
    When User hits a login page url
    Then User should reach to login page with title "vtiger"

  Scenario: Verify user is able to login in the application with valid credentinal
    Given User has a valid application URL "https://demo.vtiger.com/vtigercrm/index.php"
    When User hits a login page url
    And Enter the user name as "admin"
    And Enter the password as "Test@123"
    And Click on Signin button
    Then User should reach to home page with title "Dashboard"

  Scenario: Verify user is able to login in the application with invalid credentinal
    Given User has a valid application URL "https://demo.vtiger.com/vtigercrm/index.php"
    When User hits a login page url
    And Enter the user name as "admin123"
    And Enter the password as "Test@123"
    And Click on Signin button
    Then User should remain in login page with title "vtiger"

  Scenario Outline: Verify user is able to login in the application with <credentinal>
    Given User has a valid application URL <appUrl>
    When User hits a login page url
    And Enter the user name as <username>
    And Enter the password as <password>
    And Click on Signin button
    Then User should remain in login page with title <pageTitle>

    Examples: 
      | credentinal         | appUrl                                      | username | password | pageTitle |
      | valid credentinal   | https://demo.vtiger.com/vtigercrm/index.php | admin    | Test@123 | Dashboard |
      | invalid credentinal | https://demo.vtiger.com/vtigercrm/index.php | admin123 | Test@123 | vtiger    |
