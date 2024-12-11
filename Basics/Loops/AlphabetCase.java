import java.util.Scanner;

public class AlphabetCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word- ");
        char ch = input.next().trim().charAt(0);
        if (ch>='a'&& ch<='z'){
            System.out.println("The alphabet is lowercase");
        }else {
            System.out.println("The alphabet is uppercase");
        }
    }
}
