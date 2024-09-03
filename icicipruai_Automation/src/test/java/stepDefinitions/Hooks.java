package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.After;
import utils.TestContexSetup;

public class Hooks {
	TestContexSetup testContexSetup;

	public Hooks(TestContexSetup testContexSetup) {
		this.testContexSetup = testContexSetup;
	}

	@After
	public void afterScenario() throws IOException {
//		testContexSetup.testBase.WebDriverManager().quit();
	}
}
