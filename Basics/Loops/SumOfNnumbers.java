import java.util.Scanner;

public class SumOfNnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the given number- ");
        int a = input.nextInt();
        int b = 0;
        for (int i = 1; i <=a ; i++) {
            b = b + i; //this will add the number and store it in b as the sum 
        }
        System.out.print("The sum of N numbers is- " + b);
    }
}
