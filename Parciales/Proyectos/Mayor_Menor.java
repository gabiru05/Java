
//editado Gabriel Ruiz !!Programa entendible para futuros programadores o inspectores!!

import java.io.*;

public class Mayor_Menor {
    public static void main(String[] args) throws IOException {
        // declaraciones
        int x = 1;
        float N;
        float total = 0;
        int cantidad = 0;

        float valorMayo = 0;
        float valorMeno = 0;
        float promedio;
        BufferedReader mejor = new BufferedReader(new InputStreamReader(System.in));

        // comprobacion anti errores e ingreso de cantidad
        while (true) {
            try {
                System.out.println("Ingrese cantidad de numero desea ingresar:");
                cantidad = Integer.parseInt(mejor.readLine());
                if (cantidad > 0) {
                    break;
                } else {
                    System.out.println("Dato Invalido. el dato debe ser positivo");
                }
            } catch (Exception e1) {
                System.out.println("Dato Invalido. el dato debe ser positivo");
            }
        }
        // comprobacion anti errores e ingreso de numeros segun la cantidad
        while (x <= cantidad) {
            while (true) {
                try {
                    System.out.println("Ingrese un numero:");
                    N = Float.parseFloat(mejor.readLine());
                    if (N > 0) {
                        break;
                    } else {
                        System.out.println("Dato Invalido. el dato debe ser positivo");
                    }
                } catch (Exception e2) {
                    System.out.println("Dato Invalido. el dato debe ser positivo");
                }
            }

            // Operaciones
            if (x == 1) {
                valorMayo = N;
                valorMeno = N;
            }

            if (N > valorMayo) {
                valorMayo = N;
            }
            if (N < valorMeno) {
                valorMeno = N;
            }
            x++;

            total = total + N;

        }

        promedio = total / cantidad;

        // salida
        System.out.println("El numero mayor es: " + valorMayo);
        System.out.println("El numero menor es: " + valorMeno);
        System.out.println("El total de numero es: " + total);
        System.out.println("El promedio de los numeros es: " + promedio);

    }

}