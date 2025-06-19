package ex_16_Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {

        int[] array = {25,34,54,34,23,67,78,87,45,99};
        int max_number = give_max_element_array(array);
        int min = array[0];

        System.out.println("Max Array no. is  : " + max_number);


        // this is for Minimum
        for (int j=0;j<array.length;j++){
            if (array[j] < min){
                min = array[j];
            }
        }
        System.out.println("Miminum is  : " + min);



    }

    static int give_max_element_array(int[] array){ // this method or function for Max
        // for function through that's why we create other wise same Minimum we can achive this also
        int max = 0;
        //logic
        for (int i = 0; i < array.length;i++){
            if (array[i] > max);
            max = array[i];
        }


        return max;
    }
}
