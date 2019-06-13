Feature: User panel setup

  @wordpress @login @userProfile
  Scenario: Setup user profile
    Given User start on main page
    When  User loged in to the user page
    Then  User can modified user profile

  @wordpress @notification
  Scenario: Setup notification
      Given User start on page "https://wordpress.com"
      When User login in to the user page
      Then User can modified notifications