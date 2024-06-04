import java.util.Scanner;
public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float n1 = in.nextFloat();

        System.out.print("Enter the second number: ");
        float n2 = in.nextFloat();

        float sum = n1+n2;
        System.out.println("Sum of " + n1 + " & " + n2 + " is " + sum);
    }
}
