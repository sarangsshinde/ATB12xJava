package Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        //Factorial for n = user will enter the n from 0 to Max(int)
        // ex. if user enter 5 then 1*1*2*3*4 =

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the fact number : ");
        int n = scanner.nextInt();

        int fact =1;
        if (n==0){
            fact = 1;
        }

        // how to use integer max value handle
        if (Integer.MAX_VALUE < n){
            System.out.println("I can't handle the the number > max of Int");
        }

        for (int i =1; i <= n; i++){
            //System.out.println();
            fact = fact * i;

        }
        System.out.println(fact);
    }
}
