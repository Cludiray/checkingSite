Feature: Buying clothes

  Background: I'm on the main page
    Given Open site "http://automationpractice.com/index.php"

  Scenario: Registration
    When Click Sign in
    Then Input email
    And  Click Create Account
    Then Input First Name
    And  Input Last Name
    And  Input Password
    And  Input Address
    And  Input City
    And  Input State
    And  Input Postal Code
    And  Input Additional Info
    And  Input Mobile phone
    And  Input Second Address
    Then Click register button

  Scenario: Buying Blouses
    When Click move to Woman button
    Then Click Blouses button
    When Move to Blouse
    Then Click add to cart
    And  Click Proceed to checkout
    And  Click next proceed
    Then Input "MyTestOne@mail.com" email
    And  Input "!Q2w#E4r" password
    Then Click sign in btn
    And  Click next proceed
    When Click checkbox - I agree to the terms of service
    Then Click next proceed shipping
    And  Click Pay by bank wire
    Then Click I confirm my order