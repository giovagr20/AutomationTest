package co.com.choucair.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
features = "src/test/resources/features/choucairtest.feature", 
glue = "co.com.choucair.stepdefinitions", 
snippets = SnippetType.CAMELCASE)

public class SearchJobs {
}
