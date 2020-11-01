import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Prompts for user input
        Scanner input = new Scanner(System.in);
        System.out.println("Input any positive integer(0-34): ");
        float num = input.nextInt();
        input.close();
        //Checks to see if user entered a valid input
        if (num == 0) {
            System.out.printf("%.0f factorial is: 1", num);
        } else if (num < 0) {
            System.out.println("Please enter a valid number(0-34)");
        } else {
            //Calculates the factorial
            float factorial = num;
            for (int i = 1; i < num; i++) {
                factorial = factorial * i;
            }
            System.out.printf("%.0f factorial is: %.0f",num ,factorial);
        }
    }
}
