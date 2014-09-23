package com.codurance;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by tobyretallick on 23/09/2014.
 */

@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty",
        "html:target/test-report",
        "json:target/test-report.json",
        "junit:target/test-report.xml"},
        features="src/test/resources")
public class TestRunner {
}
