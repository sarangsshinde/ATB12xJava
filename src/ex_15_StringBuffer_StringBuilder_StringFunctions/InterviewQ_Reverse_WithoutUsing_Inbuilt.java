package ex_15_StringBuffer_StringBuilder_StringFunctions;

public class InterviewQ_Reverse_WithoutUsing_Inbuilt {
    public static void main(String[] args) {


        String input = "Sarang";
        String reverse_op = null;

        for (int i = input.length()-1;i>=0;i--){

            reverse_op = reverse_op + input.charAt(i);
            System.out.print(input.charAt(i));
        }
        System.out.println(reverse_op);

        // check it is Palindrom or not

        if (reverse_op==input){
            System.out.println("Palindrome");
        } else {

            System.out.println("Not a palindrome");
        }

        // second type through reverse string

        StringBuffer sb = new StringBuffer(input);
        sb.reverse();
        System.out.println(sb);

    }
}
