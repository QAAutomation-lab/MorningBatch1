Feature: Perform Google Search based on requirement

  @tag1
  Scenario: Search 'selenium interview questions' in Google
    Given User is already in Google search page
    When user types 'selenium interview questions' in search input field and clicks on search button
    Then user gets search result page with the title 'selenium interview questions - Google Search'
    And close the opened browser

  @tag2
  Scenario Outline: Search <textToBeSearched> in Google search page
    Given User is already in Google search page
    When user types <textToBeSearched> in search input field, clicks on search button
    Then user reached to search result page with the title <expectedTitle>
    And close the opened browser

    Examples: 
      | textToBeSearched | expectedTitle                |
      | Selenium 3.0     | Selenium 3.0 - Google Search |
      | Selenium 4.0     | Selenium 4.0 - Google Search |
