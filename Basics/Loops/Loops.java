import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
          Syntax of for loops:
          for (initialisation; condition; increment/decrement){
          // body
          }
         */
        // Q: Print numbers from 1 to 5
       for (int i = 1; i <6 ; i++) {
            System.out.println(i);
       }
        // print numbers from 1 to n
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number- ");
        int n = input.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.println(i);
        }
        /*
        Syntax of while loop:
        while (condition) {
        // body
        }
         */
        int num = 1;
        while (num<=5){
            System.out.println(num);
            num++;
        }
        // do while loop runs atleast once and then checks the condition
    }
}
