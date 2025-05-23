package ex_06_Ternary_Operator;

public class Lab065_Interview_Max_Two_TO {
    public static void main(String[] args) {

         int x = 10;
         int y = 20;

        System.out.println(Math.max(x,y));

        //Ternary operator through
        int max = x > y ? x : y;
        System.out.println(max);

    }
}
