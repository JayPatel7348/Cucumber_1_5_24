package TestRunner;


import io.cucumber.core.gherkin.Feature;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.awt.*;

@RunWith(Cucumber.class)
@CucumberOptions(features ="Feature", glue = "stepdefinitions") //File name path "Feature" and "stepdefinitions"
public class TestRunner {
}
