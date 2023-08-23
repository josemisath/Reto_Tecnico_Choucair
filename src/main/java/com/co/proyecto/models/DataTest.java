package com.co.proyecto.models;

public class DataTest {

    String pais;
    String ciudad;
    String  zip;
    String computador;
    String version;
    String idioma;
    String dispositivo;
    String modelo;
    String sistemaop;
    String contrasenia;
    String validarcontrasenia;

    public DataTest(String pais, String ciudad, String zip, String computador, String version, String idioma, String dispositivo, String modelo, String sistemaop, String contrasenia, String validarcontrasenia) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.zip = zip;
        this.computador = computador;
        this.version = version;
        this.idioma = idioma;
        this.dispositivo = dispositivo;
        this.modelo = modelo;
        this.sistemaop = sistemaop;
        this.contrasenia = contrasenia;
        this.validarcontrasenia = validarcontrasenia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getComputador() {
        return computador;
    }

    public void setComputador(String computador) {
        this.computador = computador;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSistemaop() {
        return sistemaop;
    }

    public void setSistemaop(String sistemaop) {
        this.sistemaop = sistemaop;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getValidarcontrasenia() {
        return validarcontrasenia;
    }

    public void setValidarcontrasenia(String validarcontrasenia) {
        this.validarcontrasenia = validarcontrasenia;
    }
}
