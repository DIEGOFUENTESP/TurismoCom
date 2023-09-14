package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntidadCulturalValidacionTest {

    private EntidadCulturalValidacion Validacion;

    @BeforeEach

    public void configurarPruebas(){
        this.Validacion=new EntidadCulturalValidacion();
        System.out.println("iniciando prueba...");
    }

    @Test

    public void validarCorrectamentePorNumerosCaracteres(){
        String tituloPrueba="qwertyuiopas";
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.Validacion.validarSecretaria(tituloPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test

    public void validarIncorrectamentePorNumerosCaracteres(){
        String tituloPrueba="qwerty";
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.Validacion.validarSecretaria(tituloPrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_INVALIDO.getMensaje(),respuesta.getMessage());
    }



}