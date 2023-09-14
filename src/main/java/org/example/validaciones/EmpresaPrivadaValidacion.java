package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class EmpresaPrivadaValidacion {
    protected Util util = new Util();

    public boolean validarPrivada(String texto) throws Exception {
        if (texto.length() < 10) {
            throw new Exception(Mensaje.NUMERO_CARACTERES_INVALIDO.getMensaje());
        } else {
            return true;
        }

    }
}
