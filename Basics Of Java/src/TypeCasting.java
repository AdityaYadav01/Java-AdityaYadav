import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        /* Type Conversion - When one type of data is assigned to another type of variable an automatic type conversion will take place under some conditions.
        *  Conditions: 1. Two Types should be compatible.
        *              2. Destination type should be greater than source type.*/

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the any number: ");
        float num = in.nextFloat();  //It will convert any number to floating number. Hence, Automatic type conversion is happening here

        System.out.println(num);

        // Type casting - When we convert one type of data into another type of data is known as Type Casting.

        int num2 = (int)(45.34f);
        System.out.println("Integer number: " + num2); // It will print Integer number because we have type casted the floating number to integer.

        /* Automatic Type Promotion in Expressions:-
        *  While evaluating expressions the intermediate value may exceed the range of operands and hence the expression value will be promoted.
        *  There are some conditions for type promotions:-
        * 1. Java automatically promoted each byte, short, char operand to int when evaluating an expression.
        * 2. If one operand is a long, float, or double the whole expression is promoted long, float, or double.
        * */

        byte a = 100;
        byte b = 125;
        byte c = 20;
        int num3 = a*b+c; // Here, a & b are byte but java automatically promotes it to int while evaluating expression to store its data.

        System.out.println(num3);

        //Example 2.

        byte by = 123;
        short s = 647;
        int i = 39849843;
        float f = 398.92f;
        char ch = 'A';
        double dou = 9.03930;

        double result = (f/s) + (i-ch) + (dou*by);
        System.out.println((f/s)+ " " +(i-ch)+ " " +(dou*by));
        // Here, f/s will going to give floating value because float is bigger. Similarly, with (i-ch) & (dou*by).
        System.out.println(result);






    }
}
