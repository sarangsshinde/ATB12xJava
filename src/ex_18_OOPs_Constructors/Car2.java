package ex_18_OOPs_Constructors;

public class Car2 {

    String model;
    int year;


    Car2(){   //Constructor overloading here same constructor name 'Car2 but parameter is different

        model = "xxx";
        year = 1900;
        System.out.println("Default Constructor");
    }

    Car2(String model_name,int year_created) {
        this.model = model_name;
        this.year = year_created;
    }

    Car2(String model_name){
            this.model = model_name;



    }

}
