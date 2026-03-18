Feature: Simple Hello World
  Scenario: Say Hello to Spring Boot
    Given Je suis arrivé sur Spring
    When Le service me dit bonjour
    Then Je devrais recevoir "Hello from Spring Boot!"

  Scenario: Say Hello and expect an Hello in return
    Given Je suis arrivé sur Spring
    When J'envoie le message "John" au service
    Then Le service devrait me saluer en réponse à mon message
