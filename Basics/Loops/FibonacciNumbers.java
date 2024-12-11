import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth Fibonacci Number- ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count<= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println("The Fibonacci Number is " + b);
    }
}
