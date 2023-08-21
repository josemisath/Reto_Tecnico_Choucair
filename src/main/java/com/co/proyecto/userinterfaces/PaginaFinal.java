package com.co.proyecto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaFinal {

    public static final Target TXT_VALIDACION = Target.the("Validacion")
            .locatedBy("//h1[contains(text(),'Welcome to the world')]");

}
