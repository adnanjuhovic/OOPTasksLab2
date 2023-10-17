public class ninthTask {
    public static void main(String[] args) {
        drawInvertedStarsPyramid(5);
        System.out.println(); // Add a newline for separation
        drawInvertedStarsPyramid(10);
    }
    public static void drawInvertedStarsPyramid(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // Print spaces
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* "); // Print stars
            }
            System.out.println();
        }
    }
}
