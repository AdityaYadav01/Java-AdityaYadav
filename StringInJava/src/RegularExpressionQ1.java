// Find if a number is binary or not

import java.util.Scanner;

public class RegularExpressionQ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int bin = in.nextInt();

        String str = String.valueOf(bin);
        System.out.println(str.matches("[01]+"));

        // Find if it is a date in format(dd/mm/yyyy)
        String str1 = "11/12/2002";
        System.out.println(str1.matches("[0-3][1-9]/[01][1-9]/[0-9]{4}"));
    }
}
