package ex_06_Ternary_Operator;

public class Lab067_To_Three_Max {

    public static void main(String[] args) {

        // Use the ternary operator, nested ternary operator. If we have three numbers, N1, N2, and N3, give me the maximum between the three numbers.

        int a=80,b=88, c=30;

        int result = (a > b) ? (a > c) ? a : c : ((b > c) ? b : c);
        System.out.println(result);


    }
}
