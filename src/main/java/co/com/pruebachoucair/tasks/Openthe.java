package co.com.pruebachoucair.tasks;

import co.com.pruebachoucair.userinterface.ChoucairHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class Openthe implements Task {

    private ChoucairHomePage aplication;


    public static Openthe empleadoModule() {
        return Tasks.instrumented(Openthe.class);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(aplication));//abrio la pagina
        Click.on(ChoucairHomePage.CLICKENACEPTAR);//l edio click en acpetar
        Click.on(ChoucairHomePage.CLICKEMPLEADO);// click modulo empleado



    }
}
