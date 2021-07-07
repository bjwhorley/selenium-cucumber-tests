Feature: The Login Page
  As a user
  I want to go to http://www.seleniumframework.com/Practiceform/
  and enter email address
  then hit subscribe

Scenario: The user will login and input email address and hit subscribe.
  Given The user is on the login page
  When the user enters email address in textbox
  Then the user hits subscribes by clicking subscribe