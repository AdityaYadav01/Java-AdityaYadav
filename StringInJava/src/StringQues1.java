// Find if the email id is on gmail. Find Username and Domain name form the email id

import java.util.Scanner;
public class StringQues1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your email id: ");
        String str = in.nextLine();
        int user = str.indexOf('@');
        String Username = str.substring(0,user);
        System.out.println("Username of the email id is " + Username);

        int dot = str.indexOf('.');
        String domain = str.substring(user+1,dot);
        System.out.println("Domain name is " + domain);


    }
}
