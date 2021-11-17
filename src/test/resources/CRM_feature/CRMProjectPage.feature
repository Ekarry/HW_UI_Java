Feature: create project page

  Background:
    Given Autorized

  Scenario:
    Given Hover nav menu
    And Click my project
    And Click create project button
    When Fill project name
    And Select Organization
    And Select BusinessUnit
    And Select Curator
    And Select Rp
    And Select Administrator
    And Select Manager
    And Select Contact
    And Click Save And Close Button
    Then Can see all Projects Page