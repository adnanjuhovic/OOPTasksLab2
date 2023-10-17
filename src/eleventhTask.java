public class eleventhTask {
    public static void main(String[] args) {
        drawNumbersPiramid(5);
        System.out.println();
        drawNumbersPiramid(10);
    }

    public static void drawNumbersPiramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
