package com.co.proyecto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarTexto implements Question<String>{

    final Target elemento;

    public ValidarTexto(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public String answeredBy(Actor actor) {
        return elemento.resolveFor(actor).getText();
    }

    public static Question<String> on(Target elemento){
        return new ValidarTexto(elemento);
    }
}
