import java.util.Scanner;
public class InputsInJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* 1. Scanner - It is the class in java util package which is required to take input.
        *  2. in - It is an object we are creating to take input from the user.
        *  3. new - It is a keyword used to create object.
        *  4. System.in - 'System' is the class & 'in' is a variable which denotes that we are taking input from standard input stream (i.e Keyboard)  */

        System.out.print("Enter the number: ");
        int num = in.nextInt();  // nextInt() is the function used to take integer number as an input.

        System.out.println(num + " is the number we have taken as a input from keyboard");
    }
}
