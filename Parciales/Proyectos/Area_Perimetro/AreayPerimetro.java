package Area_Perimetro;

//Editado Gabriel Ruiz !!Programa entendible para futuros programadores o inspectores!!
import java.io.*;
import java.lang.Math;

public class AreayPerimetro {
    public static void main(String[] args) throws IOException {
        BufferedReader figuras = new BufferedReader(new InputStreamReader(System.in));
        int opcion;
        int continuar;
        boolean Exit = true;
        // controlamos datos erroneos
        while (Exit) {
            try {
                System.out.println("Que area y perimetro de estas figuras desea calcular");
                System.out.println("1. rectangulo");
                System.out.println("2. Triangulo");
                System.out.println("3. Trapecio");
                System.out.println("4. Circulo");
                opcion = Integer.parseInt(figuras.readLine());
            } // fin del try
            catch (Exception e) {
                System.out.println("---Dato no valido---");
                System.out.println("Que area y perímetro de estas figuras desea calcular");
                System.out.println("1. Cuadrilátero");
                System.out.println("2. Triangulo");
                System.out.println("3. Trapecio");
                System.out.println("4. Circulo");
                opcion = Integer.parseInt(figuras.readLine());
            }

            // Ingreso segun eleccion
            switch (opcion) {
                case 1: // Cuadrilatero rectangulo
                    float lado1CU = 0, lado2CU = 0, AreaCu, perimetroCu;
                    boolean validInput = false;
                    // Mas comprobantes de errores
                    while (!validInput) {
                        try {
                            System.out.println("Por favor introdusca los valores necesariosn del cuadrilatero");
                            System.out.println("Introusca los 2 diferentes lados del cuadrilatero");
                            lado1CU = Float.parseFloat(figuras.readLine());
                            if (lado1CU < 0) {
                                System.out.println("Error: El valor no puede ser negativo. Intente de nuevo.");
                            } else {
                                validInput = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Error: Valor no valido. Intente de nuevo.");
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        try {
                            lado2CU = Float.parseFloat(figuras.readLine());
                            if (lado2CU < 0) {
                                System.out.println("Error: El valor no puede ser negativo. Intente de nuevo.");
                            } else {
                                validInput = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Error: Valor no valido. Intente de nuevo.");
                        }
                    }
                    // Operaciones
                    AreaCu = lado1CU * lado2CU;
                    perimetroCu = 2 * lado1CU + 2 * lado2CU;

                    // salida
                    System.out.println("El area del cuadrilatero es :" + AreaCu);
                    System.out.println("El perimetro del cuadrilatero es: " + perimetroCu);

                    // se pregunta si quiere continuar
                    validInput = false;
                    while (!validInput) {
                        try {

                            System.out.println("¿Desea continuar? 1=Si o 0=No");
                            continuar = Integer.parseInt(figuras.readLine());
                            if (continuar == 0) {
                                Exit = false;
                            }
                            validInput = true;
                        } catch (Exception e) {
                            System.out.println("Error: Valor no valido. Intente de nuevo.");
                        }
                    }
                    break;

                case 2: // Triangulo
                    float base = 0, altura = 0, lado1T = 0, lado2T = 0, lado3T = 0;
                    validInput = false;
                    // antierrores segun cada lado
                    while (!validInput) {
                        try {
                            System.out.println("Por favor introdusca los valores necesariosn del triangulo");
                            System.out.println("Introusca los lados del triangulo");
                            lado1T = Float.parseFloat(figuras.readLine());
                            if (lado1T < 0) {
                                System.out.println("Error: El valor no puede ser negativo. Intente de nuevo.");
                            } else {
                                validInput = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Error: Valor no valido. Intente de nuevo.");
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        try {
                            lado2T = Float.parseFloat(figuras.readLine());
                            if (lado2T < 0) {
                                System.out.println("Error: El valor no puede ser negativo. Intente de nuevo.");
                            } else {
                                validInput = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Error: Valor no valido. Intente de nuevo.");
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        try {
                            lado3T = Float.parseFloat(figuras.readLine());
                            if (lado3T < 0) {
                                System.out.println("Error: El valor no puede ser negativo. Intente de nuevo.");
                            } else {
                                validInput = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Error: Valor no valido. Intente de nuevo.");
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        try {
                            System.out.println("Introdusca la base del triandulo");
                            base = Float.parseFloat(figuras.readLine());
                            if (base < 0) {
                                System.out.println("Error: El valor no puede ser negativo. Intente de nuevo.");
                            } else {
                                validInput = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Error: Valor no valido. Intente de nuevo.");
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        try {
                            System.out.println("Introdusca la altura del triangulo");
                            altura = Float.parseFloat(figuras.readLine());
                            if (altura < 0) {
                                System.out.println("Error: El valor no puede ser negativo. Intente de nuevo.");
                            } else {
                                validInput = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Error: Valor no valido. Intente de nuevo.");
                        }
                    }
                    // Operaciones

                    float AreaT = (base * altura) / 2;
                    float perimetroT = lado1T + lado2T + lado3T;

                    // salida
                    System.out.println("El area del triangulo es:" + AreaT);
                    System.out.println("El perimetro del triangulo" + perimetroT);

                    // se pregunta si quiere continuar
                    validInput = false;
                    while (!validInput) {
                        try {

                            System.out.println("¿Desea continuar? 1=Si o 0=No");
                            continuar = Integer.parseInt(figuras.readLine());
                            if (continuar == 0) {
                                Exit = false;
                            }
                            validInput = true;
                        } catch (Exception e) {
                            System.out.println("Error: Valor no valido. Intente de nuevo.");
                        }
                    }

                    break;

                case 3:// Trapecio
                    float base1 = 0, base2 = 0, alturaT = 0, lado1R = 0, lado2R = 0;

                    // Ingreso de datos controlando errores
                    validInput = false;
                    while (!validInput) {
                        try {
                            System.out.println("Por favor introdusca los valores necesariosn del trapecio");
                            System.out.println("Introdusca los lados del trapecio");
                            lado1R = Float.parseFloat(figuras.readLine());
                            if (lado1R < 0) {
                                System.out.println("Error: El valor no puede ser negativo. Intente de nuevo.");
                            } else {
                                validInput = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Error: Valor no valido. Intente de nuevo.");
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        try {
                            lado2R = Float.parseFloat(figuras.readLine());
                            if (lado2R < 0) {
                                System.out.println("Error: El valor no puede ser negativo. Intente de nuevo.");
                            } else {
                                validInput = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Error: Valor no valido. Intente de nuevo.");
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        try {
                            System.out.println("Introusca las bases del trapecio");
                            base1 = Float.parseFloat(figuras.readLine());
                            if (base1 < 0) {
                                System.out.println("Error: El valor no puede ser negativo. Intente de nuevo.");
                            } else {
                                validInput = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Error: Valor no valido. Intente de nuevo.");
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        try {
                            base2 = Float.parseFloat(figuras.readLine());
                            if (base2 < 0) {
                                System.out.println("Error: El valor no puede ser negativo. Intente de nuevo.");
                            } else {
                                validInput = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Error: Valor no valido. Intente de nuevo.");
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        try {
                            System.out.println("Introdusca la altura del trapecio");
                            alturaT = Float.parseFloat(figuras.readLine());
                            if (alturaT < 0) {
                                System.out.println("Error: El valor no puede ser negativo. Intente de nuevo.");
                            } else {
                                validInput = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Error: Valor no valido. Intente de nuevo.");
                        }
                    }

                    // Operaciones
                    float AreaR = (base1 + base2) / 2 * alturaT;
                    float perimetroR = lado1R + lado2R + base1 + base2;

                    // salida
                    System.out.println("El area del trapecio es:" + AreaR);
                    System.out.println("El perimetro del trapecio" + perimetroR);

                    // se pregunta si quiere continuar
                    validInput = false;
                    while (!validInput) {
                        try {

                            System.out.println("¿Desea continuar? 1=Si o 0=No");
                            continuar = Integer.parseInt(figuras.readLine());
                            if (continuar == 0) {
                                Exit = false;
                            }
                            validInput = true;
                        } catch (Exception e) {
                            System.out.println("Error: Valor no valido. Intente de nuevo.");
                        }
                    }

                    break;

                case 4:// circulo
                    float r = 0;

                    validInput = false;
                    while (!validInput) {
                        try {
                            System.out.println("Por favor introdusca los valores necesariosn del circulo");
                            System.out.println("Introdusca el radio del ciruclo");
                            r = Float.parseFloat(figuras.readLine());
                            if (r < 0) {
                                System.out.println("Error: El valor no puede ser negativo. Intente de nuevo.");
                            } else {
                                validInput = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Error: Valor no valido. Intente de nuevo.");
                        }
                    }

                    // Operaciones
                    Double perimetroC = 2 * 3.1416 * r;
                    Double AreaC = 3.1416 * Math.pow(r, 2);

                    // salida
                    System.out.println("El perimetro del circulo es:" + perimetroC);
                    System.out.println("El Area del Circulo es:" + AreaC);

                    // se pregunta si quiere continuar
                    validInput = false;
                    while (!validInput) {
                        try {
                            // se pregunta si quiere continuar
                            System.out.println("¿Desea continuar? 1=Si o 0=No");
                            continuar = Integer.parseInt(figuras.readLine());
                            if (continuar == 0) {
                                Exit = false;
                            }
                            validInput = true;
                        } catch (Exception e) {
                            System.out.println("Error: Valor no valido. Intente de nuevo.");
                        }
                    }

                    break;

            }// fin del switch
        } // fin del while
    }// fin del main
}// fin de la clase