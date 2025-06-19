package ex_16_Arrays;

public class Lab2ndHighestArray {
    public static void main(String[] args) {


        // without using function
        int[] number = {12,14,20,13,15,30,20};
        int highest  = 0;
        int secondHighest = 0;

        for (int num : number){  //this is Enhanced for loop we can use simple for loop also
            if (num > highest){
                secondHighest = highest;
                highest = num;

            } else if (num > secondHighest && num != highest){
                secondHighest = num;
            }
        }
        System.out.println(secondHighest);
    }
}
