package ex_15_StringBuffer_StringBuilder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {

        //String, StringBuilder, StringBuffer in 90% time project we use simple String

        String s0 = "Sarang";
        String s1 = new String("Sarang");

        // less than 10% used
        StringBuffer stringBuffer = new StringBuffer("Sarang");
        StringBuilder stringBuilder = new StringBuilder("Sarang");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());




    }
}
