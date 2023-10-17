import java.util.Scanner;

public class fifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        double sum = 0;

        for (int i = 0; i <= n; i++) {
            double term = Math.pow(2, i);
            sum += term;
        }

        int result = (int) sum;

        System.out.println("The sum of the series is: " + result);
    }
}
