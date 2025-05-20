package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {

        String first_name = "sarang";
        String last_name = "shinde";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a +b); //sarangshinde1010 this act as Join because first is String
        System.out.println(a+ b +first_name + last_name); // 20sarangshinde
        System.out.println(first_name + last_name + (a+b)); //sarangshinde20


    }
}
