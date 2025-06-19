package ex_16_Arrays;

public class Lab152_Arrays_Print {
    public static void main(String[] args) {

        int marks[] = {51,45,67,59,88};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("--------  For Loop  ---------");

        for (int i = 0;i<=marks.length;i++){
            System.out.println(marks[i]);
        }

        System.out.println("----- Enhance For loop");

        for(int element : marks){
            System.out.println(element);
        }




    }
}
