Feature: Test put api
  Background:
    * def requestBody =
    """
    {
    "status":"Done"
    }
    """
  Scenario: Test put api
    Given url 'http://localhost:8080/task/1/update-status'
    And request requestBody
    When method PUT
    Then status 200
    * print response
  Scenario: Test put api (not found)
    Given url 'http://localhost:8080/task/11/update-status'
    And request requestBody
    When method PUT
    Then status 200
    * print response