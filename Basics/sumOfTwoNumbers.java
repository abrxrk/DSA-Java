import java.util.Scanner;

public class sumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number- ");
        int a = input.nextInt();
        System.out.print("Enter the second number- ");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("The sum for the given numer is- "+ sum);
    }
}
