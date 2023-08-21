package com.co.proyecto.stepdefinitions;

import com.co.proyecto.questions.ValidarTexto;
import com.co.proyecto.tasks.Rellenar;
import com.co.proyecto.tasks.RellenarContrasenia;
import com.co.proyecto.tasks.RellenarSegundo;
import com.co.proyecto.tasks.RellenarTercero;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.co.proyecto.userinterfaces.PaginaFinal.TXT_VALIDACION;
import static org.hamcrest.CoreMatchers.containsString;

public class UTestRegistroStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^El usuario ingresa a https://utest\\.com$")
    public void elUsuarioIngresaAHttpsUtestCom() {
        OnStage.theActorCalled("Brandon").wasAbleTo(Open.url("https://utest.com/"));
    }


    @When("^Rellena el formulario$")
    public void rellenaElFormulario() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Rellenar.elFormulario("January", "1", "1990" ),
                RellenarSegundo.formulario(),
                RellenarTercero.formulariotercero(),
                RellenarContrasenia.contrasenia()
        );
    }

    @Then("^Podra confirmar el registro$")
    public void podraConfirmarElRegistro() {
        OnStage.theActorInTheSpotlight().should(
              GivenWhenThen.seeThat(ValidarTexto.on(TXT_VALIDACION),containsString("Welcome to the world")));
    }

}
