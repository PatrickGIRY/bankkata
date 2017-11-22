package bankkata.features.stedefs;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class PrintStatementStepDefs implements En {

    public PrintStatementStepDefs() {

        Given("^a client makes a deposit of (\\d+) on (\\d+-\\d+-\\d+)$", (Integer amount, String date) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Given("^a deposit of (\\d+) on (\\d+-\\d+-\\d+)$", (Integer amount, String date) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Given("^a withdrawal of (\\d+) on (\\d+-\\d+-\\d+)$", (Integer amount, String date) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("^she prints her bank statement$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("^she would see$", (String statement) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

    }
}
