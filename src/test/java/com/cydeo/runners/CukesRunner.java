package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//This class like a cockpit of a plan which controls and manages whole project
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/myPractice_Features",
        glue = "com/cydeo/pages/myPractice_StepDefinitions",
        dryRun = false,
        tags ="@case7"

)
public class CukesRunner {
}
