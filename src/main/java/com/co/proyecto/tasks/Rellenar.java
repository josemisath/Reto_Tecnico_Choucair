package com.co.proyecto.tasks;

import com.github.javafaker.Faker;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.Random;

import static com.co.proyecto.userinterfaces.FormularioPrincipal.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Rellenar implements Task {

    Faker faker = new Faker();
    Random random = new Random();


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_REGISTRAR,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_REGISTRAR),
                Enter.theValue(faker.name().firstName()).into(TXT_NOMBRE),
                Enter.theValue(faker.name().lastName()).into(TXT_APELLIDO),
                Enter.theValue(faker.internet().emailAddress()).into(TXT_CORREO),
                SelectFromOptions.byIndex(random.nextInt(12)).from(SELECT_MES),
                SelectFromOptions.byIndex(random.nextInt(28)).from(SELECT_DIA),
                SelectFromOptions.byIndex(random.nextInt(40)).from(SELECT_ANIO),
                JavaScriptClick.on(BTN_LENGUAJE),
                Enter.keyValues(Keys.ENTER).into(BTN_LENGUAJE),
                JavaScriptClick.on(BTN_SIGUIENTE)


        );
    }

    public static Rellenar elFormulario(){
        return Instrumented.instanceOf(Rellenar.class).withProperties();
    }

}
