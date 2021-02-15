package com.clases;

public class Personas {
    private String cedula;
    private String celular;

    public Personas(String cedula, String celular) {
        this.cedula=cedula;
        this.celular=celular;

    }

    public Personas() {

    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCelular()
    {
        return celular;
    }

    public void setCelular(String celular)
    {
        this.celular = celular;
    }
}
