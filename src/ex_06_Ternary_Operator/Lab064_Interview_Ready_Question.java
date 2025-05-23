package ex_06_Ternary_Operator;

public class Lab064_Interview_Ready_Question {
    public static void main(String[] args) {


        //Nested Ternary
        // result = condition1 ? expression1 : (condition2 : expression2 : expression3);

        int Age = 19;
        String result = (Age > 18) ? (Age > 25 ? "In Goa, You can drink" :"In Goa, You can't drink") : "YOU CAN'T GO GOA";
        System.out.println(result);

    }
}
