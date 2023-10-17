//1. Create a program that asks the user for a password.
// If the password is right, a secret message is shown to the user.
//The .equals() method in Java is used to compare the contents of two objects to check if they are equal.
// In the context of strings (like passwords), .equals() is used to compare whether two strings
// have the same sequence of characters.

import java.util.Scanner;
public class firstTasks {
    public static void main(String[] args) {
        while(true) {
            String correctPassword = "carrot";

            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter a password: ");

            String password=scanner.nextLine();


            if (password.equals(correctPassword))  {
                System.out.println("Right!");
                System.out.println("Your secret is:jrry qbar!");

                break;

            }


            else {

                System.out.println("Wrong!");

            }




        }


    }


}