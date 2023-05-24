import java.io.*;

public class pt4 {

    public static void main(String[] args) throws IOException {

        int zapa = 150;
        int cartera = 100;
        int vestido = 2;
        int sombrero = 10;
        double costo = 0;
        int canti = 0;
        boolean resp = true;
        String sal = "EXIT";
        String x = "";
        boolean x1 = true;
        boolean x2 = true;
        boolean x3 = true;
        boolean x4 = true;
        BufferedReader art = new BufferedReader(new InputStreamReader(System.in));

        while (x.equals(sal) == false) {
            System.out.println("Inventario \n1. Zapatos: " + zapa);
            System.out.println("2. Cartera: " + cartera);
            System.out.println("3. Vestidos: " + vestido);
            System.out.println("4. Sombreros: " + sombrero);
            System.out.println("Escoja el articulo que desea comprar");
            int menu = Integer.parseInt(art.readLine());

            try {

                while (resp) {
                    switch (menu) {
                        case 1:
                            while (x1 == true) {
                                System.out.println("Los zapatos tienen un costo de: B/25.00 \nIngrese la cantidad: ");
                                canti = Integer.parseInt(art.readLine());
                                try {

                                    if (canti < zapa) {
                                        costo = 25 * canti;
                                        System.out.println("El costo total es: " + costo);
                                        zapa = zapa - canti;

                                        System.out.println("Inventario \n1. Zapatos: " + zapa);
                                        System.out.println("2. Cartera: " + cartera);
                                        System.out.println("3. Vestidos: " + vestido);
                                        System.out.println("4. Sombreros: " + sombrero);
                                        x1 = false;
                                    } else {

                                        System.out.println(
                                                "La cantidad ingresada es mayor o menor que los productos disponibles");
                                    }

                                } catch (Exception e) {

                                    System.out.println("El valor ingresado no es un numero");
                                } // fin try-catch
                            } // fin while
                            resp = false;
                            break;

                        case 2:
                            while (x2 == true) {
                                System.out.println("Las carteras tienen un costo de: B/15.50 \nIngrese la cantidad: ");
                                canti = Integer.parseInt(art.readLine());
                                try {

                                    if (canti < cartera) {
                                        costo = 15.50 * canti;
                                        System.out.println("El costo total es: " + costo);
                                        cartera = cartera - canti;

                                        System.out.println("Inventario \n1. Zapatos: " + zapa);
                                        System.out.println("2. Cartera: " + cartera);
                                        System.out.println("3. Vestidos: " + vestido);
                                        System.out.println("4. Sombreros:\n " + sombrero);
                                        x2 = false;
                                    } else {

                                        System.out.println(
                                                "La cantidad ingresada es mayor o menor que los productos disponibles");
                                    }

                                } catch (Exception e) {

                                    System.out.println("El valor ingresado no es un numero");

                                }
                            } // fin while

                            resp = false;
                            break;
                        case 3:
                            while (x3 = true) {

                                System.out.println("Los vestidos tienen un costo de: B/150.75 \nIngrese la cantidad: ");
                                canti = Integer.parseInt(art.readLine());

                                try {

                                    if (canti <= vestido) {
                                        costo = 150.75 * canti;
                                        System.out.println("El costo total es: " + costo);
                                        vestido = vestido - canti;

                                        System.out.println("Inventario \n1. Zapatos: " + zapa);
                                        System.out.println("2. Cartera: " + cartera);
                                        System.out.println("3. Vestidos: " + vestido);
                                        System.out.println("4. Sombreros: " + sombrero);
                                        x3 = false;

                                    } // fin si
                                    else {

                                        System.out.println(
                                                "La cantidad ingresada es mayor o menor que los productos disponibles");

                                    }

                                } catch (Exception e) {

                                    System.out.println("El valor ingresado no es un numero");

                                } // fin try catch

                            } // fin while
                            resp = false;
                            break;
                        case 4:
                            while (x4 = true) {
                                System.out.println("Los sombreros tienen un costo de: B/5.00 \nIngrese la cantidad: ");
                                canti = Integer.parseInt(art.readLine());
                                try {
                                    if (canti <= sombrero) {
                                        costo = 5 * canti;
                                        System.out.println("El costo total es: " + costo);
                                        sombrero = sombrero - canti;

                                        System.out.println("Inventario \n1. Zapatos: " + zapa);
                                        System.out.println("2. Cartera: " + cartera);
                                        System.out.println("3. Vestidos: " + vestido);
                                        System.out.println("4. Sombreros:\n " + sombrero);
                                    } // fin si
                                    else {

                                        System.out.println(
                                                "La cantidad ingresada es mayor o menor que los productos disponibles");
                                    }
                                } catch (Exception e) {

                                    System.out.println("El valor ingresado no es un numero");
                                }
                            } // fin while
                            resp = false;
                            break;

                        default:
                            System.out.println("El numero debe ser entre 1, 2, 3 o 4");
                            menu = Integer.parseInt(art.readLine());

                            break;

                    }

                    System.out.println("Si desea salir escriba la palabra EXIT");
                    x = art.readLine();
                } // fin while

            } catch (Exception e) {

            }

        }

    }
}
