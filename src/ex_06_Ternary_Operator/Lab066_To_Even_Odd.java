package ex_06_Ternary_Operator;

public class Lab066_To_Even_Odd {
    public static void main(String[] args) {

        // Step 1 -> Input, Output   - data type

        int num = 60;
        //input -> int
        //output -> String -? Odd or Even

        // Step 2 ->
         // num%2==0 -> even Else Odd

        String result = (num%2==0) ? "Even number" : "Odd Number";
        System.out.println(result);

        //Edge Cases  like Negative case if number is negative
        // negative or float



    }
}
