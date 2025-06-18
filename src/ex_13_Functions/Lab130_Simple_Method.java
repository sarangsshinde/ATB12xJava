package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {

   non_return_type_fun();

    int a = retun_type_fun();
        System.out.println(a);

        String s = string_retun_type_fun();
        System.out.println(s);






    }

// non return type function like void is not return anything only printing
   static void non_return_type_fun(){
        System.out.println("Void is non return type function");
    }

    // return type function or method return any type type like integer, string etc.
    static int retun_type_fun(){
        System.out.print("Return type function  : ");
        return 10;
    }

    static String string_retun_type_fun(){
        System.out.print("Return type function  : ");
        return "sarang";
    }

}
