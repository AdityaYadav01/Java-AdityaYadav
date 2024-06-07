// Store Two Numbers in 1 Byte
public class StoringNumberInByte {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 8;
        byte c;  // We have to store a and b in c.

        // Bit Merging - The process of setting one of the bit as 1 in all zeros is called Merging.
        c = (byte)(a<<4); // Storing a in c on the left side of bit
        c = (byte)(c|b);  // Storing b in c on the right hand side of bit

        // Bit Masking - It means you are hiding all the bits and showing only particular bits.
        System.out.println((c&0b11110000)>>4);  // Printing the a bit
        System.out.println((c&0b00001111));     // Printing the b bit

    }
}
