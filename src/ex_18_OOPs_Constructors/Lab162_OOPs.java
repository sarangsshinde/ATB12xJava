package ex_18_OOPs_Constructors;

public class Lab162_OOPs {
    public static void main(String[] args) {

        // you can created 2 way object creation
        Baby b1 = new Baby();
        new Baby();

    }


}

class Baby{

    String name;

    Baby() { // this is Default constructor
        // This is called automatically, when a object created

        System.out.println(" I am called, Object is Created");

    }
}
