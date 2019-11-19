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

	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private Actor transactionalUser = Actor.named("transactionalUser");
	private NavigateChoucairURL navigateChoucairURL;

	@Before
	public void setUp() {
		transactionalUser.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^User is in URL choucair$")
	public void userIsInURLChoucair() throws Exception {
		transactionalUser.attemptsTo(Open.browserOn(navigateChoucairURL));
		hisBrowser.switchTo().defaultContent();
		
	}

	@When("^User choose option empleo$")
	public void userChooseOptionEmpleo() throws Exception {
		transactionalUser.attemptsTo(Click.on("btn-menu")
			,Click.on("menu-item-550"));
	}

	@When("^User find out empleos disponibles$")
	public void userFindOutEmpleosDisponibles() throws Exception {
				Click.on(navigateChoucairURL.BTN_SUBMIT));
	}

	
	@Then("^User put word Developer and Medellin$")
	public void userPutWordDeveloperAndMedellin() throws Exception {
		transactionalUser.attemptsTo(Enter.theValue("Developer").into(navigateChoucairURL.TXT_DEV),
					     Enter.theValue("Developer").into(navigateChoucairURL.TXT_CIT));
					     
	}
	
	@Then("^User submit Buscar Trabajos$")
	public void userSubmitBuscarTrabajos() throws Exception {
              transactionalUser.attempsTo(
		      Click.on(navigateChoucairURL.BTN_SUBMIT));
	}
	
}
