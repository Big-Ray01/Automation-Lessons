Feature: Automation Lesons

  @Test
  Scenario Outline: User can access automation lessons
    Given the user is on the automation lessons page using "<Browser>"
    When the user clicks on login Automation
    When the user clicks on signUp
    Then the user enter the "<FirstName>"
    Examples:
      | Browser | FirstName |
      | edge    | Ray       |
      | Chrome  | Mike      |
      | Firefox | Vick      |
