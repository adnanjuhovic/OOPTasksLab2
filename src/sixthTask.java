
import java.util.Scanner;

public class sixthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of times to print the text: ");
        int numberOfTimes = scanner.nextInt();

        for (int i = 0; i < numberOfTimes; i++) {
            printText();
        }
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}

