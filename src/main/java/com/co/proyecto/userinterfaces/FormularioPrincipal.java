package com.co.proyecto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioPrincipal {

    public static final Target BTN_REGISTRAR = Target.the("Boton registrar")
            .locatedBy("//a[@class='unauthenticated-nav-bar__sign-up']");

    public static final Target TXT_NOMBRE = Target.the("Nombre")
            .locatedBy("//input[@id='firstName']");

    public static final Target TXT_APELLIDO = Target.the("Apellido")
            .locatedBy("//input[@id='lastName']");

    public static final Target TXT_CORREO = Target.the("Correo")
            .locatedBy("//input[@id='email']");

    public static final Target SELECT_MES = Target.the("Mes de nacimiento")
            .locatedBy("//select[@id='birthMonth']");

    public static final Target SELECT_DIA = Target.the("Día de nacimiento")
            .locatedBy("//select[@id='birthDay']");

    public static final Target SELECT_ANIO = Target.the("Año de nacimiento")
            .locatedBy("//select[@id='birthYear']");

    public static final Target BTN_LENGUAJE = Target.the("Lenguaje")
            .locatedBy("//input[@type='search']");

    public static final Target BTN_SIGUIENTE = Target.the("Siguiente")
            .locatedBy("//a[@aria-label='Next step - define your location']");
}
