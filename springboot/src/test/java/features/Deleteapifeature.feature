Feature: Test delete api
  Scenario: Test delete api
    Given url 'http://localhost:8080/task/1/delete-task'
    When method DELETE
    Then status 200
    * print response