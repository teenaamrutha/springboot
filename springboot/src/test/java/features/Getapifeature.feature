Feature: Test get apis
  Scenario: Get all tasks
    Given url 'http://localhost:8080/alltasks'
    When method GET
    Then status 200
    * print response
  Scenario: Get a particular task
    Given url 'http://localhost:8080/task'
    And path '2'
    When method GET
    Then status 200
    * print response
    * match response.task_name == "Bathing"
  Scenario: Get a particular task (not found)
    Given url 'http://localhost:8080/task'
    And path '10'
    When method GET
    Then status 500