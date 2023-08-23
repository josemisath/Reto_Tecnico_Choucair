package com.co.proyecto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioSegundo {

    public static final Target LST_PAIS = Target.the("desplegable")
            .locatedBy("//span[@aria-label='Select a country']");

    public static final Target TXT_PAIS = Target.the("Rellenar país")
            .locatedBy("//input[@aria-owns='ui-select-choices-2']");
    public static final Target TXT_CIUDAD = Target.the("Rellenar ciduad")
            .locatedBy("//input[@ng-if='isGoogleMapsAvailable()']");
    public static final Target TXT_ZIP = Target.the("Rellenar código postal")
            .locatedBy("//input[@id='zip']");
    public static final Target BTN_PROXIMO = Target.the("Boton registrar")
            .locatedBy("//a[@aria-label='Next step - select your devices']");
}
