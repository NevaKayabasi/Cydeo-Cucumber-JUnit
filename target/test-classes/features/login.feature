@Regression @smoke @login
Feature: Library app login feature

  As a user, I should be able to login with correct credentials to different accounts.
  And dashboard should be displayed.


  Accounts are: librarian, student, admin

  Background: For the scenarios in the feature file user is expected to be on login page

    Given user is on the library login page



  @librarian @employee
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashbord

    @student
    Scenario:  Login as student
      When user enters student username
      And user enters student password
      Then user should see the dashbord

      @admin @employee
      Scenario:
        When user enters admin username
        And user enters admin password
        Then user should see the dashbord

