//Librerías especiales.
import java.util.Scanner;

//Función de tipo "CalculadoraVersion1.java".
public class CalculadoraVersion2 {
    //Función principal.
    public static void main(String[] args) {
        //Definición e inialización de variables locales.
        var lnNumero1 = 0.0;
        var lnNumero2 = 0.0;
        var lnResultado = 0.0;
        var lnOpcion = 0;

        //Definición del scanner.
        Scanner lsDatos = new Scanner(System.in);

        //Ciclo para que se repita n cantidad de veces.
        do{
            //Título + Saltos de línea.
            System.out.println(" ");
            System.out.println(" +===========================================+ ");
            System.out.println(" | C A L C U L A D O R A   V E R S I Ó N   2 | ");
            System.out.println(" +===========================================+ ");
            System.out.println(" ");

            //Menú de opciones + Saltos de línea.
            System.out.println("\n Nuestro menú de opciones es el siguiente: \n");
            System.out.println(" 1. Suma ");
            System.out.println(" 2. Resta ");
            System.out.println(" 3. Multiplicaicón ");
            System.out.println(" 4. División ");
            System.out.println(" 5. Potenciación ");
            System.out.println(" 6. Raíz cuadrada ");
            System.out.println(" 7. Residuo de la división ");
            System.out.println(" 8. Acerca de ");
            System.out.println(" 9. Salir ");
            System.out.println(" ");

            //Captura de datos.
            System.out.print(" ¿Qué opción desea utilizar? (1 - 9): ");
            lnOpcion = lsDatos.nextInt();

            //Condición para determinar cuando se sale del ciclo o no.
            if(lnOpcion > 0 && lnOpcion < 8){
                //Captura de datos + Saltos de línea.
                System.out.println(" ");
                System.out.print(" ✔ Ingrese el primer número: ");
                lnNumero1 = lsDatos.nextDouble();
                System.out.print(" ✔ Ingrese el segundo número: ");
                lnNumero2 = lsDatos.nextDouble();
                System.out.println(" ");

                //Condición múltiple.
                switch(lnOpcion){
                    case 1:
                        //Subtítulo + Saltos de línea.
                        System.out.println(" ");
                        System.out.println(" *=========* ");
                        System.out.println(" | S U M A | ");
                        System.out.println(" *=========* ");
                        System.out.println(" ");

                        //Operación
                        lnResultado = lnNumero1 + lnNumero2;
                        System.out.println(" \uD83D\uDD38 El resultado de " + lnNumero1 + " + " + lnNumero2 + " = " + lnResultado);
                        break;

                    case 2:
                        //Subtítulo + Saltos de línea.
                        System.out.println(" ");
                        System.out.println(" *===========* ");
                        System.out.println(" | R E S T A | ");
                        System.out.println(" *===========* ");
                        System.out.println(" ");

                        //Operación
                        lnResultado = lnNumero1 - lnNumero2;
                        System.out.println(" \uD83D\uDD38 El resultado de " + lnNumero1 + " - " + lnNumero2 + " = " + lnResultado);
                        break;

                    case 3:
                        //Subtítulo + Saltos de línea.
                        System.out.println(" ");
                        System.out.println(" *=============================* ");
                        System.out.println(" | M U L T I P L I C A C I Ó N | ");
                        System.out.println(" *=============================* ");
                        System.out.println(" ");

                        //Operación.
                        lnResultado = lnNumero1 * lnNumero2;
                        System.out.println(" \uD83D\uDD38 El resultado de " + lnNumero1 + " x " + lnNumero2 + " = " + lnResultado);
                        break;

                    case 4:
                        //Subtítulo + Saltos de línea.
                        System.out.println(" ");
                        System.out.println(" *=================* ");
                        System.out.println(" | D I V I S I Ó N | ");
                        System.out.println(" *=================* ");
                        System.out.println(" ");

                        //Operación + Condición para evitar que se divida entre 0.
                        if(lnNumero2 != 0){
                            //Cálculos + Impresión de datos.
                            lnResultado = lnNumero1 / lnNumero2;
                            System.out.println(" \uD83D\uDD38 El resultado de " + lnNumero1 + " / " + lnNumero2 + " = " + lnResultado);
                        }
                        else{
                            System.out.println(" \uD83D\uDD38 El resultado de " + lnNumero1 + " / " + lnNumero2 + " = Math error... ");
                        }
                        break;

                    case 5:
                        //Subtítulo + Saltos de línea.
                        System.out.println(" ");
                        System.out.println(" *=========================* ");
                        System.out.println(" | P O T E N C I A C I Ó N | ");
                        System.out.println(" *=========================* ");
                        System.out.println(" ");

                        //Operación
                        lnResultado = Math.pow(lnNumero1, lnNumero2);
                        System.out.println(" \uD83D\uDD38 El resultado de " + lnNumero1 + " ^ " + lnNumero2 + " = " + lnResultado);
                        break;

                    case 6:
                        //Subtítulo + Saltos de línea.
                        System.out.println(" ");
                        System.out.println(" *===========================* ");
                        System.out.println(" | R A Í Z   C U A D R A D A | ");
                        System.out.println(" *===========================* ");
                        System.out.println(" ");

                        //Operación + Evitando que se saqué la raíz de un número negativo.
                        if(lnNumero1 >= 0 || lnNumero2 >= 0){
                            System.out.println(" \uD83D\uDD38 La raíz cuadrada de √" + lnNumero1 + " = " + Math.sqrt(lnNumero1));
                            System.out.println(" \uD83D\uDD38 La raíz cuadrada de √" + lnNumero2 + " = " + Math.sqrt(lnNumero2));
                        }
                        else {
                            System.out.println(" \uD83D\uDD38 La raíz cuadrada de √" + lnNumero1 + " = Math error... ");
                            System.out.println(" \uD83D\uDD38 La raíz cuadrada de √" + lnNumero2 + " = Math error... ");
                        }
                        break;

                    case 7:
                        //Subtítulo + Saltos de línea.
                        System.out.println(" ");
                        System.out.println(" *=================================* ");
                        System.out.println(" | R E S I D U O   D I V I S I Ó N | ");
                        System.out.println(" *=================================* ");
                        System.out.println(" ");

                        //Operación.
                        lnResultado = lnNumero1 % lnNumero2;
                        System.out.println(" \uD83D\uDD38 El residuo de " + lnNumero1 + " % " + lnNumero2 + " = " + lnResultado);
                        break;
                }
            }
            else if(lnOpcion == 8){
                //Título + Saltos de línea.
                System.out.println(" ");
                System.out.println(" *====================* ");
                System.out.println(" | A C E R C A    D E | ");
                System.out.println(" *====================* ");
                System.out.println(" ");

                //Acerca de.
                System.out.println(" — Es una calculadora basada con herramientas de programación más estructuradas. ");
                System.out.println(" ©2022 María Reneé Academy. All rights reserved.");
            }
            else if(lnOpcion == 9){
                //Rompemos el ciclo.
                break;
            }
            else{
                //En dado caso se pase del rango.
                System.out.println("\n La opción ingresada no es correcta, intente de nuevo... ");
            }
        }while(lnOpcion != 9);
        //Agradecimiento + Saltos de línea
        System.out.println(" ");
        System.out.println(" \uD83D\uDD39 Gracias por utilizar nuestro programa! ");
        System.out.println(" ");
    }
}