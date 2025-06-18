package Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {


        //Reverse the number using for loop. (In - 12345, Out - 54321)

        int i;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number : ");

        int number = scanner.nextInt();

        int reverse = 0;

        while (number!=0){
            int digit = number %10; // here get the last digit
            reverse = reverse * 10 + digit; // append digit
            number = number / 10;

        }

        System.out.println("Reversed Number is : " + reverse);




    }
}
