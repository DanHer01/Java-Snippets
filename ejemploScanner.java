import java.util.Scanner;

public class ejemploScanner {
    public static void main(String[] args) {
        //Inicializar valor en memoria.
        Scanner spaceInMemory = new Scanner(System.in);
        /*Se define el final del scanner, para que no siga leyendo datos. */
        String myText = spaceInMemory.nextLine();
        System.out.println("Hey y'all");
        /*Se imprime el valor leido*/
        System.out.print("El mensaje ingresado es: " + myText);
    }
}
