@task1
Feature: Task1

  @task1.1
  Scenario: Verify Angular checkbox
    Given I navigate to "demoqa" page
    And I select "Elements" tile
    And I select the "Check Box" option from the side menu
    And I expand the folder tree using the "+" button on the top right corner
    And I select the checkbox "Angular" under Workspace
    Then I verify the Angular selection
    When I uncheck the Angular checkbox
    Then I verify it is no longer selected
