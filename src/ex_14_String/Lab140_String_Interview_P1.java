package ex_14_String;

public class Lab140_String_Interview_P1 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello"; // String Constant Pool presnt 1 string "Hello" because s1 and s2 represnt to hello
        String s5 = "Hello"; // still present 1 string
        String s6 = "hello"; // new SCP present 2 string "Hello" & "hello"

        String s3 = new String("Hello");
        String s4 = new String("Hello"); // object area present 2 because "new" operator create new one
        String s7 = new String("Hello");






    }
}
