public class HelloWorld {
    /* 1. public - It is an access modifier which allow us to access the class from anywhere.
    *  2. class - It is a name group of properties and functions.
    *  3. HelloWorld - It is the name of the class as same as name of the java file. */

    public static void main(String [] args){
        /* 1. public - It is access modifier which allow us to access main method/function from anywhere.
        *  2. static - It is a keyword which allow main method to run without creating an object.
        *  3. void - It is a keyword used when we don't want to return anything from the main method.
        *  4. String [] args - It is command line argument of string type array.
        *  5. main - main is the name of the function.
        */

        System.out.println("Hello World");
        /* 1. System - It is the final class of Java lang package.
        *  2. out - It is the variable of PrintStream type which is public and static member field of the System class.
        *  3. println - It is the method of PrintStream class. It prints the argument passed to it and add a new line.*/
    }
}
