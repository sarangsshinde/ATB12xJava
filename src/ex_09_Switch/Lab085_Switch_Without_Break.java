package ex_09_Switch;

import java.util.Scanner;

public class Lab085_Switch_Without_Break {
    public static void main(String[] args) {

        // this program ask in Cozanint company here "break" is missing

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day number (1 to7) : ");
        int day = scanner.nextInt();

        switch (day){

            case 1:
                System.out.println("Monday");

            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");

            case 4:
                System.out.println("Thursday");

            case 5:
                System.out.println("Friday");

            case 6:
                System.out.println("Saturday");

            case 7:
                System.out.println("Sunday");

            default:
                System.out.println(" Enter the Integer number 1 to 7 Only ");

        }


    }
}
