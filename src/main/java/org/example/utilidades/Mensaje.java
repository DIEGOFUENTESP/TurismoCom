package org.example.utilidades;

public enum Mensaje {

    NUMERO_CARACTERES_INVALIDO("Nombre muy corto"),
    INVALIDO("Invalido"),
    CORREO_INVALIDO("Invalido"),
    UBICACION_INVALIDO("opcion Invalida"),
    COSTO_PERSONA("Precio no permitido"),
    NUMERO_PERSONA("supero numero de personas"),
    FORMATOFECHA("FECHA NO VALIDA"),

    VALIDARFECHAFINAL("fecha no permitida"),
    FECHA_FORMATO_INVALIDO("Todas las fechas deben tener el formato (DD/MM/YYYY)"),
    NOMBRE_EMPRESA_INVALIDO("El nombre de la empresa no puede sobrepasar los 30 caracteres"),
    FECHA_INICIO_MAYOR("La fecha de inicio no puede ser mayor que la fecha de fin"),

    NIT_INVALIDO("El NIT de debe de tener solo 10 digitos");



    private String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
