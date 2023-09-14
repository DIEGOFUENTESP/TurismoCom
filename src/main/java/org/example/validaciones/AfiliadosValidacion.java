package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class AfiliadosValidacion {

    protected Util util = new Util();

    public boolean valorMensualidad(Integer valorMensual)throws Exception{
        if(valorMensual<0 || valorMensual>100000){
            throw new Exception(Mensaje.COSTO_PERSONA.getMensaje());
        } else {
            return true;
        }

    }

}
