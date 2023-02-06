import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(2);
        for (int i = 0; i < 500; i++) {
            System.out.println(num);
            num = r.nextInt(11);
        }
    }
}