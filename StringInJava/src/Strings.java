public class Strings {
    public static void main(String[] args){

        // String - String is a collection of characters
        // Simplest method to create string is

        String str1 = "Strings in Java";
        // Variable of type object are called reference.Here, str1 is a reference
        // String object is referred to a literal.
        System.out.println(str1);

        char A[] = {'a', 'b', 'c', 'd', 'e'};
        String str2 = new String(A); // Here, Array of Character is taken and converted into string.
        // Constructor - They are the methods used for creating string objects.
        System.out.println(str2);

        byte B[] = {65, 66, 67, 68};
        String str3 = new String(B);
        // new is a keyword used to create object in heap memory.
        System.out.println(B);

        String str4 = new String("Java Programming");
        System.out.println(str4);

        // Whenever we apply new the object is created in heap memory and the object literal occupy memory in String constant pool.
        // But the object in string constant pool may or may not be created if it is already present there.


    }
}
