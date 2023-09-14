package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReservaValidacionTest {

    private ReservaValidacion validacion;

    @BeforeEach

    public void configurarPruebas(){
        this.validacion=new ReservaValidacion();
        System.out.println("iniciando prueba...");
    }
    @Test
    public void ValidarFormatoCorrectamente(){
        String formatoPrueba="17/08/2023";
        Boolean respuesta=Assertions.assertDoesNotThrow(()->this.validacion.ValidarFormato(formatoPrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void ValidarFormatoIncorrectamente(){
        String formatoPrueba="2023/08/17";
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.validacion.ValidarFormato(formatoPrueba));
        Assertions.assertEquals(Mensaje.FECHA_FORMATO_INVALIDO.getMensaje(),respuesta.getMessage());
    }
    @Test
    public void validarNumeroPersonaCorrecta(){
        Integer numeroPrueba=3;
        Boolean respuesta=Assertions.assertDoesNotThrow(()->this.validacion.validarNumeroPersona(numeroPrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarNumeroPersonaIncorrecta(){
        Integer numeroPrueba=5;
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.validacion.validarNumeroPersona(numeroPrueba));
        Assertions.assertEquals(Mensaje.NUMERO_PERSONA.getMensaje(),respuesta.getMessage());
    }

}