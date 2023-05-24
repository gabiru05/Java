
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Usuario {
    // Atributos
    String nombre = "Zapato";
    int cantidad = 20;

    // metodos
    public static void nuevacantidad() {

    }

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

    public static void mostrarMenu() {
        try {
            String[] lines = {

                    "--.--o              |         ,---.     |         ",
                    "  |  .,---.,---.,---|,---.    |  _.,---.|---.,   .",
                    "  |  ||---'|   ||   |,---|    |   |,---||   ||   |",
                    "  `  ``---'`   '`---'`---^    `---'`---^`---'`---|",
                    "                                               ---",

                    "Productos:",
                    "1. Zapatos 25$ c/u      restantes",
                    "2. Carteras 15.50$ c/u",
                    "3. Zapato 150.75$ c/u",
                    "4. Sombreros 5$ c/u",
                    "5. Salir del programa",

                    "Que desea comprar Ingrese numero de la selección:",

            };

            for (String line : lines) {
                System.out.println(line);
                Thread.sleep(200); // Retraso en milisegundo
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void Cierre() {
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
}

public class Venta2co {
    public static void main(String[] args) throws IOException {
        // Instancias de la clase Usuario
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();

        // Se imprimen valores de los objetos
        System.out.println(usuario1.nombre);
        System.out.println(usuario2.nombre);
        Usuario.clean();

        String num;
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

        do {
            /* Limpieza al volver ejecutar */
            Usuario.clean();

            Usuario.animacion("Loading...");
            Usuario.esperar(1);

            Usuario.clean();

            // mostrarMenu();
            Usuario.mostrarMenu();
            num = lectura.readLine();
            int n = Integer.parseInt(num);

            /* Limpieza entrar en casos */
            Usuario.clean();

            switch (n) {
                case 1:

                    System.out.println(usuario1.nombre);
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:

                    break;
                default:
                    Usuario.animacion("Opcion no valida");
                    Usuario.esperar(2);
                    Usuario.clean();
                    break;
            }

            Usuario.animacion("Desea continuar? (S/N)");
            num = lectura.readLine();

        } while (num.equals("S") || num.equals("s"));
        Usuario.Cierre();

    }
}
