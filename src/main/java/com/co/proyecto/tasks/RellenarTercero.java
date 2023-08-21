package com.co.proyecto.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static com.co.proyecto.userinterfaces.FormularioPrincipal.*;
import static com.co.proyecto.userinterfaces.FormularioTercero.*;

public class RellenarTercero implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(TXT_DISPOSITIVO),
                Enter.theValue("Alcatel").into(SELECT_DISPOSITIVO),
                Enter.keyValues(Keys.ENTER).into(SELECT_DISPOSITIVO),
                JavaScriptClick.on(TXT_MODELO),
                Enter.theValue("Crystal").into(SELECT_MODELO),
                Enter.keyValues(Keys.ENTER).into(SELECT_MODELO),
                JavaScriptClick.on(TXT_SISTEMAOP),
                Enter.theValue("Android 1.5").into(SELECT_SISTEMAOP),
                Enter.keyValues(Keys.ENTER).into(SELECT_SISTEMAOP),
                JavaScriptClick.on(BTN_SIGUIENTEPASO)


        );
    }

    public static RellenarTercero formulariotercero(){
        return Instrumented.instanceOf(RellenarTercero.class).withProperties();
    }

}
