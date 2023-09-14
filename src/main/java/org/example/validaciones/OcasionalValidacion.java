package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class OcasionalValidacion {

    protected Util util = new Util();

    public boolean valorEvento(Integer valorEvento)throws Exception{
        if(valorEvento<0 || valorEvento>200000){
            throw new Exception(Mensaje.COSTO_PERSONA.getMensaje());
        } else {
            return true;
        }

    }
}
