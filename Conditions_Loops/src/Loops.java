// Loops - Loops are used to iterate a part of program several times.

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /* 1. For Loop - It is used when we know how many times a loop will iterate.
        *      Syntax:-
        *              for(initialization, condition, increment/decrement){
        *                                                                     BODY
        *              }
        *
        * 2. While Loop - It is used when we don't know how many times a loop will iterate. It is also called entry control loop.
        *
        *    Syntax:-
        *              initialization
        *              while(condition){
        *                          //body
        *                          // increment/decrement
        *                  }
        *
        * 3. do while loop - It is used when we want to execute our statement atleast one time. It is also called exit control loop because it checks condition after the execution of program.
        *
        *    Syntax:-
        *              do{
        *                  //code to be executed
        *                  // update statement - increment/decrement
        *                }
        *              while(condition);
        **/
        
        // Examples:-

        // Printing the number from 1 to 10 using for loop
        System.out.print("Counting from 1 to 10 : ");
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }

        // Printing the numbers from 1 to n using while loop

        System.out.println();
        System.out.print("Enter the number till where you want to print your number: ");
        int num = in.nextInt(); // Taking the input of number till where you want to print your number

        int i = 1;
        while(i<=num){
            System.out.print(i + " ");
            i++;
        }

        // Sum of Numbers from 1 to 100 using do-while loop
        int sum = 0;
        int n = 1;

        do{
            sum = sum+n;
            n++;
        }while(n<=100);

        System.out.println();
        System.out.print("Sum of numbers from 1 to 100 are: " + sum);

    }
}
