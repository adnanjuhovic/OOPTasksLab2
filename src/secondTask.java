//.Create a program that asks the user for three numbers and then prints their sum.
import java.util.Scanner;
public class secondTask {
    public static void main (String[] args) {
        Scanner reader = new Scanner (System.in);

        int sum=0;
        int read;
        System.out.println("Enter the first number:");
        read = reader.nextInt();
        sum += read;


        System.out.println("Enter the second number:");
        read=reader.nextInt();
        sum=sum+read;

        System.out.println("Enter the third number");
        read=reader.nextInt();
        sum=sum+read;

        System.out.println("Sum is:" +sum);



    }













}
