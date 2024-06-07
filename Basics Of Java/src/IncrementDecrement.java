public class IncrementDecrement {
    public static void main(String[] args) {
        //Pre-Increment
        int x = 10;
        //int y = ++x;     // It will first increment the value of x & then, store it into y

        //System.out.println(x + " " + y);

        //Post-Increment
        int a = 10;
        //int b = a++;  // It will first store the value of a in b and then, increment the value of a

        //System.out.println(a + " " + b);

        //Example - Performing Increment & Decrement on Expression.

        int z = (3*x++) + (2*++a);
        // It will store the value of 'x' & for 'a' it will increment its value first
        System.out.println("The Value of Z: "+z);

    }
}
