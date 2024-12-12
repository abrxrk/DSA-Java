public class pattern4 {
    public static void main(String[] args) {
        // outer loop = no.of rows
        for (int i = 1; i <=5 ; i++) {
            // inner loop = no.of coloumn
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
