package org.example.utilidades;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

    public boolean validarExpresionRegular(String cadena, String expresionregular) {
        Pattern patron=Pattern.compile(expresionregular);
        Matcher coincidencia=patron.matcher(cadena);
        if(coincidencia.matches()){
            return true;
        }else{
            return false;
        }

    }
    public int aleatorio(){

        Random random = new Random();

        int numero = random.nextInt(501)+1;

        return numero;
    }
    public boolean validarFormatoFecha(String cadena, String expresionRegular){

        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia=patron.matcher(cadena);
        if (coincidencia.matches()){ //si hay coincidencia
            return true;
        }
        else {
            return false;
        }
    }

}
