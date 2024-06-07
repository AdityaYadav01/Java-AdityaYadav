// Swap two Numbers using Bitwise operator take input from user
import java.util.Scanner;
public class SwapNumusingBitwise_Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;
        System.out.println("The Swapped numbers are " + num1 + " " + num2);


    }
}
