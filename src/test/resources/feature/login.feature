Feature: Valid Login
  Scenario:
    Given i navigate to bPbOnline website
    And i click on my Account
    And  i enter my username "qwerty@yahoo.com"
    And  i enter my password "qwerty"
    When  i click on Sigin button
    Then i should be loged in with the message "My Account Information"