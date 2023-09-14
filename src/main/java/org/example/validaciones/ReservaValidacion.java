package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReservaValidacion {

    protected Util util = new Util();


    public boolean ValidarFormato(String fecha)throws Exception{
        if (!util.validarFormatoFecha(fecha,"^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$")){
            throw new Exception(Mensaje.FECHA_FORMATO_INVALIDO.getMensaje());
        }else {
            return true;
        }
    }

    public boolean validarNumeroPersona(int numeroPersona)throws Exception{
        if(numeroPersona >4){
            throw new Exception(Mensaje.NUMERO_PERSONA.getMensaje());
        }else {
            return true;
        }

    }
}
