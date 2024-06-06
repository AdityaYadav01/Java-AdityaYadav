import java.util.Scanner;

// Calculate the Area of Triangle and take input from user.
public class AreaOftriangle_Q4 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int b = in.nextInt();

        System.out.print("Enter the height: ");
        int h = in.nextInt();

        float area = (float)(0.5*b*h);
        System.out.println("Area of Triangle when base & height is given: " + area);

        // Finding area of triangle using all sides
        float s1, s2, s3, side;

        System.out.print("Enter the side 1: ");
        s1 = in.nextFloat();
        System.out.print("Enter the side 2: ");
        s2 = in.nextFloat();
        System.out.print("Enter the side 3: ");
        s3 = in.nextFloat();

        side = (s1+s2+s3)/2f;
        double Area = Math.sqrt(side*(side-s1)*(side-s2)*(side-s3));

        System.out.println("Area of Triangle when 3 sides is given: " + Area);


    }
}
