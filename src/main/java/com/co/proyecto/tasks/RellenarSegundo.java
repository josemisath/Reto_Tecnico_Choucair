package com.co.proyecto.tasks;

import com.co.proyecto.models.DataTest;
import com.github.javafaker.Faker;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.co.proyecto.userinterfaces.FormularioSegundo.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RellenarSegundo implements Task {

    List<DataTest> paisList;
    Faker faker = new Faker();

    public RellenarSegundo(List<DataTest> paisList) {
        this.paisList = paisList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LST_PAIS,isVisible()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(LST_PAIS),
                Enter.theValue(paisList.get(0).getPais()).into(TXT_PAIS),
                Enter.keyValues(Keys.ENTER).into(TXT_PAIS),
                Enter.theValue(paisList.get(0).getCiudad()).into(TXT_CIUDAD),
                Enter.keyValues(Keys.DOWN).into(TXT_CIUDAD),
                Enter.keyValues(Keys.ENTER).into(TXT_CIUDAD),
                Enter.theValue(faker.address().zipCode()).into(TXT_ZIP),
                Click.on(BTN_PROXIMO)
        );

    }

    public static RellenarSegundo formulario(List<DataTest> paisList){
        return Instrumented.instanceOf(RellenarSegundo.class).withProperties(paisList);
    }

}
