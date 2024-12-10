import java.util.Scanner;

public class fundamentals {
    public static void main(String[] args) {
        //primitive data types of java
        int a = 14;
        double b = 5.5; //large decimal number
        String name = "Abrar"; //string is not a primitive data type
        char letter = 'K';
        float c = 76.4f; //to use a float we have to add f in the end as double is more precise than float
        long d = 35334636456456L; //long integer values and we have to end it with L
        boolean check = true;
        //Inputs
        // scanner class is used to take input and system.in means taking input from keyboard
        Scanner input = new Scanner(System.in);
        //nextInt means taking integer as input
//       System.out.println(input.nextInt());
        System.out.print("Enter your roll no- ");
        int rollno = input.nextInt();
        System.out.println("Your roll no is-" + rollno);

    }
}
