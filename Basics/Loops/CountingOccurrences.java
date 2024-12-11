import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number- ");
        int num = input.nextInt();
        int count = 0;
        while (num>0){
            int rem = num % 10; //this will give me the last digit
            if (rem == 3){
                count++;
            }
            num = num/10; //remove the last digit number
        }
        System.out.println(count);
    }
}
