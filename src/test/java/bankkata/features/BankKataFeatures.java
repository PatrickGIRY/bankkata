package bankkata.features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
                 tags = {"~@ignore"},
                 plugin = {"pretty", "html:target/cucumber"})
public class BankKataFeatures {
}
