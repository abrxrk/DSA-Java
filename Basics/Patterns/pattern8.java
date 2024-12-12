public class pattern8 {
    public static void main(String[] args) {
        // upper half of the pyramid
        for (int i = 1; i <=5 ; i++) {
            //for printing spaces
            for (int j = 5; j >=i ; j--) {
                System.out.print(" ");
            }
                for (int k = 1; k <=i ; k++) {
                    System.out.print("* ");
                }
                System.out.println();
        }
        //lower half of the pyramid
        for (int i = 4; i >=1 ; i--) {
            for (int j = 5; j>=i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
