Feature: Wikipedia search functionality and verifications

#WSF-4562   potential jira ticket ex. to communicate well


Scenario: Wikipedia Search Functionality Image Header Verification
      Given User is on Wikipedia home page
      When  User types "Bill Gates" in the wiki search box
      And User clicks wiki search button
      Then User sees "Bill Gates" is in the wiki title


Scenario: Wikipedia Search Functionality Header Verification
     Given User is on Wikipedia home page
      When User types "Steve Jobs" in the wiki search box
      And User clicks wiki search button
      Then User sees "Steve Jobs" is in the main header

@scenarioOutlines
  Scenario Outline: Wikipedia Search Functionality Image Header Verification
    Given User is on Wikipedia home page
    When  User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header


    Examples: search values we are gonna be using in this scenario is as below
      | searchValue       | expectedTitle     | expectedMainHeader |
      | Steve Jobs        | Steve Jobs        | Steve Jobs         |
      | Cristiano Ronaldo | Cristiano Ronaldo | Cristiano Ronaldo  |
      | Bob Marley        | Bob Marley        | Bob Marley         |
      | Chuck Norris      | Chuck Norris      | Chuck Norris       |
      | Antony Hopkins    | Antony Hopkins    | Antony Hopkins     |
      | Marie Curie       |  Marie Curie      | Marie Curie        |
      | Lady Gaga         | Lady Gaga         | Lady Gaga          |
      | Kate Winslet      | Kate Winslet      | Kate Winslet       |
