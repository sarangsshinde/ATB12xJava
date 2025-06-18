package ex_14_String;

public class LabStringExample {
    public static void main(String[] args) {


        String s = "Java";
        char c = s.charAt(2); // Index start with 0 (zero)
        System.out.println(c); // print 'v'

        System.out.println(s.codePointAt(0)); // it show


        int idx = "Java".indexOf("a");
        System.out.println("Index of a is : " + idx);

        int idx1 = "Java".lastIndexOf("a");
        System.out.println(idx1);

        boolean b = "".isEmpty();
        System.out.println(b);

        String s11 = String.join("-","JAVA","Python");
        System.out.println(s11);


        String s12 = "Java".replace('a','M');
        System.out.println(s12);



        //Compare to Ignore string CompareToIgnore(String)
        // CompareToIgnore function return or answer in Integer
//            int result = "abc".compareToIgnoreCase("ABC");
//            int result1 = "abc".compareTo("ABC");
//
//             System.out.println(result); // 0 (zero) means True
//             System.out.println(result1); // 32 means False







    }
}
