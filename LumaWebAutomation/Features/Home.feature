Feature: Home page Features
Scenario: verify home page visibilty
Given user open browser
When user enter username "standard_user"
And user enter password "secret_sauc"
And user click on login button
Then user should see dashboard page
And user should see all menu
