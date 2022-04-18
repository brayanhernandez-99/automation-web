Feature: Automation tests of Booking.com.
  I as a user need to perform automation tests of the Booking website for the reservation process.

  Background: Enter the booking page.
    Given the user is in the page booking

  #Semi-automated scenario.
  # Validate that you are not a robot by pressing and holding the button.
  @SignInWebsite
  Scenario Outline: Sign in a account in the website.
    When the user is at login and enters their valid credentials
      | email   | password   |
      | <email> | <password> |
    And validate that you are not a robot
    Then the user will be able to see the sign in successful
    Examples: Credentials available
      | email                       | password     |
      | testbooking2022@hotmail.com | Qwerty123456 |

  #Semi-automated scenario.
  #Change the email address for the new test in case it fails.
  @RegisterAccount
  Scenario Outline: Register account in the website.
    When the user is in the registration option and enters his registration data
      | email   | new_password   | confirm_password   |
      | <email> | <new_password> | <confirm_password> |
    And validate that you are not a robot
    Then the user will be able to see the sign in successful
    Examples: Data to create accounts
      | email                      | new_password | confirm_password |
      | testbooking123@hotmail.com | Qwerty123456 | Qwerty123456     |

  @ChangeCurrency
  Scenario Outline: Change currency.
    When the user click in choose your currency and choose the available currency <currency>
    Then the user will be able to see the change the currency in this page for <currency>
    Examples: Currency option available
      | currency |
      | EUR      |
      | INR      |
      | COP      |

  @FindBookings
  Scenario: Find stays bookings in the website no destination information.
    When the user searches without target data information
    Then should see an error message Error:

  @VerificationLinkBlockedAccount
  Scenario Outline: Validate the verification link blocked account.
    When the user logs in and enters their email address <email_blocked>
    Then the user will have the option to Unlock with email
    Examples: List of blocked accounts
      | email_blocked    |
      | qwerty@gmail.com |

  @VerificationLink
  Scenario Outline: Validate the verification link option.
    When the user is at login and enters their valid credentials
      | email   | password   |
      | <email> | <password> |
    Then the user will be able to see the option Sign in with a verification link
    Examples: Credentials available
      | email                       | password     |
      | testbooking2022@hotmail.com | Qwerty123456 |
      | testbooking2022@gmail.com   | Qwerty123456 |

  @EmailAddressVerification
  Scenario Outline: Email address validation.
    When the user logs in and enters a invalid email address <email_invalid>
    Then the user will be able to see a message error with Make sure the email address you entered is correct.
    Examples: List email address invalid
      | email_invalid           |
      | error                   |
      | testbooking2022         |
      | testbooking2022@hotmail |

  @PasswordsMatch
  Scenario Outline: Validate the password match in the account registration option on the website.
    When the user is in the registration option and enters his registration data
      | email   | new_password   | confirm_password   |
      | <email> | <new_password> | <confirm_password> |
    Then Then the user will be able to see a message The passwords you entered didn't match – try again
    Examples: Data to validate matching passwords
      | email                      | new_password | confirm_password |
      | testbooking123@hotmail.com | @Error12345  | @Error1234       |
