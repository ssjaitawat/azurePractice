Feature: Test Rest API

  Background:
    * url "https://reqres.in/"

  @test
  Scenario: Verify Get call
    Given path '/api/users?page=2'
    When method Get
    Then status 200

  @test1
  Scenario: Verify Get call 2
    Given path '/api/users/2'
    When method Get
    Then status 200

  @test
  Scenario: Verify Post call
    Given path '/api/register'
    And request {"email": "eve.holt@reqres.in", "password": "pistol"}
    When method Post
    Then status 200


