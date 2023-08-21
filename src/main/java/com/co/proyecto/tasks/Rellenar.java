package com.co.proyecto.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.co.proyecto.userinterfaces.FormularioPrincipal.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Rellenar implements Task {

    String mes;
    String dia;
    String anio;

    public Rellenar(String mes, String dia, String anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_REGISTRAR,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_REGISTRAR),
                Enter.theValue("Jose").into(TXT_NOMBRE),
                Enter.theValue("Oliveros").into(TXT_APELLIDO),
                Enter.theValue("of.hesselink@gmail.com").into(TXT_CORREO),
                SelectFromOptions.byVisibleText(mes).from(SELECT_MES),
                SelectFromOptions.byVisibleText(dia).from(SELECT_DIA),
                SelectFromOptions.byVisibleText(anio).from(SELECT_ANIO),
                JavaScriptClick.on(BTN_LENGUAJE),
                Enter.keyValues(Keys.ENTER).into(BTN_LENGUAJE),
                JavaScriptClick.on(BTN_SIGUIENTE)


        );
    }

    public static Rellenar elFormulario(String mes, String dia, String anio){
        return Instrumented.instanceOf(Rellenar.class).withProperties(mes, dia, anio);
    }

}
