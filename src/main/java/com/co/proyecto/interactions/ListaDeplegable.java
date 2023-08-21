package com.co.proyecto.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class ListaDeplegable implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static ListaDeplegable on(){
        return Instrumented.instanceOf(ListaDeplegable.class).withProperties();
    }

}
