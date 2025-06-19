package ex_16_Arrays;

import java.util.Scanner;

public class Lab163_2D_Right_Triangle {
    public static void main(String[] args) {

        // if n = 3 then print like
        //  *
        //  **
        //  ***

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number e.g = 3 or any : ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------------");

            // left trangle
        for (int k = 0; k < n ; k++){
            for (int m = n; m > k; m--){
                System.out.print("*");
            }
            System.out.println();
        }

        // left trangle by different logic
        System.out.println("--------- Left trangle different logic");
        for (int i = n; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
