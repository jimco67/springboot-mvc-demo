package com.example.demo.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class StepDefinitions {

    private String greeting;

    @Given("I have a greeting service")
    public void i_have_a_greeting_service() {
        // Initialization if needed
    }

    @When("I ask for a greeting")
    public void i_ask_for_a_greeting() {
        greeting = "Hello from Cucumber!";
    }

    @Then("I should receive {string}")
    public void i_should_receive(String expectedGreeting) {
        Assertions.assertThat(greeting).isEqualTo(expectedGreeting);
    }
}
