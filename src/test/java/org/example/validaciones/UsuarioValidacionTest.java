package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {

    private UsuarioValidacion validacion;

    @BeforeEach

    public void configurarPruebas(){
        this.validacion=new UsuarioValidacion();
        System.out.println("iniciando prueba...");
    }
    @Test
    public void validarNombresFuncionaCorrectamente(){
        String nombrePrueba="Diego fuentes";
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarNombresFuncionaIncorrectamentePorNumerosCaracteres(){
        String nombrePrueba="Diego";
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_INVALIDO.getMensaje(),respuesta.getMessage());
    }
    @Test
    public void validarNombresFuncionaIncorrectamentePorCaracteresInvalidos(){
        String nombrePrueba="1234567890";
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertEquals(Mensaje.INVALIDO.getMensaje(),respuesta.getMessage());
    }
    @Test
    public void validarCorreoFuncionaCorrectamente(){
        String correoPrueba="juan@gmail.com";
        Boolean respuesta=Assertions.assertDoesNotThrow(()->this.validacion.validarCorreo(correoPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarCorreoFincionaIncorrectoPorFormato(){
        String correoPrueba="juan.com";
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.validacion.validarCorreo(correoPrueba));
        Assertions.assertEquals(Mensaje.CORREO_INVALIDO.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarUbicacionCorrecta(){
        Integer ubicacionPrueba=4;
        Boolean respuesta=Assertions.assertDoesNotThrow(()->this.validacion.validarUbicacion(ubicacionPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarUbicacionIncorrecta(){
        Integer ubicacionPrueba=5;
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.validacion.validarUbicacion(ubicacionPrueba));
        Assertions.assertEquals(Mensaje.UBICACION_INVALIDO.getMensaje(),respuesta.getMessage());
    }
}