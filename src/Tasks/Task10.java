package Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        // Write a Java program that takes a month number (1-12) and prints the number of days
        // in that month using a switch statement. Handle February separately for leap years.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number between 1 to 12 : ");

        if (scanner.hasNextInt()) {
            int month = scanner.nextInt();

            switch (month) {
                case 1:
                    System.out.println("January month 31 days");
                    break;
                case 2:
                    // System.out.println("February month 28 days");
                    System.out.print("Please enter the year to check for leap year: ");
                    if (scanner.hasNextInt()) {
                        int year = scanner.nextInt();

                        // Leap year check: divisible by 4 and (not divisible by 100 unless divisible by 400)
                        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

                        if (isLeap) {
                            System.out.println("February month has 29 days (Leap Year)");
                        } else {
                            System.out.println("February month has 28 days");
                        }
                    } else {
                        System.out.println("Invalid year input");
                    }

                    break;
                case 3:
                    System.out.println("March month 31 days");
                    break;
                case 4:
                    System.out.println("April month 30 days");
                    break;
                case 5:
                    System.out.println("May month 31 days");
                    break;
                case 6:
                    System.out.println("June month 30 days");
                    break;
                case 7:
                    System.out.println("July month 31 days");
                    break;
                case 8:
                    System.out.println("August month 31 days");
                    break;
                case 9:
                    System.out.println("September month 30 days");
                    break;
                case 10:
                    System.out.println("October month 31 days");
                    break;
                case 11:
                    System.out.println("November month 30 days");
                    break;
                case 12:
                    System.out.println("December month 31 days");
                    break;
                default:
                    System.out.println(" Number is not given in 1 to 12 range, please check");


            }
        }
        else {
            System.out.println("Please check User enter wrong Input");

        }

    }

}
