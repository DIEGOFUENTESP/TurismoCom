package org.example.entidades;

import org.example.utilidades.Mensaje;
import org.example.validaciones.UsuarioValidacion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Usuario {

    private Integer id;
    private String documento;
    private String nombres;
    private String correo;
    private Integer ubicacion;

    protected UsuarioValidacion validar = new UsuarioValidacion();

    public Usuario() {
    }

    public Usuario(Integer id, String documento, String nombres, String correo, Integer ubicacion) {
        this.id = id;
        this.documento = documento;
        this.nombres = nombres;
        this.correo = correo;
        this.ubicacion = ubicacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if (documento.length()<10){
            System.out.println(Mensaje.NUMERO_CARACTERES_INVALIDO);
        }else {
            this.documento = documento;
        }
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        try {
            this.validar.validarNombres(nombres);
            this.nombres = nombres;
        }catch (Exception error){
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[31m");
        }

    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        try {
            this.validar.validarCorreo(correo);
            this.correo = correo;
        }catch (Exception error){
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[31m");
        }
        this.correo = correo;
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        try {
            this.validar.validarUbicacion(ubicacion);
            this.ubicacion = ubicacion;
        }catch (Exception error){
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[31m");
        }
    }
    //metodos ordinarios
    public String generarContraseña(){
        return null;
    }

    public abstract boolean registrar();
}
