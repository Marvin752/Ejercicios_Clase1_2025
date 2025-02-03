package umg.programacion2.Ejercicios;

import java.util.Arrays;

public class Puntuacion {

    public static void contador (int[] numeros)
    {
        int total = 0;
        for(int contador : numeros)
        {
            if (contador == 5 ){
                total += 5;
            }
            else if (contador % 2 == 0){
                total += 1;
            }else
            {
                total += 3;
            }
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println("\nProducción: " + total);
    }

}
