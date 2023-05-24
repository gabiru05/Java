package Pr_9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Taller_9 {

    public static void main(String[] args) {
        try {
            BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

            /*
             * int dato;
             * char NumASCII;
             * while (true) {
             * System.out.print("Ingrese un número entre 0 y 127: ");
             * dato = Integer.parseInt(lectura.readLine());
             * 
             * if (dato >= 0 && dato <= 127) {
             * NumASCII = (char) dato;
             * System.out.println("El carácter correspondiente es: " + NumASCII);
             * break;
             * } else {
             * System.out.println("Error: el número debe estar entre 0 y 127.");
             * }
             * }
             */
            /* En pruebas */
            /*
             * String cadena = "Hola mundo";
             */
            String cadena = (lectura.readLine());

            int[] ascii = new int[cadena.length()];

            for (int i = 0; i < cadena.length(); i++) {
                ascii[i] = (int) cadena.charAt(i);
            }
            System.out.println(cadena);
            System.out.println(Arrays.toString(ascii));

        } catch (

        Exception e) {
            /* Error */
            System.out.println("*Error 1*\n\n Ingrese un valor >> numerico <<  NO LETRAS ");
        }
    }
}
