package ex_09_Switch;

public class Lab089_Interview {
    public static void main(String[] args) {

        // this is valid because character is also integer
        char ch = 'A';
        switch (ch){
            case 65:
                System.out.println("Match ASCII");
                break;

            default:
                System.out.println("no match");
        }



    }
}
