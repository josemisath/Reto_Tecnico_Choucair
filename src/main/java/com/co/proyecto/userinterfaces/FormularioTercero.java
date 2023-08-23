package com.co.proyecto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioTercero {


    public static final Target TXT_COMPUTADOR = Target.the("Ingresar Modelo")
            .locatedBy("(//span[@aria-label='Select OS'])[1]");
    public static final Target SELECT_COMPUTADOR = Target.the("Seleccionar modelo")
            .locatedBy("(//input[@placeholder='Select OS'])[1]");

    public static final Target TXT_VERSION = Target.the("Ingresar Modelo")
            .locatedBy("//span[@aria-label='Select a Version']");
    public static final Target SELECT_VERSION = Target.the("Seleccionar modelo")
            .locatedBy("(//input[@aria-label='Select box'])[2]");

    public static final Target TXT_IDIOMA = Target.the("Ingresar Sistema operativo")
            .locatedBy("//span[@aria-label='Select OS language']");
    public static final Target SELECT_IDIOMA = Target.the("Sistema operativo")
            .locatedBy("(//input[@aria-label='Select box'])[3]");
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
