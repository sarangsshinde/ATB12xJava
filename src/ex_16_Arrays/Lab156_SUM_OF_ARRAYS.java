package ex_16_Arrays;

public class Lab156_SUM_OF_ARRAYS {
    public static void main(String[] args) {

        int[] number = {12,10,20};
        int sum = 0;

        for (int i =0; i < number.length;i++){
            sum = sum + number[i];


        }
        System.out.println("sum of Array is : " + sum);

    }
}
