package ex_14_String;

public class Lab137_String_IMM {
    public static void main(String[] args) {

        String s1 = "hello";
        s1.concat("world");
        System.out.println( s1); // here print only "hello'


        s1 = s1.concat("world"); //here new string created
        System.out.println(s1); // here print "helloworld"



    }
}
