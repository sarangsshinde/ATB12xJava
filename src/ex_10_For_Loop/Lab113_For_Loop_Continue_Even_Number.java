package ex_10_For_Loop;

public class Lab113_For_Loop_Continue_Even_Number {
    public static void main(String[] args) {

        // even number find with continue use

        for (int i = 0; i <= 50; i++){
            if (i %2 == 0){
                //System.out.println(i + "  - Even number");
                continue;
            }
            else {
                System.out.println(i + "  -  odd number");
            }
          }

        }




    }

