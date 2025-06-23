package ex_18_OOPs_Constructors;

import sun.rmi.runtime.Log;

public class Lab164_Car {
    public static void main(String[] args) {

        Car tesla = new Car();
        tesla.name = "Tesla Model 3";
        tesla.year = 2025;
        System.out.println(tesla.name);
        System.out.println(tesla.year);
        System.out.println(tesla.model); // model value not set but it get on default constructor


        Car nano = new Car();
        nano.name = "Nano Model 2";
        nano.year = 2024;

        System.out.println(nano.name);
        System.out.println(nano.year);
        System.out.println(nano.model); // model value not set but it get on default constructor


        LoginPage l = new LoginPage();


    }
}
