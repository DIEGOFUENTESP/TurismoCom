package org.example.entidades;

import org.example.entidades.interfaces.Ireporte;

public class EntidadCultural extends Empresa implements Ireporte {

    private String secretaria;

    private String mision;

    private Integer cobrar;

    @Override
    public boolean registrar() {
        return false;
    }

    @Override
    public Double cobrar() {
        Integer valorBase=200000;
        Double iva=0.19;
        double cobro = valorBase + (iva*valorBase) - (0.10*valorBase);
        return cobro;
    }

    @Override
    public void generarReporte() {

    }

    @Override
    public void editarReporte(Integer id, String datosNuevos) {

    }

    @Override
    public void buscarReporte(Integer id) {

    }
}
