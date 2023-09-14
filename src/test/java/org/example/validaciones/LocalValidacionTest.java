package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LocalValidacionTest {

    private LocalValidacion validacion;

    @BeforeEach

    public void configurarPruebas(){
        this.validacion=new LocalValidacion();
        System.out.println("iniciando prueba...");
    }
    @Test
    public void validarNitCorrectamente(){
        String nitPrueba="1234567890";
        Boolean respuesta=Assertions.assertDoesNotThrow(()->this.validacion.validarNit(nitPrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarNitIncorrectamente(){
        String nitPrueba="1234";
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.validacion.validarNit(nitPrueba));
        Assertions.assertEquals(Mensaje.NIT_INVALIDO.getMensaje(),respuesta.getMessage());
    }
    @Test
    public void validarNombresFuncionaCorrectamente(){
        String nombrePrueba="comfama";
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.validacion.validarNombre(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarNombresFuncionaIncorrectamentePorNumerosCaracteres(){
        String nombrePrueba="qwertyuiopasdfghjklzxcvbnmkjhgsfs";
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.validacion.validarNombre(nombrePrueba));
        Assertions.assertEquals(Mensaje.NOMBRE_EMPRESA_INVALIDO.getMensaje(),respuesta.getMessage());
    }


}