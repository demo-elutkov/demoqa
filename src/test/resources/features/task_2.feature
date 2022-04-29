@task2
Feature: Task2

  @task2.1
  Scenario: Interact with an Alert
    Given I navigate to "demoqa" page
    And I select "Alerts, Frame, & Windows" tile
    And I select the "Alerts" option from the side menu
    And I click on the "On button click, alert will appear after 5 seconds " button
    Then I verify the alert pop up has appeared
    And I close the alert
