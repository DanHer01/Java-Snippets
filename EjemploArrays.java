import java.util.*;

public class EjemploArrays {
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[8];
        
        for(int i = 0; i<a.length; i++) {
            a[i] = r.nextInt(100);
        }

        for(int i:a)
    }
}
