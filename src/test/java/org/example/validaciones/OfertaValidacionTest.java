package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

class OfertaValidacionTest {

    private OfertaValidacion validacion;

    @BeforeEach

    public void configurarPruebas(){
        this.validacion=new OfertaValidacion();
        System.out.println("iniciando prueba...");
    }
    @Test
    public void validarTituloCorrectamente(){
        String tituloPrueba="qwertyuiopasdrtfdesaio";
        Boolean respuesta= Assertions.assertDoesNotThrow(()->this.validacion.validarTitulo(tituloPrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarTituloIncorrectamentePorNumerosCaracteres(){
        String tituloPrueba="qwertyuiopa";
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.validacion.validarTitulo(tituloPrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_INVALIDO.getMensaje(),respuesta.getMessage());
    }
    @Test
    public void validarTituloIncorrectamentePorCaracteresInvalidos(){
        String tituloPrueba="123456789012345678901";
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.validacion.validarTitulo(tituloPrueba));
        Assertions.assertEquals(Mensaje.INVALIDO.getMensaje(),respuesta.getMessage());
    }
    @Test
    public void validarCostoPersonaCorrectamente(){
        Double costoPersonaPrueba=1.1;
        Boolean respuesta=Assertions.assertDoesNotThrow(()->this.validacion.validarCostoPersona(costoPersonaPrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarCostoPersonaIncorrecta(){
        Double costoPersonaPrueba=-1.1;
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.validacion.validarCostoPersona(costoPersonaPrueba));
        Assertions.assertEquals(Mensaje.COSTO_PERSONA.getMensaje(),respuesta.getMessage());
    }
    @Test
    public void ValidarFormatoCorrectamente() {
        String formatoPrueba = "17/08/2023";
        Boolean respuesta = Assertions.assertDoesNotThrow(()-> this.validacion.ValidarFormato(formatoPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void ValidarFormatoIncorrectamente() {
        String formatoPrueba = "2023/08/17";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.ValidarFormato(formatoPrueba));
        Assertions.assertEquals(Mensaje.FORMATOFECHA.getMensaje(),respuesta.getMessage());
    }
    @Test
    public void ValidarFechaFinalCorrectamente() {
        String fechaInicial = "01/01/2023";
        String fechaFinal = "17/08/2023";
        Boolean respuesta = Assertions.assertDoesNotThrow(()-> this.validacion.ValidarFechaFinal(fechaInicial,fechaFinal));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void ValidarFechaFinalIncorrectamente() {
        String fechaInicial = "01/12/2023";
        String fechaFinal = "17/08/2023";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.ValidarFechaFinal(fechaInicial,fechaFinal));
        Assertions.assertEquals(Mensaje.FECHA_INICIO_MAYOR.getMensaje(),respuesta.getMessage());
    }
    @Test
    public void ValidarFechaFinalFormatoIncorrectamente() {
        String fechaInicial = "2023-12-01";
        String fechaFinal = "17/08/2023";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.ValidarFechaFinal(fechaInicial,fechaFinal));
        Assertions.assertEquals(Mensaje.FECHA_FORMATO_INVALIDO.getMensaje(),respuesta.getMessage());
    }
}
