Feature: Manual tests of Booking.com.
  I as a user need to perform manual tests of the Booking website for the reservation process.

  Background: Enter the booking page.
    Given the user is in the page

  @RegisterAccount
  Scenario: Register account in the website.
    When the user is in the register option
    And enter the email address data valid
    And enter the password data valid
    Then the user will be able to see the register successful

  @RegisterAccountWithSocialNetworks
  Scenario Outline: Register account in the website with the social network <signInOption>.
    When the user is in the register option
    And choose a available register option <signInOption>
    And enter credentials for logging
    Then the user will be able to see the register successful
    Examples: Register account option available
      | signInOption |
      | Facebook     |
      | Google       |
      | Apple        |

  @SignInWebsite
  Scenario: Sign in a account in the website.
    When the user is in the sign in
    And enter the email address data valid
    And enter the password data valid
    Then the user will be able to see the sign in successful

  @SignInWithInvalidEmail
  Scenario: Sign in a account in the website with invalid email address.
    When the user is in the sign in
    And enter the email address data invalid
    Then the user will be able to see this message: Make sure the email address you entered is correct.

  @SignInWithInvalidPassword
  Scenario: Sign in a account in the website with invalid email address.
    When the user is in the sign in
    And enter the email address data valid
    And enter the password data invalid
    Then the user will be able to see this message: The email and password combination entered doesn't match.

  @SignInWithSocialNetworks
  Scenario Outline: Sign in a account in the website with the social network <signInOption>.
    When the user is in the sign in
    And choose a available sign in option <signInOption>
    And enter credentials for logging
    Then the user will be able to see the sign in successful
    Examples: Sign in option available
      | signInOption |
      | Facebook     |
      | Google       |
      | Apple        |

  @ResetPassword
  Scenario: Reset password a account in the website.
    When the user is in the sign in
    And enter the email address data valid
    And the user is in forgot your password and click in set reset link
    Then the system should send an email to reset the password

  @ChangeLanguages
  Scenario: Change languages.
    When the user click in choose your language
    And choose a available language
    Then the user will be able to see the change the language in this page

  @ChangeCurrency
  Scenario: Change currency.
    When the user click in choose your currency
    And choose a available currency
    Then the user will be able to see the change the currency in this page

  @ContactCustomerService
  Scenario: Start chat with contact customer service.
    When the user is in the contact customer service option
    And user starts chat with logging in
    And enter the reservation data
    Then the user will be able to see the started chat

  @ContactCustomerService
  Scenario: Start chat with contact customer service.
    When the user is in the contact customer service option
    When user starts chat without logging in
    And enter the reservation data
    Then the user will be able to see the started chat

  @FindBookings
  Scenario: Find stays bookings in the website.
    When the user enters the target data
    And enter the data for check-in and check-out
    And enter the data for the room
    Then the user will be able to see the list of available reservations

  @BookingsCalendar
  Scenario: The user will not be able to book before the current day.
    When the user click in check-in and check-out
    Then the user will not be able to select days before the current day

  @BookingsRoom
  Scenario: The user will not be able to enter negative values.
    When the user clicks in room
    And enter the data for the room
    Then the user will not be able to enter negative values in adults, children and rooms

  @BookingsFlights
  Scenario: The user will not be able to make flight reservations without a destination.
    When the user is in bookings flights
    And search bookings without any flight information
    Then the user will be able to see a message of error with the information missing
