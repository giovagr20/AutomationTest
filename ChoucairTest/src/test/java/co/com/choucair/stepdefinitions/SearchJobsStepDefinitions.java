package co.com.choucair.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certification.finacle.userinterface.FinacleLoginHome;
//import co.com.bancolombia.certification.finacle.userinterface.FinacleLoginHome; //Sinde interface
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class SearchJobsStepDefinitions {

	@Managed(driver = "IExplorer")
	private WebDriver hisBrowser;
	private Actor transactionalUser = Actor.named("transactionalUser");
	private FinacleLoginHome finacleLoginHome;

	@Before
	public void setUp() {
		transactionalUser.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^User is main page of finacle$")
	public void userIsMainPageOfFinacle() throws Exception {
		transactionalUser.attemptsTo(Open.browserOn(finacleLoginHome));
		hisBrowser.switchTo().defaultContent();
		hisBrowser.switchTo().frame("loginFrame");
	}

	@When("^User submits user and password$")
	public void userSubmitsUserAndPassword() throws Exception {
		transactionalUser.attemptsTo(Enter.theValue("apoojary").into(finacleLoginHome.TXT_USER),
				Enter.theValue("T7l(JwQ$EDm7G4").into(finacleLoginHome.TXT_PASSWORD),
				Click.on(finacleLoginHome.BTN_SUBMIT));
	}

	@Then("^User logged into finacle$")
	public void userLoggedIntoFinacle() throws Exception {
		System.out.println("Finalizó OK");
	}
	
}
