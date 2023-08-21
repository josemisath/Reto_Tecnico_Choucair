package com.co.proyecto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CrearContrasenia {


    public static final Target CREAR_CONTRASENIA = Target.the("Contrasenia")
            .locatedBy("//input[@name='password']");
    public static final Target CONFIRMAR_CONTRASENIA = Target.the("Confirmar contrasenia")
            .locatedBy("//input[@name='confirmPassword']");
    public static final Target CLIC_ACEPTAR = Target.the("Clic en aceptar")
            .locatedBy("(//span[@class='checkmark signup-consent__checkbox error'])[1]");
    public static final Target SEGUNDOCLIC_ACEPTAR = Target.the("Clic en segundo aceptar")
            .locatedBy("//span[@class='checkmark signup-consent__checkbox error']");
    public static final Target BTN_COMPLETAR = Target.the("Siguiente")
            .locatedBy("//a[@aria-label='Complete Setup']");


}
