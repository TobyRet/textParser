package com.codurance;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by tobyretallick on 23/09/2014.
 */
public class ParserSteps {
    private Parser parser;
    private Command command;

    @Given("^the game parser$")
    public void the_game_parser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        parser = new Parser();
    }

    @When("^the command \"(.*?)\" is parsed$")
    public void the_command_is_parsed(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        command = parser.parse(input);
    }

    @Then("^then the verb is \"(.*?)\"$")
    public void then_the_verb_is(String verb) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(verb, command.getVerb());
    }

    @Then("^there is no direct object$")
    public void there_is_no_direct_object() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertNull("Should be no direct object.", command.getDirectObject());
    }

    @Then("^the parser response is \"(.*?)\"$")
    public void the_parser_response_is(String response) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(response, command.getMessage());
    }
}
