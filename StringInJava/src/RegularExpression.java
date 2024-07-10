public class RegularExpression {
    public static void main(String[] args) {
        // Regular Expression - They are used to define symbol.
        // Quantifier - These are used to define number of symbols you want

        String str1 = "abcdase";
        boolean b1 = str1.matches(".*");
        System.out.println(b1);

        // Checking if the email id is from gmail or not
        String str2 = "aditya123@gmail.com";
        boolean b2 = str2.matches(".*gmail.*");
        System.out.println(b2);

        boolean b3 = str2.matches("\\w*@gmail.*");
        System.out.println(b3);


    }
}
