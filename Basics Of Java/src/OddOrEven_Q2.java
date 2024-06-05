import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input from the user.
public class OddOrEven_Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        if(num%2==0){
            System.out.println("It is a even number");
        }else{
            System.out.println("it is a odd number");
        }
    }
}
