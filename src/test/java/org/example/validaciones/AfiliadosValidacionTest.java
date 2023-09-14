package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfiliadosValidacionTest {

    private AfiliadosValidacion AfiliadosValidacion;

    @BeforeEach

    public void configurarPruebas(){
        this.AfiliadosValidacion=new AfiliadosValidacion();
        System.out.println("iniciando prueba...");
    }

    @Test

    public void valorMensualidadCorrectamente(){
        Integer numeroPrueba=80000;
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.AfiliadosValidacion.valorMensualidad(numeroPrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test

    public void valorMensualidadIncorrectamente(){
        Integer numeroPrueba=-80000;
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.AfiliadosValidacion.valorMensualidad(numeroPrueba));
        Assertions.assertEquals(Mensaje.COSTO_PERSONA.getMensaje(),respuesta.getMessage());

    }
    @Test

    public void valorMensualidadMaximoCorrectamente(){
        Integer numeroPrueba=100000;
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.AfiliadosValidacion.valorMensualidad(numeroPrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test

    public void valorMensualidadMaximoIncorrectamente(){
        Integer numeroPrueba=101000;
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.AfiliadosValidacion.valorMensualidad(numeroPrueba));
        Assertions.assertEquals(Mensaje.COSTO_PERSONA.getMensaje(),respuesta.getMessage());

    }



}