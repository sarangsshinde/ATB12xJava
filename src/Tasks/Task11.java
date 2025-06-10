package Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        // Kids have grade like -> A -> Excellent, F - > Fail
        // you will give the message to the kid if yu got
        //excellent, very good, good need to Improvement
        // fail or invalid grade.

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter Kids Grade : ");

        if(scanner.hasNext()){
            String grade = scanner.next();

            switch (grade){

                case "A":
                    System.out.println("Excellent");
                    break;
                case "B":
                    System.out.println("Very Good");
                    break;
                case "C":
                    System.out.println("Good");
                    break;
                case "D":
                    System.out.println("Needs Improvement");
                    break;
                case "F":
                    System.out.println("Fail");
                    break;
                default:
                    System.out.println("Enter only Grade like A,B,C,D,F");



            }



        }
        else {
            System.out.println(" You are enter wrong input, please check");
        }

    }
}
