Feature: Compose a new email
@Regression

Background: User navigates to Company home page
    Given User is on the "Gmail login" page on URL "https://mail.google.com"
    Then User should see "Log In" message



Scenario Outline: Compose an email
    When User fill in "Username" with "<username>"
    Then User click on the "Next" button
    And User fill in "Password" with "<password>"
    Then User click on the "Login" button
    And User should see "page title" message
    Then User click on the "compose" button
    Then User should see "New Message" message
    When User fill in "Mesage body" with "<message>"
    And User fill in "User Id" with "<user id>"
    Then User click on the "Send" button
   
    Examples:
      | username    | password   |         message              | user id |
      | Test        | !23        | Automation QA test for Incubyte | receiver_abc@gmail.com |

