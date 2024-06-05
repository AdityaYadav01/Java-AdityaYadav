// Take the temperature in farehnait and convert it into celsius.
import java.util.Scanner;
public class TempConversion_Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the temperature in farehnait: ");
        float fern = in.nextFloat();

        float celsius = (fern-32) * 5/9;

        System.out.println("Current temperature in celsius is: " + celsius);
    }
}
