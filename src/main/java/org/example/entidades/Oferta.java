package org.example.entidades;

import org.example.validaciones.OfertaValidacion;



public class Oferta {

    private Integer id;
    private String titulo;
    private String descripcion;
    private String fechainicio;
    private String fechafin;
    private Double costopersona;
    private Empresa local;


    private OfertaValidacion validar = new OfertaValidacion();

    public Oferta() {
    }

    public Oferta(Integer id, String titulo, String descripcion, String fechainicio, String fechafin, Double costopersona, Empresa local) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.costopersona = costopersona;
        this.local = local;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        try {
            validar.validarTitulo(titulo);
            this.titulo = titulo;
        } catch (Exception e) {
            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[31m");
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        try {
            validar.ValidarFormato(fechainicio);
            this.fechainicio = fechainicio;
        } catch (Exception e) {
            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[31m");
        }

    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        try {
            validar.ValidarFechaFinal(fechainicio,fechafin);
            this.fechafin = fechafin;
        } catch (Exception e) {
            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[31m");
        }

    }

    public Double getCostopersona() {
        return costopersona;
    }

    public void setCostopersona(Double costopersona) {
        try {
            validar.validarCostoPersona(costopersona);
            this.costopersona = costopersona;
        } catch (Exception e) {
            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[31m");
        }

    }

    public Empresa getLocal() {
        return local;
    }

    public void setLocal(Empresa local) {
        this.local = local;
    }
}





