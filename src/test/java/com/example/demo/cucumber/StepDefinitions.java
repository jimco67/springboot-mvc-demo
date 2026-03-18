package com.example.demo.cucumber;

import com.example.demo.domain.HelloMessage;
import com.example.demo.service.HelloService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StepDefinitions {

    @Autowired
    private HelloService helloService;

    private String greeting;
    private HelloMessage message;

    @Given("Je suis arrivé sur Spring")
    public void i_have_a_greeting_service() {
        // Initialization if needed
    }

    @When("Le service me dit bonjour")
    public void i_ask_for_a_greeting() {
        greeting = helloService.sayHello();
    }

    @When("J'envoie le message {string} au service")
    public void i_send_a_message_to_service(String sendingMessage) {
        message = new HelloMessage.HelloBuilder().name(sendingMessage).build();
        greeting = helloService.respondTo(message);
    }

    @Then("Le service devrait me saluer en réponse à mon message")
    public void i_should_receive() {
        Assertions.assertThat(greeting).isEqualTo("Hello, " + message.getName() + "!");
    }

    @Then("Je devrais recevoir {string}")
    public void i_should_receive(String expectedGreeting) {
        Assertions.assertThat(greeting).isEqualTo(expectedGreeting);
    }
}
