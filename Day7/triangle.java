public class triangle {
    public static void main(String[] args) {
    for (int i = 1; i <= 4; i++) {
        // Print leading spaces
        for (int j = 1; j <= 4 - i; j++) {
            System.out.print(" ");
        }
        // Print asterisks
        for (int j = 1; j <= 2 * i - 1; j++) {
            System.out.print("*");
        }
        // Move to the next line
        System.out.println();
    }
  }
}
