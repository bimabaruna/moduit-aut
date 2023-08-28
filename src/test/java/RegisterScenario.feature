@Testing
Feature: Profile Register

  @register
  Scenario: User want to Register
    Given user go to register page
    And user input nama lengkap "Bima baruna"
    And user input valid email
    And user input password "Testing123!"
    And user input confirm password "Testing123!"
    And user input phone number "8569449123"
    And user click daftar
