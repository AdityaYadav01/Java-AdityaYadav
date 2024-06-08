import java.util.Scanner;

// Take in two numbers and an operator (+, -, *, /) and calculate the value.
//(Use if conditions)
public class Operators_Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number 1: ");
        int num1 = in.nextInt();

        System.out.print("Enter the number 2: ");
        int num2 = in.nextInt();

        if(num1>num2){
            System.out.println("The Sum of Two Numbers: " + (num1+num2));
        }else if(num2>num1){
            System.out.println("The Subtraction of Two Numbers: " + (num2-num1));
            System.out.println("The Division of Two Numbers: " + (num2/num1));
        } else if (num1 == num2) {
            System.out.println("The Multiplication of Two Numbers: " + (num1*num2));
        }else{
            System.out.println("No Output");
        }
    }
}
