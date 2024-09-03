Feature:Login as a user

  Scenario: Verify that user can login
    Given url set to open website
    Then login with username "standard_user" and password "secret_sauce"

  Scenario: Add details to checkout
    Given give firstName "Jon" and Last Name "Doe" and zip "80732"
    Then complete the process

