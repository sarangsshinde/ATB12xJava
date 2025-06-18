package Tasks;

public class Task9_Triangle_Classifier {
    public static void main(String[] args) {


        int side1 = 1;
        int side2 = 5;
        int side3 = 5;

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {


            if (side1 == side2 && side1 == side3) {
                System.out.println("EQ");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("ISO");
            } else {
                System.out.println("scalene");
            }
        }
        else
        {
            System.out.println("not a valid Triangle");
        }
    }
}
