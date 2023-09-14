package org.example.entidades;

import org.example.entidades.interfaces.Ilegal;
import org.example.entidades.interfaces.Ireporte;

public class Ocasional  extends Usuario implements Ireporte {

    private Integer valorEvento;


    public Ocasional() {
    }

    @Override
    public boolean registrar() {
        return false;
    }

    public Ocasional(Integer id, String documento, String nombres, String correo, Integer ubicacion, Integer valorEvento) {
        super(id, documento, nombres, correo, ubicacion);
        this.valorEvento = valorEvento;
    }

    public Integer getValorEvento() {
        return valorEvento;
    }

    public void setValorEvento(Integer valorEvento) {
        this.valorEvento = valorEvento;
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
