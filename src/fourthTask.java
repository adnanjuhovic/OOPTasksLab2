import java.util.Scanner;
public class fourthTask {
    public static void main (String[] args) {
        Scanner reader=new Scanner (System.in);

        System.out.println("First number: ");
        int firstNumber= reader.nextInt();


        System.out.println("Last number: ");
        int lastNumber=reader.nextInt();

        if(firstNumber>lastNumber) {
            System.out.println();
        }


        else {
            int currentNumber=firstNumber;

            while (currentNumber<=lastNumber) {
                System.out.println(currentNumber);
                currentNumber++;
            }


        }



    }
}
