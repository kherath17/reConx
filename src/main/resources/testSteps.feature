@master
Feature: Check user redirect
  Scenario Outline:Verify if user navigate to correct page and click login
    Given User navigate to url
    When User enter "<UserName>" and "<Password>"
    Then User click login
    Then User redirected to loggedIn Page

    Examples:
      |UserName|Password|
      |admin|admin@123|