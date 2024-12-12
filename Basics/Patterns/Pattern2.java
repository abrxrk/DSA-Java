public class Pattern2 {
    public static void main(String[] args) {
        // outer loop = no. of rows
        for (int i = 1; i <=4 ; i++) {
            // inner loop= no. of coloumn
            for (int j = 1; j <=4 ; j++) {
                System.out.print("*");
            }
            System.out.println(); // this will print a new line after one row is completed
        }
    }
}
