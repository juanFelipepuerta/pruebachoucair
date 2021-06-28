#Autor: Juan felipe marulanda
@tag1
Feature: correct addressing to the module used
  as a web User
  I want open the module web employee choucair



  Scenario: open module employee
    Given the pipe needs to use the module employee
    When  this user search the page web choucair
    Then  the user should see your module employee




