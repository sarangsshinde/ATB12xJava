package ex_06_Ternary_Operator;

public class Lab063_TO_P1 {
    public static void main(String[] args) {

        int number = 5;
        String result = number > 0 ? "positive" : "negative";
        // int result1 = number > 0 ? "positive" : "negative"; // this line is wrong because data type is integer and output  is string

        System.out.println(result);

    }
}
