public class Pattern1 {
    public static void main(String[] args) {
        int n = 4;
        //outer loop= no. of rows
        for (int i = 1; i <=4 ; i++) {
            // inner loop = no.of coloumn
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println(); // this will print the next pattern in a new line.
        }
    }
}
