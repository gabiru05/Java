
//Programa editado Gabriel Ruiz  !!Programa entendible para futuros programadores o inspectores!!

import java.io.*;

public class comprobacion {
    public static void main(String[] args) throws IOException {

        // declaraciones utiles
        BufferedReader letra = new BufferedReader(new InputStreamReader(System.in));
        String a = "";

        // Bucle para verificar Ingreso correcto de dato
        while (true) {

            // Solicitar dato
            System.out.println("ingrese un caracter solo 1 de largo");
            a = letra.readLine();

            // Convertimos a entero para comprobar negativos
            int num = Integer.parseInt(a);

            // comprobaciones
            if (a.length() == 1) {
                break;
            }
            if (num < 0) {
                System.out.println("Numeros negativos son invalidos");
            } else {
                System.out.println("Invalid input. Please enter a single character.");
            }
        }

        // usamos A para obligar verificar letras primeros
        String Letra = "A";

        try {
            if (Letra == "A") {
                ;
                if (a.equals("A") || a.equals("B") || a.equals("C") || a.equals("D") || a.equals("E") || a.equals("F")
                        || a.equals("G") || a.equals("H") || a.equals("I") || a.equals("J") || a.equals("K")
                        || a.equals("L")
                        || a.equals("M") || a.equals("N") || a.equals("Ñ") || a.equals("O") || a.equals("P")
                        || a.equals("Q")
                        || a.equals("R") || a.equals("S") || a.equals("T") || a.equals("U") || a.equals("V")
                        || a.equals("W")
                        || a.equals("X") || a.equals("Y") || a.equals("Z"))

                    System.out.println("USTED HA INGRESADO UNA LETRA MAYUSCULA");

            }
            if (a.equals("a") || a.equals("b") || a.equals("c") || a.equals("d") || a.equals("e") || a.equals("f")
                    || a.equals("g") || a.equals("h") || a.equals("i") || a.equals("j") || a.equals("k")
                    || a.equals("l")
                    || a.equals("m") || a.equals("n") || a.equals("o") || a.equals("p") || a.equals("q")
                    || a.equals("r")
                    || a.equals("s") || a.equals("t") || a.equals("u") || a.equals("v") || a.equals("w")
                    || a.equals("X")
                    || a.equals("Y") || a.equals("Z")) {
                System.out.println("USTED HA INGRESADO UNA LETRA MINUSCULA");
            } else {

                // convertimos a entero para comparaciones numericas debajo
                int num = Integer.parseInt(a);
                if (num == 0 || num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 6 || num == 7
                        || num == 8
                        || num == 9) {
                    System.out.println("USTED HA INGRESADO UN NUMERO");
                } else {
                    // si aun asi no es reconocido
                    // salida
                    System.out.println("valor no reconocido");
                }
            }
        } catch (Exception e) {
            System.out.println("Algo no esta bien");
        }
    }
}
