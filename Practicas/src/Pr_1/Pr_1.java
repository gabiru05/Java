package Pr_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class Pr_1 {

    public static void main(String[] args) throws IOException {

        /* Variables */
        int decision = 0;
        double catetoA = 0;
        double catetoB = 0;
        double HipotenusaC = 0;

        // int hipotenusa = 0;
        // float perimetro = 0;

        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

        try {

            /* Menu */
            System.out.println("Que Opcion desea concoer:");
            System.out.println("Conocer cateto a: Ingrese >1<");
            System.out.println("Conocer cateto b: Ingrese >2<");
            System.out.println("Conocer Hipotenusa c: Ingrese >3<");

            /* Seleccion de opcion */
            System.out.println("Ingrese opcion:");
            decision = Integer.parseInt(lectura.readLine());
            /* Limpieza */
            System.out.print("\033[H\033[2J");
            System.out.flush();

            switch (decision) {
                case 1:
                    /* Obtencion de datos para cateto a */
                    System.out.println("Ingrese lado b ");
                    catetoB = Integer.parseInt(lectura.readLine());

                    System.out.println("Ingrese Hipotenusa c");
                    HipotenusaC = Integer.parseInt(lectura.readLine());

                    if (HipotenusaC < catetoA) {

                        /* Limpieza */
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        /* Error */
                        System.out.println("Error la hipotenusa no puede ser menor que los catetos");
                        System.out.println("Intenta de nuevo");
                    } else {
                        /* Calculo de cateto a */
                        catetoA = Math.sqrt(Math.pow(HipotenusaC, 2) - Math.pow(catetoB, 2));

                        /* Muestra de resultado */
                        System.out.println("El cateto a es: " + catetoA);
                    }

                    break;

                case 2:
                    /* Obtencion de datos para cateto b */
                    System.out.println("Ingrese lado a ");
                    catetoA = Integer.parseInt(lectura.readLine());

                    System.out.println("Ingrese Hipotenusa c");
                    HipotenusaC = Integer.parseInt(lectura.readLine());
                    if (HipotenusaC < catetoB) {
                        /* Limpieza */
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        /* Error */
                        System.out.println("Error la hipotenusa no puede ser menor que los catetos");
                        System.out.println("Intenta de nuevo");
                    } else {

                        /* Calculo de cateto b */
                        catetoB = Math.sqrt(Math.pow(HipotenusaC, 2) - Math.pow(catetoA, 2));

                        /* Muestra de resultado */
                        System.out.println("El cateto b es: " + catetoB);
                    }
                    break;

                case 3:
                    /* Obtencion de datos */
                    System.out.println("Ingrese lado a ");
                    catetoA = Integer.parseInt(lectura.readLine());

                    System.out.println("Ingrese lado b ");
                    catetoB = Integer.parseInt(lectura.readLine());

                    /* Calculo de HipotenusaC */
                    HipotenusaC = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

                    /* Muestra de resultado */
                    System.out.println("La Hipotenusa es: " + HipotenusaC);
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");

            }
            /* Operaciones */
            double area = (catetoA * catetoB) / 2;
            System.out.println("El Area es: " + area);

        } catch (Exception e) {
            /* Limpieza */
            System.out.print("\033[H\033[2J");
            System.out.flush();

            /* Error */
            System.out.println("*Error 1*\n\n Ingrese un valor >> numerico <<  NO LETRAS ");
        }

    }

}