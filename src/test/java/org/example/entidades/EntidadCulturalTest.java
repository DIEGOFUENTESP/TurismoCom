package org.example.entidades;

import org.example.validaciones.EmpresaPrivadaValidacion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntidadCulturalTest {



    private EntidadCulturalTest Validacion;


    @BeforeEach

    public void configurarPruebas(){
        this.Validacion=new EntidadCulturalTest();
        System.out.println("iniciando prueba...");
    }

    @Test

    public Double cobrarValorcorrecto(){
        double cobroprueba = 200000 + (0.19*200000) - (0.10*200000);
        return cobroprueba;
    }

}