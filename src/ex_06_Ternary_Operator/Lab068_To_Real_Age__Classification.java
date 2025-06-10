package ex_06_Ternary_Operator;

import java.sql.Struct;

public class Lab068_To_Real_Age__Classification {
    public static void main(String[] args) {

        // Again, use the nested ternary. You have to figure it out if I am an adult, minor, or senior. What is the condition? The condition is very simple. If my age is greater than 18, then I can be minor or adult or senior. But if my age is greater than 65, then I am a senior. If I am between 18 to 65, then I am an adult.

        String user_input = args[0];  // this time we use CLI command line through number add
        // now String convert to integer
        int age = Integer.parseInt(user_input);
        System.out.println(age);

        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior Citizen";
        System.out.println(result);

    }

}
