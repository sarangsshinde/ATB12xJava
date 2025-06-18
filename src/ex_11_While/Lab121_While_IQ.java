package ex_11_While;

import java.util.Scanner;

public class Lab121_While_IQ {
    public static void main(String[] args) {

        //Factorial program  like
        // if user give 5 then
        // 5*4*3*2* 1 =

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the any number : ");

        if (!scanner.hasNextInt()){
            System.out.println(" Enter the Integer, rerun the program ");
        }

        int number = scanner.nextInt();
        int factorial =1;

        if (number == 0){
            System.out.println("factorial is :"+ factorial);
        }

        if (number > Integer.MAX_VALUE){
            System.out.println("can't get the factorial it is out of bound");
        }

        int i = 1;
        while (i <= number){
            factorial = factorial * i;
            i++;
        }
        System.out.println("factorial is : " + factorial);



    }
}
