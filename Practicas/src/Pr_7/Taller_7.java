package Pr_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Taller_7 {

    public static void main(String[] args) {
        try {
            BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
            /* Ingreso de datos */
            System.out.println("Ingrese primer numero: ");
            double a = Double.parseDouble(lectura.readLine());
            System.out.println("Ingrese segundo numero: ");
            double b = Double.parseDouble(lectura.readLine());
            System.out.println("Ingrese tercer numero: ");
            double c = Double.parseDouble(lectura.readLine());

            /* Comparaciones */

            if (a == b && b == c) {
                /* salida */
                System.out.println("Los tres números son iguales.");
            } else if ((a > b) && (a > c)) {
                /* salida */
                System.out.println("El mayor es el primer numero " + a);
            } else if ((b > a) && (b > c)) {
                /* salida */
                System.out.println("El mayor es el segundo numero " + b);
            } else if ((c > a) && (c > b)) {
                /* salida */
                System.out.println("El mayor es el tercer numero " + c);
            }

        } catch (Exception e) {
            /* Error */
            System.out.println("*Error 1*\n\n Ingrese un valor >> numerico <<  NO LETRAS ");
        }
    }
}
