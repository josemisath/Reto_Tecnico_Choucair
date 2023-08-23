package com.co.proyecto.tasks;

import com.co.proyecto.models.DataTest;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.co.proyecto.userinterfaces.FormularioPrincipal.*;
import static com.co.proyecto.userinterfaces.FormularioTercero.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RellenarTercero implements Task {

    List<DataTest> paisList;

    public RellenarTercero(List<DataTest> paisList) {
        this.paisList = paisList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_COMPUTADOR,isVisible()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(TXT_COMPUTADOR),
                Enter.theValue(paisList.get(0).getComputador()).into(SELECT_COMPUTADOR),
                Enter.keyValues(Keys.ENTER).into(SELECT_COMPUTADOR),
                JavaScriptClick.on(TXT_VERSION),
                Enter.theValue(paisList.get(0).getVersion()).into(SELECT_VERSION),
                Enter.keyValues(Keys.ENTER).into(SELECT_VERSION),
                JavaScriptClick.on(TXT_IDIOMA),
                Enter.theValue(paisList.get(0).getIdioma()).into(SELECT_IDIOMA),
                Enter.keyValues(Keys.ENTER).into(SELECT_IDIOMA),
                JavaScriptClick.on(TXT_DISPOSITIVO),
                Enter.theValue(paisList.get(0).getDispositivo()).into(SELECT_DISPOSITIVO),
                Enter.keyValues(Keys.ENTER).into(SELECT_DISPOSITIVO),
                JavaScriptClick.on(TXT_MODELO),
                Enter.theValue(paisList.get(0).getModelo()).into(SELECT_MODELO),
                Enter.keyValues(Keys.ENTER).into(SELECT_MODELO),
                JavaScriptClick.on(TXT_SISTEMAOP),
                Enter.theValue(paisList.get(0).getSistemaop()).into(SELECT_SISTEMAOP),
                Enter.keyValues(Keys.ENTER).into(SELECT_SISTEMAOP),
                JavaScriptClick.on(BTN_SIGUIENTEPASO)


        );
    }

    public static RellenarTercero formulariotercero(List<DataTest> paisList){
        return Instrumented.instanceOf(RellenarTercero.class).withProperties(paisList);
    }

}
