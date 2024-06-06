import java.util.Scanner;

// Find the roots of quadratic equation take a, b, c input from user
public class RootsOfQuadEq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a,b,c;   // a,b,c are the real numbers

        System.out.print("Enter the value of a: ");
        a = in.nextInt();
        System.out.print("Enter the value of b: ");
        b = in.nextInt();
        System.out.print("Enter the value of c: ");
        c = in.nextInt();

        double x = Math.sqrt((b*b)-4*a*c);
        System.out.println(x);

        double root1 = (-b+x)/(2*a);
        double root2 = (-b-x)/(2*a);

        System.out.println("The value of root 1 is "+ root1);
        System.out.println("The Value of root 2 is "+ root2);


    }
}
