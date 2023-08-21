package com.co.proyecto.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.proyecto.userinterfaces.FormularioSegundo.BTN_PROXIMO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RellenarSegundo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_PROXIMO,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_PROXIMO)
        );

    }

    public static RellenarSegundo formulario(){
        return Instrumented.instanceOf(RellenarSegundo.class).withProperties();
    }

}
