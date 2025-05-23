package ex_05_TypeCasting;

public class Lab061_TypeCasting_Used {
    public static void main(String[] args) {


        int Course = 100;
        float GST = 18.45f;

        // int total1 = Course + GST; // Narrowing Implicit -> Not possible
        int total = Course+(int) GST; //Narrowing Explicit -> Possible

        System.out.println(total);  // decimal loss because of Integer value float in decimal

        float total2 = Course+GST; // Widening - auto - implicit
        System.out.println(total2); //here we are not loss decimal point




    }
}
