
// Luis Montenero , Edwin Ureña, Gabriel Ruiz
//Programado por Gabriel Ruiz !!Programa entendible para futuros programadores o inspectores!!
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Venta {

    // declaramos precio articulos sin cambio
    final static double Zapato_C = 25.0;
    final static double Carter_C = 15.50;
    final static double ROPA_C = 150.75;
    final static double Sombrero_C = 5.0;

    // metodos no solicitados pero utiles continuar con secuencia>>linea 111

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

    public static void NombreTienda() {
        try {
            String[] lines = {

                    "--.--o              |         ,---.     |         ",
                    "  |  .,---.,---.,---|,---.    |  _.,---.|---.,   .",
                    "  |  ||---'|   ||   |,---|    |   |,---||   ||   |",
                    "  `  ``---'`   '`---'`---^    `---'`---^`---'`---|",
                    "                                               ---",

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

    // metodo util y necesario
    // declaramos nuevas variables para recibir los datos
    private static int processPurchase(BufferedReader Lectura, String itemName, double itemCost, int itemCanti_Llevar)
            throws IOException {
        // mostramos nombre producto,precio,costo que importamos
        System.out.println(itemName + " Precio: B/" + itemCost + "\nIngrese cantidad que llevara: ");
        int Canti_Llevar = Integer.parseInt(Lectura.readLine());

        if (Canti_Llevar < 0) {
            animacion("vacio legal --aceptamos devoluciones--");
        }
        // condiciones para comprobar disponibilidad
        if (Canti_Llevar <= itemCanti_Llevar) {
            double cost = itemCost * Canti_Llevar;
            System.out.println("El Precio total de la compra es: B/" + cost);
            return Canti_Llevar;
        } else {
            System.out.println("----No tenemos suficiente producto----");

            return 0;
        }
    }

    // Programa principal
    public static void main(String[] args) throws IOException {

        // declaraciones productos disponibles
        int Zapatos = 150;
        int Carteras = 100;
        int Vestidos = 2;
        int Sombreros = 10;
        int Canti_Llevar = 0;

        // lectura y comprobaciones
        String exitString = "EXIT";
        String inputString = "";
        BufferedReader Lectura = new BufferedReader(new InputStreamReader(System.in));

        Venta.clean();

        // TItulo y loading prefiero muestre una vez

        // loading
        Venta.clean();
        Venta.animacion("Loading...");
        Venta.esperar(1);
        Venta.clean();

        // Tienda
        Venta.NombreTienda();

        // Inicio de bucle para cantidades disponibles
        while (inputString != exitString) {

            // Inventario siempre mostrarlo
            animacion("Articulos en ventas: ");
            System.out.println("1. Zapatos: " + Zapatos);
            System.out.println("2. Carteras: " + Carteras);
            System.out.println("3. Vestidos: " + Vestidos);
            System.out.println("4. Sombreros: " + Sombreros);
            System.out.println("Escoja el numero del objeto que desea comprar (o escriba > EXIT < para salir):");

            try {
                // Lectura en letra para luego comprobar desea salir
                inputString = Lectura.readLine();

                // cerramos si decidio salir voluntariamente
                if (inputString.equals(exitString)) {
                    Cierre();
                    System.exit(0);

                }

                // Sino Convertimos a entero para manejo de switch
                int menuOption = Integer.parseInt(inputString);

                try {
                    switch (menuOption) {
                        case 1:
                            // invocamos el metodo de compra pasando atributos del costo Zapato y la lectura
                            // asignamos a la variable Zapatos
                            // regresamos a la funcion >>>linea 87
                            Canti_Llevar = processPurchase(Lectura, "Zapatos", Zapato_C, Zapatos);
                            // actualizamos disponibilidad
                            Zapatos -= Canti_Llevar;
                            break;

                        case 2:
                            Canti_Llevar = processPurchase(Lectura, "Carteras", Carter_C, Carteras);
                            Carteras -= Canti_Llevar;
                            break;

                        case 3:
                            Canti_Llevar = processPurchase(Lectura, "Vestidos", ROPA_C, Vestidos);
                            Vestidos -= Canti_Llevar;
                            break;

                        case 4:
                            Canti_Llevar = processPurchase(Lectura, "Sombreros", Sombrero_C, Sombreros);
                            Sombreros -= Canti_Llevar;
                            break;

                        default:
                            // control de negativos u otros casos
                            System.out.println("---No es una opcion valida----");
                    }
                    esperar(3);
                    clean();
                } catch (Exception e) {
                    // control de letra en cantidad que llevara
                    clean();
                    System.out.println("Ingreso un dato Incorrecto: " + e.getMessage());
                    animacion("Intenta de nuevo");
                }
            } catch (Exception e) {
                // control letra en seleccion articulo
                System.out.println("seleccion de dato no valida: " + e.getMessage());
                esperar(2);
                clean();
                System.out.println("Intente nuevamente:");
            }
            
        }
    }

}