package bdd.eBay.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "html:target/cucumber", "json:target/cucumber-json.json" }, features = {
		"src/test/resources/Features" }, glue = { "bdd.eBay.stepDefinitions" }, tags = { "" }, monochrome = true)

public class EbayTestRunner extends AbstractTestNGCucumberTests {

}


