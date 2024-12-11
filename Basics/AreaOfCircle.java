import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius- ");
        double radius = input.nextDouble();
        // formula of area = pie x r^2
        float pie = 3.14f;
        double a = pie * radius * radius;
        System.out.print("The area for the given circle is - " + a + " cm^2");
    }
}
