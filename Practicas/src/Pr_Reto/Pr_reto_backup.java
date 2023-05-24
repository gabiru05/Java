package Pr_Reto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr_reto {

    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void animacion(String text) {

        for (int ix = 0; ix < text.length(); ix++) {
            System.out.print(text.charAt(ix));
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    private static void loading() {
        String text = "Loading";
        for (int ix = 0; ix < text.length(); ix++) {
            System.out.print(text.charAt(ix));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    private static void mostrarMenu() {
        try {
            String[] lines = {
                    "   +-+-+-+-+-+-+-+",
                    "   |M  |e  |n |u |",
                    "   +-+-+-+-+-+-+-+",
                    "                 ",

                    "1. Area y perimetro de un Circulo",
                    "2. Area y perimetro de un Triangulo",
                    "3. Area y perimetro de un Cuadrado",
                    "4. Salir del programa",

                    "Ingrese su eleccion:"
            };

            for (String line : lines) {
                System.out.println(line);
                Thread.sleep(200); // Retraso de medio segundo
            }
        } catch (Exception e) {

        }

    }

    public static void main(String[] args) throws IOException {
        String num;
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

        do {
            /* Limpieza */
            System.out.print("\033[H\033[2J");
            System.out.flush();

            loading();
            esperar(1);

            System.out.print("\033[H\033[2J");
            System.out.flush();

            mostrarMenu();
            num = lectura.readLine();
            int n = Integer.parseInt(num);

            /* Limpieza */
            System.out.print("\033[H\033[2J");
            System.out.flush();

            switch (n) {
                case 1:

                    /* Impresion animada */
                    animacion("Ingrese radio del circulo: ");
                    /* Ingreso de datos */
                    Boolean Bieningresado = false;
                    double radio = 0;
                    while (Bieningresado == false) {

                        try {

                            radio = Integer.parseInt(lectura.readLine());
                            Bieningresado = true;

                        } catch (Exception e) {
                            System.out.println("Ingrese bien el dato 1");
                            esperar(2);
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                        }
                    }

                    /* Operaciones */

                    double areacir = Math.PI * Math.pow(radio, 2);
                    double perimetrocir = Math.PI * (radio * 2);

                    /* Salida */
                    System.out.println("El area del circulo es: " + areacir);
                    System.out.println("y el perimetro del circulo es: " + perimetrocir);

                    break;

                case 2:

                    /* Declaraciones */
                    double area;
                    double perimetro;

                    Boolean Bieningresado1 = false;
                    Boolean Bieningresado2 = false;
                    Boolean Bieningresado3 = false;

                    double lado11 = 0;
                    double lado12 = 0;
                    double lado13 = 0;

                    /* Ciclos controladores de errores */
                    while (Bieningresado1 == false) {

                        try {
                            System.out.print("Ingrese la longitud del lado del triángulo 1: ");
                            int lado1 = Integer.parseInt(lectura.readLine());
                            Bieningresado1 = true;

                            lado11 = lado1;
                        } catch (Exception e) {
                            System.out.println("Ingrese bien el dato 1");
                            esperar(2);
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                        }
                    }

                    while (Bieningresado2 == false) {

                        try {

                            try {
                                String[] lines = {
                                        "Ingrese la longitud del lado del triángulo 2: "
                                };

                                for (String line : lines) {
                                    System.out.println(line);
                                    Thread.sleep(500); // Retraso de medio segundo
                                }
                            } catch (Exception e) {

                            }

                            int lado2 = Integer.parseInt(lectura.readLine());
                            Bieningresado2 = true;

                            lado12 = lado2;
                        } catch (Exception e) {

                            System.out.println("Ingrese bien el dato 2");
                            esperar(2);
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
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
                            esperar(2);
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                        }
                    }

                    /* Operaciones */

                    perimetro = lado11 + lado12 + lado13;
                    // area = (lado11 * lado12 * lado13) * 0.5;
                    double s = perimetro / 2;
                    // Formula Herón
                    area = Math.sqrt(s * (s - lado11) * (s - lado12) * (s - lado13));

                    /* Salida */
                    System.out.println("El Área es: " + area);
                    System.out.println("El Perimetro es: " + perimetro);

                    break;

                case 3:

                    /* Ingreso datos */
                    System.out.println("Ingrese el lado del cuadrado: ");

                    Boolean Bieningresado4 = false;
                    double numlado = 0;
                    while (Bieningresado4 == false) {
                        try {

                            System.out.print("Ingrese la longitud de un lado del cuadrado: ");
                            numlado = Integer.parseInt(lectura.readLine());
                            Bieningresado4 = true;

                        } catch (Exception e) {
                            System.out.println("Ingrese bien el dato");
                            esperar(2);
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                        }
                    }

                    /* Realizo calculos */

                    double areac = Math.pow(numlado, 2);
                    double perimetro3;
                    perimetro3 = 4 * numlado;

                    /* salida */
                    System.out.println("El area del cuadrado es: " + areac);
                    System.out.println("El Perimetro es: " + perimetro3);
                    break;

                case 4:

                    break;
                default:
                    System.out.println("Opcion no valida");
                    esperar(2);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    break;
            }

            System.out.println("Desea continuar? (S/N)");
            num = lectura.readLine();

        } while (num.equals("S") || num.equals("s"));

    }
}