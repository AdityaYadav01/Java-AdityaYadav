import java.util.Scanner;
// Take 2 numbers as input and print the largest number.
public class LargestNumber_Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        if(num1>num2){
            System.out.println(num1 + " is the largest number.");
        } else if (num2>num1) {
            System.out.println(num2 + " is the largest number.");
        }else{
            System.out.println("Both the numbers are equal.");
        }


    }
}
