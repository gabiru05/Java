package Pr_3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class Taller3 {

    public static void main(String[] args) {
        try {

            BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
            /* Ingreso de datos */
            System.out.println("Ingrese la longitud del lado a: ");
            double a = Double.parseDouble(lectura.readLine());
            System.out.println("Ingrese la longitud del lado b: ");
            double b = Double.parseDouble(lectura.readLine());
            System.out.println("Ingrese la longitud del lado c: ");
            double c = Double.parseDouble(lectura.readLine());
            /* Operaciones */
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            double perimetro = a + b + c;

            /* salida */
            System.out.println("El área del triángulo es: " + area);
            System.out.println("El perímetro del triángulo es: " + perimetro);
        } catch (Exception e) {

            /* ERROR */
            System.out.println("*Error 1*\n\n Ingrese un valor >> numerico <<  NO LETRAS ");

        }
    }
}