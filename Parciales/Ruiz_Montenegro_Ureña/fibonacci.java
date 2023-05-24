
//Edwin Ureña, Luis Montenegro, Gabriel Ruiz

//Programa editado Gabriel Ruiz  !!Programa entendible para futuros programadores o inspectores!!

import java.io.*;

public class fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader limite = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        while (true) {
            try {
                System.out.println("Ingrese el numero de Impresiones maximo:");
                num = Integer.parseInt(limite.readLine());
                if (num > 0) {
                    break;
                } else {
                    System.out.println("Dato Invalido. el dato debe ser un valor numerico o positivo ");
                }
            } catch (Exception e) {
                System.out.println("Dato Invalido. el dato debe ser un valor numerico o positivo ");
            }
        }

        int i;
        int Suma = 1;
        int num1 = 0;
        int num2 = 1;
        for (i = 0; i < num; i++) {
            System.out.print(num1 + " ");
            Suma = num1 + num2;
            num1 = num2;
            num2 = Suma;
        }
    }
}