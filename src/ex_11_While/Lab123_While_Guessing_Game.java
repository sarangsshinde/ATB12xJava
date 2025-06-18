package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_Game {
    public static void main(String[] args) {

        // Guess the number between 1 to 100

        // Random is Class to give any number
        Random random = new Random();
        int numberTOGuess = random.nextInt(100)+1;
        System.out.println(numberTOGuess); // if you hide this line then you guess


        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the guess number  : ");

        int guess;
        int attempts = 0;

        while (true){

            guess = scanner.nextInt();
            attempts++;

            if (guess < numberTOGuess){
                System.out.println("Too Low, try again");
            }else if (guess > numberTOGuess){
                System.out.println("Too high, try again");
            }
            else {
                System.out.println("Correct! You guessed it in  " + attempts + " Attempted ");
                break;
            }



        }







    }
}
