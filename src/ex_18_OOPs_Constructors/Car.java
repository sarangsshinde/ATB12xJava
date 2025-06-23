package ex_18_OOPs_Constructors;

public class Car {

    // these are attribute or instance
    String name;
    int year;
    String model;


    //Default constructor

    Car(){
        name = "Unknown Car";
        model = "XXX";
        year = 0;
        System.out.println("Default Constructor");

    }

}
