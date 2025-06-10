package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_If_Else_Scanner {
    public static void main(String[] args) {

        // AGE Program to Vote

        System.out.println("Enter you Age : ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 18){
            System.out.println("Allow to Vote");
        }else {
            System.out.println("Not allow to Vote");
        }
    }
}
