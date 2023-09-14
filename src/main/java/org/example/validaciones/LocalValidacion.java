package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class LocalValidacion {

    protected Util util = new Util();

    public boolean validarNit (String nit) throws Exception{
        if(!util.validarExpresionRegular(nit,"^[0-9]{10,}$")){
            throw new Exception(Mensaje.NIT_INVALIDO.getMensaje());
        }else {
            return true;
        }
    }
    //^[0-9]{10,}$
    public boolean validarNombre(String nombre) throws Exception{
        if (!util.validarExpresionRegular(nombre,"^[A-Za-z ]{1,30}$")){
            throw new Exception(Mensaje.NOMBRE_EMPRESA_INVALIDO.getMensaje());
        }else {
            return true;
        }
    }

}
