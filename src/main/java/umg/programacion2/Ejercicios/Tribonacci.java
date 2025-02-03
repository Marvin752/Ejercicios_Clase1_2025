package umg.programacion2.Ejercicios;

import java.sql.PreparedStatement;
import java.util.Arrays;

public class Tribonacci {

    public static void Fibonacci(int[] n, int k) {
        if(k <= 3){
            System.out.println(Arrays.toString(n));
        }
        else {
            int[] resultado = new int[k];
            System.arraycopy(n, 0, resultado, 0, 3);
            for(int i = 3; i < k; i++)
            {
                resultado[i] = resultado[i-1] + resultado[i-2] + resultado[i-3];
            }
            System.out.println(Arrays.toString(resultado));
        }
    }

}
