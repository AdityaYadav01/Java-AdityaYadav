// Bitwise operators are special operators in programming languages that perform operations directly on the binary representations of integers.
public class BitwiseOperator {
    public static void main(String[] args) {
        int x = 8; // Binary representation of 8 is 00001000 for 1 byte
        int y = 4; // Binary representation of 4 is 00000100 for 1 byte

        // Performing &(AND) operation
        int z = x&y;
        System.out.println(z);

        // Performing |(OR) operation
        int a = 0b1000; // Binary value of 8
        int b = 0b0100; // Binary value of 4
        int or = a|b;

        System.out.println("The value of " + a + " and " + b + " for OR operation " + or);

        // Performing ^(XOR) operation
        int xor = a^b;
        System.out.println("The value of " + a + " and " + b + " for OR operation " + xor);

        // Performing Left Shift Operation(<<)
        int leftshift = a<<1;
        // Left Shift operator doubles the value of a when it is shifted by 1 position. N*2^k
        System.out.println("The value of " + a + " when left shift operator is " + leftshift);

        // Performing Right Shift Operation(>>)
        int rightshift = a>>1;
        // Left Shift operator half the value of a when it is shifted by 1 position. N%2^k
        System.out.println("The value of " + a + " when left shift operator is " + rightshift);

        // Performing Unary Operator(~)
        int unary = ~a;
        System.out.println("The value of " + a + " for using unary operator is " + unary);

        // Performing Unsigned Right Shift Operation(>>>)
        int t=-12;
        int unsignedrightshift = t>>>1;
        // Left Shift operator half the value of a when it is shifted by 1 position. N%2^k
        System.out.println("The value of " + a + " when unsigned right shift operator is " + unsignedrightshift);

    }
}
