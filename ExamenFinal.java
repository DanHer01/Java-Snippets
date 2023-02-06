import java.io.*;
import java.util.*;

public class ExamenFinal {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments passed!");
            return;
        }
        String opcion = args[0];
        if (Integer.parseInt(opcion) >= 1) {
            System.out.println("This prints!");
        }

    }
}