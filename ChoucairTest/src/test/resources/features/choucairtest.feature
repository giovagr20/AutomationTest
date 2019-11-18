
Feature: URL Choucair
  As a user 
  I want to find out a job


  Scenario: Must go to search jobs
    Given User is in URL choucair
    When User choose option empleo
    And User find out empleos disponibles
    Then User put word Developer and Medellin
    And User submit Buscar Trabajos

 

