//Conditions - Conditions are used to check the statements.

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        /* 1. If-else Statement - It is used to check the condition, It checks the boolean condition true or false.*/

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        if(num == 10){
            System.out.println("Hello World");
        } else{
            System.out.println("Condition is false");
        }

        /* 2. Multiple If-else Statement - It executes one condition for multiple statements.*/
        if(num%2 == 0){
            System.out.println("It is even number");
        } else if (num%2 != 0) {
            System.out.println("It is a odd number");
        } else{
            System.out.println("Not even and odd");
        }
    }
}
