import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base- ");
        int a = input.nextInt();
        System.out.print("Enter the height- ");
        int b = input.nextInt();
        double h = 0.5 * a * b;
        System.out.println("The area of the given triangle is- " + h + " cm^2");
    }
}
