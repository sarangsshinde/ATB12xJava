package ex_10_For_Loop;

public class Lab110_odd_even_From_Top50 {
    public static void main(String[] args) {


        // even number i %2 == 0

        for (int i = 0; i <=50; i++){
            if (i %2 == 0){
                System.out.println(i + "  - even number");
            }
            else {
                System.out.println( i +" - odd number");
            }
        }
    }
}
