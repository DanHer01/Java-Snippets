import java.io.*;

public class TradingCalculator {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the Trading Calculator!\n");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String initialAmount, exRate;

        //Request for inital amount to invest in GTQ
        initialWhile:
        while(true) {
            System.out.println("Enter initial trading amount in Quetzales: ");
            initialAmount = br.readLine();

            switch(initialAmount) {
                case "":
                    System.out.println("Nothing was entered!");
                    break;
                case "exit":
                    break initialWhile;
                default:
                    System.out.println(initialAmount);
            }
            
            System.out.println("Enter exchange rate GTQ/USD: ");
            exRate = br.readLine();
            
            switch(exRate) {
                case "":
                    System.out.println("Nothing was entered!");
                    break;
                case "exit":
                    break initialWhile;
                default:
                    System.out.println(exRate);
            }
            
        }
        
    }
}