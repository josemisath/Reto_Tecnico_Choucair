package com.co.proyecto.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;

import static com.co.proyecto.userinterfaces.CrearContrasenia.*;
import static com.co.proyecto.userinterfaces.FormularioPrincipal.BTN_REGISTRAR;


public class RellenarContrasenia implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Jose12345!").into(CREAR_CONTRASENIA),
                Enter.theValue("Jose12345!").into(CONFIRMAR_CONTRASENIA),
                JavaScriptClick.on(CLIC_ACEPTAR),
                JavaScriptClick.on(SEGUNDOCLIC_ACEPTAR),
                //Enter.keyValues(Keys.TAB).into(CLIC_ACEPTAR),
                //Enter.keyValues(Keys.SPACE).into(SEGUNDOCLIC_ACEPTAR),

                JavaScriptClick.on(BTN_COMPLETAR)

        );

    }


    public static RellenarContrasenia contrasenia(){

        return Instrumented.instanceOf(RellenarContrasenia.class).withProperties();

    }

}
