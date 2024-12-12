public class Pattern11 {
    public static void main(String[] args) {
        // outer loop-> no of rows
        for (int i = 1; i <=5 ; i++) {
            //for spaces
            for (int j = 5; j>=i; j--) {
                System.out.print("  ");
            }
            //right side of the triangle
            for (int j = i; j >=1 ; j--) {
                System.out.print(j + " "); //spaces are added to make the pattern appear more cleaner.
            }
            //left side of the triangle
            for (int j = 2; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
