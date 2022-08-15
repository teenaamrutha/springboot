Feature: Test post api
  Background:
    * def requestBody =
    """
    {
    "task_id":"4",
    "task_name":"Sleeping",
    "status":"Not Done"
    }
    """
  Scenario: Test post api
    Given url 'http://localhost:8080/add-task'
    And request requestBody
    When method POST
    Then status 200
    * print response