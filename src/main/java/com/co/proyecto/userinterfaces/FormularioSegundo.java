package com.co.proyecto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioSegundo {
    public static final Target BTN_PROXIMO = Target.the("Boton registrar")
            .locatedBy("//a[@aria-label='Next step - select your devices']");
}
