import java.util.Scanner;

public class RegularExpressionQ2 {
    public static void main(String[] args) {
        // Remove Special Characters from the string
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any message: ");
        String str = in.nextLine();

        String rep = str.replaceAll("^a-z0-9A-Z","");
        System.out.println("Message after removing special characters: "+rep);

        // Remove extra space from the string
        String str2 = "ABC   DEF   GHI   JKL   MNO  PQR  STU  VWX  YZ";
        System.out.println(str2.replaceAll("\\s+"," "));
    }
}
