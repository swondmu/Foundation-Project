Feature: manager should create and assign a defect to the tester


    Scenario: As a manager I want to be able create and assign the defect

        Given   the manager on the manager page
        When    the manager enters a defect name
        When    the manager enters a tester name
        When    the manager clicks the assign button
        Then    the manager see an alert defect has been assign
    