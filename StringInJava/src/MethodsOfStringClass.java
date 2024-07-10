import java.util.Scanner;

public class MethodsOfStringClass {
    public static void main(String[] args) {

        // The methods create new string before giving the results and the new object is created into heap memory.

        String str = "Java Programming"; // Literal is created in String pool literal

        // 1. length() - It returns the length of the string
        int str1 = str.length();                                     // The new object of string is created in heap memory.
        System.out.println("length of the string is" + str1);

        // 2. toLowerCase() - Convert the string to lower case
        String str2 = str.toLowerCase();
        System.out.println(str2);

        // 3. toUpperCase() - Convert the string to uppercase
        String str3 = str.toUpperCase();
        System.out.println(str3);

        // 4. substring(int begin, int end) - It gives the new string from where the index is given and end.
        String str4 = str.substring(0,5);
        System.out.println(str4);

        // 5. trim() - It removes the blank space from the string.
        String str5 = str.trim();
        System.out.println(str5);

        // 6. replace(old char, new char) - It replace old character with new character.
        String str6 = str.replace('a','f');
        System.out.println(str6);

        // 7. startsWith(String) - To find the particular string word of the string
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the word: ");
        String word = in.nextLine();
        boolean str7 = word.startsWith("Java");
        System.out.println(str7);

        // 8. charAt(int index) - To find the particular character present on the index given
        char str8 = str.charAt(0);
        System.out.println(str8);

        //9. indexOf(String str) - To find the index of given character.
        int str9 = str.indexOf("a",1);
        System.out.println(str9);

        String strA = "Java";
        String strB = "java";
        String strC = "Python";
        String strD = "Python";

        //10. equals(String) - To check whether the two strings are equal or not
        boolean eq = strA.equals(strB);
        System.out.println(eq);

        // 11. compareTo(String) - To compare two strings acc. to the dictionary order
        int eq2 = strA.compareTo(strB);
        int eq3 = strB.compareTo(strA);
        System.out.println(eq2);
        System.out.println(eq3);

        // 12. valueOf(int i) - To convert different type of data into string data type
        int a = 20;
        String s12 = String.valueOf(a);
        System.out.println(s12.concat(" hello"));


    }
}
