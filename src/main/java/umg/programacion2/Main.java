package umg.programacion2;

import umg.programacion2.Ejercicios.Puntuacion;
import umg.programacion2.Ejercicios.Tribonacci;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int[] tribo = {0,0,1};
        int[] numeros = {1,2,3,4,5};

        do {
            try {
                System.out.println("===== MENÚ =====");
                System.out.println("1. Puntuación");
                System.out.println("2. Secuencia Tribonacci");
                System.out.println("3. Salir del Programa");
                System.out.print("Elige una opción: ");
                opcion = sc.nextInt();
                if (opcion != 3) {
                    switch (opcion) {
                        case 1:
                            System.out.println();
                            Puntuacion.contador(numeros);
                            System.out.println();
                            break;
                        case 2:
                            System.out.println();
                            Tribonacci.Fibonacci(tribo,3);
                            System.out.println();
                            break;
                        default:
                            System.out.println("\nOpcion no valida\n");
                            break;
                    }
                }
            }catch (Exception e) {
                System.out.println("\nOpcion no valida\n");
                sc.nextLine();
            }
        }while (opcion != 3);
        System.out.println("\nGracias por usar el programa");
    }

}