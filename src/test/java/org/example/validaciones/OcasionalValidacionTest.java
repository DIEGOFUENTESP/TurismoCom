package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OcasionalValidacionTest {

    private OcasionalValidacion OcasionalValidacion;

    @BeforeEach

    public void configurarPruebas(){
        this.OcasionalValidacion=new OcasionalValidacion();
        System.out.println("iniciando prueba...");
    }

    @Test

    public void valorEventoCorrectamente(){
        Integer numeroPrueba=70000;
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.OcasionalValidacion.valorEvento(numeroPrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test

    public void valorEventoIncorrectamente(){
        Integer numeroPrueba=-60000;
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.OcasionalValidacion.valorEvento(numeroPrueba));
        Assertions.assertEquals(Mensaje.COSTO_PERSONA.getMensaje(),respuesta.getMessage());

    }
    @Test

    public void valorEventoMaximoCorrectamente(){
        Integer numeroPrueba=200000;
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.OcasionalValidacion.valorEvento(numeroPrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test

    public void valorEventoMaximoIncorrectamente(){
        Integer numeroPrueba=201000;
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.OcasionalValidacion.valorEvento(numeroPrueba));
        Assertions.assertEquals(Mensaje.COSTO_PERSONA.getMensaje(),respuesta.getMessage());

    }


}