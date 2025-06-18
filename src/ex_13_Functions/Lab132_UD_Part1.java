package ex_13_Functions;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {

    // 4 type of User defined functions

        //1. Without parameters and without return type
        //2. Without parameters but with return type
        //3. With parameters and without return type
        //4. with parameters and with return type

        //1. Without parameters and without return type
        System.out.println("1. Without parameters and without return type    ---- calling");
    wp_wr_greet();

        //2. Without parameters but with return type
        System.out.println("//2. Without parameters but with return type  --- calling");
    String s = greet_with_hello_wp_with_RT();
        System.out.println(s);


        //3. With parameters and without return type
        System.out.println("//3. With parameters and without return type  --- calling");
        greet_with_details("Sarang",43,500);
        greet_with_details("Reva",41,6000);

        // system through input
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE NAME : ");
        String name = scanner.next();
        System.out.println("ENTER AGE :");
        int age = scanner.nextInt();
        System.out.println("Enter SALARY");
        double salary = scanner.nextDouble();
        greet_with_details(name,age,salary);



        //4. with parameters and with return type
        System.out.println("//4. with parameters and with return type  ---- calling");
        int sum = sum_of_three_number(3,5,5);
        System.out.println(sum);




    }



    //1. Without parameters and without return type

    static void wp_wr_greet(){
        System.out.println("Hi, how are you");

    }

    //2. Without parameters but with return type
    static String greet_with_hello_wp_with_RT(){ // if () in bracket any thing mean it is parameter
        System.out.println("2. Without parameters but with return type");
        return "Hi, are you  ";


    }

    //3. With parameters and without return type
    static void greet_with_details(String name,int age, double salary){
        System.out.println("Your name is : " + name + "  your age is : " + age + "  your Salary is : " + salary);

    }

    //4. with parameters and with return type
    static  int sum_of_three_number(int a,int b, int c){
        return a+b+c;
    }


}
