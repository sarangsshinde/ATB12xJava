package ex_14_String;

public class LabStringExamle3 {
    public static void main(String[] args) {


        String s = "HelloWorld".substring(0,4);  // .substring(4) means first 4 character bypass and remaing print
        System.out.println(s);

        String s1 = "HelloWorld".substring(5,10); // substring(5,10) means first Hello bypass and World print
        System.out.println(s1);

        char[] arr  = "Java".toCharArray();
        System.out.println(arr);

        String s2 = " Sarang World ".trim();
        System.out.println(s2);

//        boolean b = " ".isBlank(); // .isBlank use in JDK 11 and above
//        System.out.println(b);

//        String s3 = "ab".repeat(3);  // .repeat us repeated 3 time
//        System.out.println(s3); // Output is "ababab"


        boolean b2 = "Java".equalsIgnoreCase("JAVA");
        System.out.println(b2);

        //format
        String s4 = String.format("%s = %d","age",25);
        System.out.println(s4);




    }
}
