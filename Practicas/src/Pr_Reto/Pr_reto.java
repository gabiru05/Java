package Pr_Reto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr_reto {

    public static void clean() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 900);
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
                System.out.println(e);
            }
        }
        /* Separador de linea */
        System.out.println("  ");
    }

    private static void mostrarMenu() {
        try {
            String[] lines = {

                    "-.-.   ",
                    "| | |,---.,---..   .",
                    "| | ||---'|   ||   |",
                    "` ' '`---'`   '`---'",

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
            System.out.println(e);
        }

    }

    private static void Cierre() {
        animacion("Cerrando |");
        esperar(1);

        clean();

        System.out.println("Cerrando /");
        esperar(1);

        clean();

        System.out.println("Cerrando -");
        esperar(1);

        clean();

        System.out.println("Listo ");
        esperar(1);

        clean();
    }

    public static void main(String[] args) throws IOException {
        String num;
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

        do {
            /* Limpieza al volver ejecutar */
            clean();

            animacion("Loading...");
            esperar(1);

            clean();

            mostrarMenu();
            num = lectura.readLine();
            int n = Integer.parseInt(num);

            /* Limpieza entrar en casos */
            clean();

            switch (n) {
                case 1:

                    /* Impresion animada */

                    /* Ingreso de datos */
                    Boolean Bieningresado = false;
                    double radio = 0;
                    while (Bieningresado == false) {

                        try {
                            clean();
                            animacion("Ingrese radio del circulo: ");
                            radio = Integer.parseInt(lectura.readLine());
                            if (radio > 0) {
                                Bieningresado = true;
                            } else {
                                animacion("--Error-- El radio debe ser mayor que 0");
                                esperar(2);

                                Bieningresado = false;
                                radio = 0;
                            }
                        } catch (Exception e) {
                            System.out.println("Ingrese datos numericos NO LETRAS");
                            esperar(2);
                            clean();
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

                            clean();
                            animacion("Ingrese la longitud del lado del triángulo 1: ");
                            int lado1 = Integer.parseInt(lectura.readLine());
                            if (lado1 > 0) {
                                Bieningresado1 = true;
                            } else {
                                animacion("--Error-- El lado debe ser mayor que 0");
                                esperar(2);

                                Bieningresado2 = false;
                                lado1 = 0;
                            }

                            lado11 = lado1;

                        } catch (Exception e) {

                            System.out.println("Ingrese bien el dato 1  --Numeros NO LETRAS--");
                            esperar(2);
                            clean();
                        }
                    }

                    while (Bieningresado2 == false) {

                        try {

                            clean();
                            animacion("Ingrese la longitud del lado del triángulo 2: ");
                            int lado2 = Integer.parseInt(lectura.readLine());
                            if (lado2 > 0) {
                                Bieningresado2 = true;
                            } else {
                                animacion("--Error-- El lado debe ser mayor que 0");
                                esperar(2);

                                Bieningresado2 = false;
                                lado2 = 0;
                            }

                            lado12 = lado2;

                        } catch (Exception e) {

                            System.out.println("Ingrese bien el dato 2  --Numeros NO LETRAS--");
                            esperar(2);
                            clean();
                        }
                    }
                    while (Bieningresado3 == false) {
                        try {

                            clean();
                            animacion("Ingrese la longitud del lado del triángulo 3: ");
                            int lado3 = Integer.parseInt(lectura.readLine());
                            if (lado3 > 0) {
                                Bieningresado3 = true;
                            } else {
                                animacion("--Error-- El lado debe ser mayor que 0");
                                esperar(2);

                                Bieningresado3 = false;
                                lado3 = 0;
                            }

                            lado13 = lado3;

                        } catch (Exception e) {

                            System.out.println("Ingrese bien el dato 3  --Numeros NO LETRAS--");
                            esperar(2);
                            clean();
                        }
                    }

                    /* Operaciones */
                    perimetro = lado11 + lado12 + lado13;

                    // area = (lado11 * lado12 * lado13) * 0.5;
                    double s = perimetro / 2;

                    // Formula Herón
                    area = Math.sqrt(s * (s - lado11) * (s - lado12) * (s - lado13));

                    /* Salida */
                    animacion("El Área es: " + area);
                    animacion("El Perimetro es: " + perimetro);

                    break;

                case 3:

                    Boolean Bieningresado4 = false;
                    double numlado = 0;

                    /* Ingreso datos */
                    while (Bieningresado4 == false) {
                        try {

                            animacion("Ingrese la longitud de un lado del cuadrado: ");
                            numlado = Integer.parseInt(lectura.readLine());
                            Bieningresado4 = true;

                        } catch (Exception e) {

                            System.out.println("Ingrese bien el dato");
                            esperar(2);
                            clean();
                        }
                    }

                    /* Realizo calculos */

                    double areac = Math.pow(numlado, 2);
                    double perimetro3;
                    perimetro3 = 4 * numlado;

                    /* salida */
                    animacion("El area del cuadrado es: " + areac);
                    animacion("El Perimetro es: " + perimetro3);
                    break;

                case 4:

                    break;
                default:
                    animacion("Opcion no valida");
                    esperar(2);
                    clean();
                    break;
            }

            animacion("Desea continuar? (S/N)");
            num = lectura.readLine();

        } while (num.equals("S") || num.equals("s"));
        Cierre();

    }
}