Feature: Application Login

Scenario: Homepage usual Login
Given User is on landing page
When User login into application with username "janki" and password
Then Homepage is populated
And Dashbaord is displayed

Scenario: Homepage usual Login
Given User is on landing page
When User login into application with username "ram" and password
Then Homepage is populated
And Dashbaord is displayed


