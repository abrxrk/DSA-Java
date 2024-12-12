public class pattern6 {
    public static void main(String[] args) {
        // upper half of the problem
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower half of the problem
        int temp = 4;
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=temp; j++) {
                System.out.print("* ");
            }
            System.out.println();
            temp = temp - 1; // this will make the pyramid in decreasing order.
        }
    }
}
