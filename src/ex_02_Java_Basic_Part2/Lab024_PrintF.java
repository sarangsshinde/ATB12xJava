package ex_02_Java_Basic_Part2;

public class Lab024_PrintF {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(a);
        System.out.printf("your variable is %d",a);
        System.out.println("");
        // if you use integer %d  -> int, byte, long, short, -- data type
        // if String  %s -> String
        // if float %f -> float, double
        // if %b -> boolean

        int b = 20;
        System.out.printf("a value is %d, b value is %d", a,b);
        System.out.println();
        System.out.printf("a=%d, b=%d",a,b);



    }
}
