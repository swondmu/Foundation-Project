Feature: tester has to go to his page and see to what defect he assigned

    Scenario: As a tester I should update a status

        Given   the tester logged in the homepage 
        When    the tester accept or decline assigned defect
        When    the tester has to work on defects
        When    the tester see a status change 
        Then    the tester has update defects