package ex_14_String;

public class Lab141_String_Interview_P2 {
    public static void main(String[] args) {


        String s1 = "Hello";
        String s2 = "Hello";
        String s6 = "hello";


        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("hello");

        // == -> comparsion -> String => this check the reference location

        System.out.println(s1==s3);  // output is False
        System.out.println(s1 == s2);
        System.out.println(s3 == s4); // this is Faise because in different area they exists
        System.out.println(s1 == s6);

        System.out.println("----------------------");

        // Equals (content) - > value

        System.out.println("------Equals --------");

        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s6)); // this will False
        System.out.println(s1.equalsIgnoreCase(s6)); // this will True
        //equalsIgnoreCase  --> they will not check case sensetive like sarang or SARANG











    }
}
