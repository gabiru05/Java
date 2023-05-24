package Menu;

import java.io.*;

public class menu {
    /**
     * @param args
     * @throws IOException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        try (BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in))) {
            String[] menu = { "1. Perímetro y Area de un Circulo",
                    "2. Perímetro y Area de un Triangulo",
                    "3. Perímetro y Area de un Cuadrado",
                    "4. Salir" };

            int longitud = menu.length;
            int anchoColumnaNombres = -38;
            String num;
            boolean BieningresadoC = false;
            Boolean Bieningresado1 = false;
            Boolean Bieningresado2 = false;
            Boolean Bieningresado3 = false;
            Boolean Bieningresado4 = false;

            double ladoA = 0;
            double ladoB = 0;
            double ladoC = 0;

            do {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println("+--------------------------------------+");
                System.out.printf("|%" + anchoColumnaNombres + "s|\n", "Menu");
                System.out.println("+--------------------------------------+");

                for (int x = 0; x < longitud; x++) {
                    System.out.printf("|%" + anchoColumnaNombres + "s|\n", menu[x]);
                }

                System.out.println("+--------------------------------------+");
                System.out.printf("Ingrese una opcion: ");
                num = lectura.readLine();

                switch (num) {
                    case "1":

                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        BieningresadoC = false;

                        while (!BieningresadoC) {

                            try {
                                System.out.println("Ingrese el radio del circulo");
                                num = lectura.readLine();
                                double radio = Double.parseDouble(num);

                                // verifica que el dato ingresado es mayor que 0 y calcula area y perímetro
                                if (radio > 0) {
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                    double area = Math.PI * Math.pow(radio, 2);
                                    double perimetro = Math.PI * (radio * 2);

                                    System.out.printf("Perimetro: %.2f\n", perimetro);
                                    System.out.printf("Area: %.2f\n", area);
                                    BieningresadoC = true;

                                } else {
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                    System.out.println("El radio debe ser mayor que cero.");
                                }

                            } catch (NumberFormatException e) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                System.out.println("Error: Ingrese un numero valido.");
                            }
                        }

                        break;

                    case "2":
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                        // verifica la que ingrese de manera correcta el lado A
                        Bieningresado1 = false;
                        while (Bieningresado1 == false) {
                            try {
                                System.out.println("Ingrese el lado A:");
                                num = lectura.readLine();
                                ladoA = Double.parseDouble(num);
                                Bieningresado1 = true;

                            } catch (Exception e) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                System.out.println("Error: Ingrese un numero valido.");
                            }

                        }

                        // verifica la que ingrese de manera correcta el lado B
                        Bieningresado2 = false;
                        while (Bieningresado2 == false) {
                            try {
                                System.out.println("Ingrese el lado B:");
                                num = lectura.readLine();
                                ladoB = Double.parseDouble(num);
                                Bieningresado2 = true;

                            } catch (Exception e) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                System.out.println("Error: Ingrese un numero valido.");
                            }

                        }

                        // verifica la que ingrese de manera correcta el lado C
                        Bieningresado3 = false;
                        while (Bieningresado3 == false) {
                            try {
                                System.out.println("Ingrese el lado C:");
                                num = lectura.readLine();
                                ladoC = Double.parseDouble(num);
                                Bieningresado3 = true;

                            } catch (Exception e) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                System.out.println("Error: Ingrese un numero valido.");
                            }

                        }

                        // verifica la desigualdad triangular(formula) y calcula area y perimetro
                        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
                            Double perimetroT = ladoA + ladoB + ladoC;
                            Double semiperimetro = perimetroT / 2;
                            Double areaT = Math
                                    .sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB)
                                            * (semiperimetro - ladoC));

                            System.out.printf("\nPerimetro: %.2f\n", perimetroT);
                            System.out.printf("Area: %.2f\n", areaT);
                        } else {
                            System.out.printf("Los lados ingresados no forman un triangulo valido.\n");
                        }
                        break;

                    case "3":
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        Bieningresado4 = false;

                        // verifica la que ingrese de manera correcta el lado del cuadrado
                        while (Bieningresado4 == false) {
                            try {
                                System.out.println("Ingrese el lado del cuadrado");
                                num = lectura.readLine();
                                lado = Double.parseDouble(num);

                                // verifica que el dato ingresado es mayor que 0 y calcula area y perimetro
                                if (lado > 0) {

                                    double areac = Math.pow(lado, 2);
                                    double perimetroc = lado * 4;

                                    System.out.printf("\nPerimetro: %.2f\n", perimetroc);
                                    System.out.printf("Area: %.2f\n", areac);
                                    Bieningresado4 = true;
                                } else {
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                    System.out.println("El lado debe ser mayor que cero.");
                                }

                            } catch (Exception e) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                System.out.println("Error: Ingrese un numero valido.");
                            }

                        }
                        break;

                    case "4":
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println("Gracias por usar el programa");
                        return;

                    default:
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println("Opcion no valida");
                        break;
                }

                System.out.println("\nDesea continuar? (S/N)");
                num = lectura.readLine();

            } while (num.equals("S") || num.equals("s"));
        }

    }

}