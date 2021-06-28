package co.com.pruebachoucair.userinterface;


import co.com.pruebachoucair.util.Constantes;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl(Constantes.URL)

public class ChoucairHomePage extends PageObject {

    public static final Target CLICKENACEPTAR = Target.the("Click aceptar")
            .located(By.id("cookie_action_close_header"));


    public static final Target CLICKEMPLEADO = Target.the("Click empleado")
            .located(By.id("menu-item-550"));
}
