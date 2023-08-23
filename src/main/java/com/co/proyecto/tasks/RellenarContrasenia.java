package com.co.proyecto.tasks;

import com.co.proyecto.models.DataTest;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.co.proyecto.userinterfaces.CrearContrasenia.*;
import static com.co.proyecto.userinterfaces.FormularioPrincipal.BTN_REGISTRAR;


public class RellenarContrasenia implements Task {

    List<DataTest> paisList;

    public RellenarContrasenia(List<DataTest> paisList) {
        this.paisList = paisList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(paisList.get(0).getContrasenia()).into(CREAR_CONTRASENIA),
                Enter.theValue(paisList.get(0).getContrasenia()).into(CONFIRMAR_CONTRASENIA),
                JavaScriptClick.on(CLIC_ACEPTAR),
                JavaScriptClick.on(SEGUNDOCLIC_ACEPTAR),
                //Enter.keyValues(Keys.TAB).into(CLIC_ACEPTAR),
                //Enter.keyValues(Keys.SPACE).into(SEGUNDOCLIC_ACEPTAR),

                JavaScriptClick.on(BTN_COMPLETAR)

        );

    }


    public static RellenarContrasenia contrasenia(List<DataTest> dataTests){

        return Instrumented.instanceOf(RellenarContrasenia.class).withProperties(dataTests);

    }

}
