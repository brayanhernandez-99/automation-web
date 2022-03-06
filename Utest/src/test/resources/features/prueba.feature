Feature: As a user, I want to create a new account in Advantage.

  Background: enter the registration form
    Given the user is on the page
    When the user will see the page
    Then the user enters Join Today

  @CreateAccount
  Scenario Outline: Successful account creation
    Given the user enters their personal information
      | first_name   | last_name   | email   | birth_day   | birth_month   | birth_year   | languages   |
      | <first_name> | <last_name> | <email> | <birth_day> | <birth_month> | <birth_year> | <languages> |
    And the user enters their address information
      | city   | postal_code   | country   |
      | <city> | <postal_code> | <country> |
    And the user enters their devices information
      | brand   | model   | os   |
      | <brand> | <model> | <os> |
    And the user enters their password
      | password   | confirmPassword   |
      | <password> | <confirmPassword> |
    When the user enter all registration information
    Then the user will see their profile name
    Examples:
      | first_name | last_name | email                        | birth_day | birth_month | birth_year | languages | city     | postal_code | country | brand  | model           | os         | password     | confirmPassword |
      | prueba     | prueba    | brayan.hernandez@example.com | 10        | January     | 2003       | Spanish   | Medellín | +57         | Yemen   | Huawei | Y9 Prime (2019) | Android 10 | Semillero#15 | Semillero#15    |
