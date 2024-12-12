public class pattern3 {
    public static void main(String[] args) {
        // outer loop = no. of rows
        for (int i = 5; i >=1 ; i--) {
            // inner loop = no.of coloumn
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println(); // this will print a new line after each row is done.
        }
    }
}
