public class inverted {
    public static void main(String[] args) {
    // TODO: print the inverted triangle
        /*
         * * * * *
         * * * *
         * * *
         * *
         * 
         */
    for (int i = 5; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}
