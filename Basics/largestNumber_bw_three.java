import java.util.Scanner;

public class largestNumber_bw_three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st number- ");
        int a = input.nextInt();
        System.out.print("Enter the 2nd number- ");
        int b = input.nextInt();
        System.out.print("Enter the 3rd number- ");
        int c = input.nextInt();
        if (a > b){
            if (a > c){
                System.out.println("a is the largest number");
            } else{
                System.out.println("c is the largest number");
            }
        } else if (b > c) {
            System.out.println("b is the largest number");
        }else {
            System.out.println("c is the largest number");
        }
    }
}
