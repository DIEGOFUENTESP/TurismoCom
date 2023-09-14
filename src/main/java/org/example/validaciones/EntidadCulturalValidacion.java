package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class EntidadCulturalValidacion {

    protected Util util = new Util();

    public boolean validarSecretaria(String texto) throws Exception {
        if (texto.length() < 10 || texto.length() > 70) {
            throw new Exception(Mensaje.NUMERO_CARACTERES_INVALIDO.getMensaje());
        } else {
            return true;
        }

    }

}



