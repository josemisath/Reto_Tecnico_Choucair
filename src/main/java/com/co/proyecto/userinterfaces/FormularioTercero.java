package com.co.proyecto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioTercero {


    public static final Target TXT_DISPOSITIVO = Target.the("Dispositivo")
            .locatedBy("//span[@aria-label='Select Brand']");
    public static final Target SELECT_DISPOSITIVO = Target.the("Dispositivo")
            .locatedBy("//input[@placeholder='Select Brand']");

    public static final Target TXT_MODELO = Target.the("Ingresar Modelo")
            .locatedBy("//span[@aria-label='Select a Model']");
    public static final Target SELECT_MODELO = Target.the("Seleccionar modelo")
            .locatedBy("(//input[@aria-label='Select box'])[5]");
    public static final Target TXT_SISTEMAOP = Target.the("Ingresar Sistema operativo")
            .locatedBy("(//span[@ng-click='$select.activate()'])[6]");
    public static final Target SELECT_SISTEMAOP = Target.the("Sistema operativo")
            .locatedBy("(//input[@aria-label='Select box'])[6]");

    public static final Target BTN_SIGUIENTEPASO = Target.the("Siguiente paso")
            .locatedBy("//a[@aria-label='Next - final step']");
}
