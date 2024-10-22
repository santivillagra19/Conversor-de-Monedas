package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner lectura = new Scanner(System.in);
            ConsultarMoneda consulta = new ConsultarMoneda();

            int opcion = 0;
            while(opcion != 8) {
                System.out.println("""
                        ****************************************\n
                        Bienvenidos al Conversor de Monedas\n                       
                        1. Dollar a Peso Argentino
                        2. Peso Argentino a Dollar
                        3. Dollar a Real Brasilero
                        4. Real Brasilero a Dollar
                        5. Dollar a Peso Colombiano
                        6. Peso Colombiano a Dollar
                        7. Convertir otra moneda
                        8. Salir
                        
                        Ingrese su opción: 
                        """);
                opcion = lectura.nextInt();
                lectura.nextLine();

                switch (opcion) {
                    case 1:
                        ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                        break;
                    case 2:
                        ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                        break;
                    case 3:
                        ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                        break;
                    case 4:
                        ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                        break;
                    case 5:
                        ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                        break;
                    case 6:
                        ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                        break;
                    case 7:
                        ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                        break;
                    case 8:
                        System.out.println("Programa finalizado con éxito ");
                    default:
                        System.out.println("Opción No válida");
                        break;
                }
        }
    }
}