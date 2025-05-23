package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {

        long phone_no = 9876543210L;
        // short s = phone_no; // Narrowing - Implicit -> Not possible
        short s1 = (short) phone_no; //Narrowing Explicit then possible but data loss issue

        System.out.println(s1);



    }
}
