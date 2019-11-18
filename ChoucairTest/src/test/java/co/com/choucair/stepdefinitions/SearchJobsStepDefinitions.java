package co.com.choucair.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.choucair.userinterface.SearchJobChoucairURL;
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

	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private Actor userChoucair = Actor.named("userChoucair");
	private SearchJobChoucairURL searchJobChoucairURL;

	@Before
	public void setUp() {
		userChoucair.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^User is in URL choucair$")
	public void userIsInURLChoucair() throws Exception {
	userChoucair.attemptsTo(Open.browserOn(searchJobChoucairURL));	
	hisBrowser.switchTo().defaultContent();
	}
	
	
	//@Given("^User is main page of finacle$")
	//public void userIsMainPageOfFinacle() throws Exception {
		//userChoucair.attemptsTo(Open.browserOn(searchJobChoucairURL));
		//hisBrowser.switchTo().defaultContent();
		//hisBrowser.switchTo().frame("loginFrame");
	//}

	
}
