package Tasks;

public class Task7 {
    public static void main(String[] args) {

        int a = 11, b = 22;

        int c = a + b + a++ + b++ + ++a + ++b;

        System.out.println("a=" + a);  // 13

        System.out.println("b=" + b); // 24

        System.out.println("c=" + c); // 103
    }
}
