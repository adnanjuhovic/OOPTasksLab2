import java.util.Scanner;

public class zadatak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("The sum of the three numbers is: " + sum);
    }
}