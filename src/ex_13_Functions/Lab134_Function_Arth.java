package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {

    // Create a function of sub, sum, multiplication, Division
        // with parameter a/b (take a parameter from user)

        Scanner scanner = new Scanner(System.in);
        int a = readInteger(scanner, "Enter num1: ");
        int b = readInteger(scanner, "Enter num2: ");

        int s = sum(a,b);
        int s1 = sub(a,b);
        int s2 = div(a,b);

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);


    }

     static int readInteger(Scanner scanner, String prompt) {  //readInteger method created
        System.out.print(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Enter the integer only.");
            System.exit(0); // Exit if invalid input
            return -1; // Unreachable, but required by Java
        }
    }

    static  int sum(int a, int b){
        return a + b;
    }

    static  int sub(int a, int b){
        return a - b;
    }
    static  int div(int a, int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }





}
