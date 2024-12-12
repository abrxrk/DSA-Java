public class example3 {
    public static void main(String[] args) {
        int temp = 5;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <= temp; j++) {
                System.out.print("*");
            }
            System.out.println();
            temp = temp - 1;
        }
    }
}
