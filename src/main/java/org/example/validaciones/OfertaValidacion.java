package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OfertaValidacion {

    protected Util util = new Util();

    public OfertaValidacion() {
    }
    public boolean validarTitulo(String titulo) throws Exception{
        if(titulo.length()<20){
            throw new Exception(Mensaje.NUMERO_CARACTERES_INVALIDO.getMensaje());
        } else if (!util.validarExpresionRegular(titulo,"^[A-Za-z ]+$")) {
            throw  new Exception(Mensaje.INVALIDO.getMensaje());
        }else {
            return true;
        }
    }
    public boolean validarCostoPersona(Double costoPersona)throws Exception{
        if(costoPersona<0){
            throw new Exception(Mensaje.COSTO_PERSONA.getMensaje());
        } else {
            return true;
        }

    }
    public boolean ValidarFormato(String fecha)throws Exception{
        String patronFecha = "\\b(\\d{2})/(\\d{2})/(\\d{4})\\b";
        Pattern patron = Pattern.compile(patronFecha);
        Matcher coincidencia=patron.matcher(fecha);
        if(!coincidencia.matches()){
            throw  new Exception(Mensaje.FORMATOFECHA.getMensaje());
        }else{
            return true;
        }
    }

    public boolean ValidarFechaFinal(String fechaInial, String fechaFinal)throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date primeraFecha = sdf.parse(fechaInial);
            Date segundaFecha = sdf.parse(fechaFinal);
            if (primeraFecha.after(segundaFecha)) {
                throw new Exception(Mensaje.FECHA_INICIO_MAYOR.getMensaje());
            }
            return true;
        } catch (ParseException e) {
            throw new Exception(Mensaje.FECHA_FORMATO_INVALIDO.getMensaje());
        }
    }

}
