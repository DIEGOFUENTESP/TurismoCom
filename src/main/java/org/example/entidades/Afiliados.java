package org.example.entidades;

import org.example.entidades.interfaces.Ilegal;
import org.example.entidades.interfaces.Ireporte;
import org.example.validaciones.AfiliadosValidacion;

public class Afiliados extends Usuario implements Ireporte , Ilegal {

    private Integer valorMensualidad;
    private AfiliadosValidacion validacion = new AfiliadosValidacion();

    public Afiliados() {
    }

    @Override
    public boolean registrar() {
        return false;
    }

    public Afiliados(Integer id, String documento, String nombres, String correo, Integer ubicacion, Integer valorMensualidad) {
        super(id, documento, nombres, correo, ubicacion);
        this.valorMensualidad = valorMensualidad;
    }

    public Integer getValorMensualidad() {
        return valorMensualidad;
    }

    public void setValorMensualidad(Integer valorMensualidad) {
        try{
            this.validacion.valorMensualidad(valorMensualidad);
            this.valorMensualidad=valorMensualidad;

        }catch (Exception error){
            System.out.println(error.getMessage());

        }

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

    @Override
    public void consultarInformacionExogena() {

    }
}
