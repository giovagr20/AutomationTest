package co.com.choucair.userinterface;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

 

public class SearchJobChoucairURL extends PageObject {
	
    public static final Target TXT_DEV = Target.the("TXT_SOL_ID_CONTEX").located(By.id("search_keywords"));
    public static final Target TXT_CIT = Target.the("TXT_SOL_ID_CONTEX").located(By.id("search_location"));
    public static final Target BTN_SUBMIT = Target.the("BTN_SUBMIT").located(By.id("search_submit"));
    public static final Target BTN_ACCEPT = Target.the("BTN_ACCEPT").located(By.id("endMenu"));

}
