import java.util.Random;
import java.util.Arrays;
import java.io.*;

public class UsingArrays {
    public static void main(String[] args) throws IOException {
        // Recibir 2 números enteros mayores que 12
        System.out.println("Ingrese un entero mayor a 12: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int n1 = Integer.parseInt(br.readLine());
        if (n1 <= 12) {
            System.out.println("Error, valores inválidos");
            return;
        } 
        System.out.println("Ingrese otro entero mayor a 12: ");
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in)); 
        int n2 = Integer.parseInt(br2.readLine());
        if (n2 <= 12) {
            System.out.println("Error, valores inválidos");
            return;
        }
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Random r = new Random();
        int UpperNum = r.nextInt(41) + 10;
        int LowerNum = r.nextInt(11);
        if () {

        }

    }
}
