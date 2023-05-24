package Pr_Reto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr_reto2 {
    private static void mostrarMenu() {

        System.out.println("Menu");
        System.out.println("1. Area y perimetro de un Circulo");
        System.out.println("2. Area y perimetro de Wun Triangulo");
        System.out.println("3. Area y perimetro de un Cuadrado");

    }

    public static double Ingreso1() {
        Boolean Bieningresado1 = false;
        double lado11 = 0;
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

        while (Bieningresado1 == false) {

            try {
                System.out.print("Ingrese la longitud del lado del triángulo 1: ");
                int lado1 = Integer.parseInt(lectura.readLine());
                Bieningresado1 = true;

                lado11 = lado1;
            } catch (Exception e) {
                System.out.println("Ingrese bien el dato 1");
            }
        }
        return lado11;
    }

    public static void main(String[] args) throws IOException {
        String num;
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

        do {

            mostrarMenu();
            num = lectura.readLine();
            int n = Integer.parseInt(num);

            switch (n) {
                case 1:

                    /* Ingreso de datos */
                    System.out.println("Ingrese el radio del circulo");
                    num = lectura.readLine();

                    /* Operaciones */
                    double radiocir = Double.parseDouble(num);
                    double areacir = Math.PI * Math.pow(radiocir, 2);
                    double perimetrocir = Math.PI * (radiocir * 2);

                    /* Salida */
                    System.out.println("El area del circulo es: " + areacir);
                    System.out.println("y el perimetro del circulo es: " + perimetrocir);

                    break;

                case 2:

                    /* Declaraciones */
                    double area;
                    double perimetro;

                    Boolean Bieningresado2 = false;
                    Boolean Bieningresado3 = false;

                    double lado12 = 0;
                    double lado13 = 0;

                    double lado11 = 0;
                    

                    /* Ciclos controladores de errores */
                    Ingreso1();

                    while (Bieningresado2 == false) {

                        try {
                            System.out.print("Ingrese la longitud del lado del triángulo 2: ");
                            int lado2 = Integer.parseInt(lectura.readLine());
                            Bieningresado2 = true;

                            lado12 = lado2;
                        } catch (Exception e) {
                            System.out.println("Ingrese bien el dato 2");
                        }
                    }

                    while (Bieningresado3 == false) {
                        try {
                            System.out.print("Ingrese la longitud del lado del triángulo 3: ");
                            int lado3 = Integer.parseInt(lectura.readLine());
                            Bieningresado3 = true;
                            lado13 = lado3;

                        } catch (Exception e) {
                            System.out.println("Ingrese bien el dato 3");
                        }
                    }

                    /* Operaciones */

                    perimetro = datoin1 + lado12 + lado13;
                    // area = (lado11 * lado12 * lado13) * 0.5;
                    double s = perimetro / 2;
                    // Formula Herón
                    area = Math.sqrt(s * (s - datoin1) * (s - lado12) * (s - lado13));

                    /* Salida */
                    System.out.println("El Área es: " + area);
                    System.out.println("El Primetro es: " + perimetro);

                    break;

                case 3:
                    System.out.println("Ingrese el lado del cuadrado");
                    num = lectura.readLine();
                    double lado = Double.parseDouble(num);
                    double areac = Math.pow(lado, 2);
                    System.out.println("El area del cuadrado es: " + areac);
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

            System.out.println("Desea continuar? (S/N)");
            num = lectura.readLine();

        } while (num.equals("S") || num.equals("s"));

    }
}