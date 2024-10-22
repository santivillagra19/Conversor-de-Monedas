package org.example;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConvertirMoneda {
    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta,
                                 Scanner lectura) {
        double cantidad;
        BigDecimal cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("La tasa de conversión para hoy\n1 " + monedaBase + " = " + monedas.conversion_rate() +
                " " + monedaTarget);
        System.out.println("-> Ingrese la cantidad de " + monedaBase);

        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = new BigDecimal(cantidad * monedas.conversion_rate()).setScale(2, RoundingMode.HALF_UP);

        System.out.println(cantidad + " " + monedaBase + " = " + cantidadConvertida + " " + monedas.target_code());
    }

    public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura) {
        System.out.println("Ingrese el codigo de la moneda base: ");
        String monedaBase = lectura.nextLine().toUpperCase();

        System.out.println("Ingrese la moneda objetivo: ");
        String monedaObjetivo = lectura.nextLine().toUpperCase();

        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}
