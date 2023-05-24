package Pr_8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Taller_8 {

    public static void main(String[] args) {
        try {

            BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

            /* Ingreso de datos */
            System.out.print("Ingrese un número binario: ");
            int binario = Integer.parseInt(lectura.readLine());

            /* Separacion de datos */
            String number = String.valueOf(binario);
            char[] digits1 = number.toCharArray();

            /* Declaraciones utiles */
            int leng = digits1.length;
            int elev = leng;
            int elev2 = elev - 1;
            double decimal = 0;
            int potencia = 0;

            /* Comprobaciones */
            // System.out.println(leng);

            if (leng == 5) {
                for (int i = 0; i < leng; i++) {
                    int temp = digits1[i];
                    int a = Integer.valueOf(String.valueOf(temp));

                    /* Comprobaciones */
                    // System.out.println("mostrando todas las a" + a);

                    if (a == 49) {
                        int ultimo = leng - 1;
                        if (i == ultimo) {
                            decimal = decimal + 1;
                            /* Comprobaciones */
                            // System.out.println("entro al 1");
                        } else {
                            /* Comprobaciones */
                            // System.out.println("entro al 2");
                            potencia = 2;
                            Double elevado = Math.pow(potencia, elev2);

                            decimal = elevado + decimal;
                            /* Comprobaciones */
                            // System.out.println("decimal elev " + elev);
                            // System.out.println("decimal bucle " + decimal);

                        }

                    }
                    elev2--;

                    /* Comprobaciones */
                    // System.out.println("decimal fuera bucle " + decimal); */
                    // System.out.println("El binario: " + binario + " en decimal es: " + decimal);

                }
                /* Salida */
                System.out.println("El binario: " + binario + " en decimal es: " + decimal);

            } else {
                System.out.println("Error Ingrese un binario de 5 digitos");
            }

        } catch (

        Exception e) {
            /* Error */
            System.out.println("*Error 1*\n\n Ingrese un valor >> numerico <<  NO LETRAS ");
        }
    }
}
