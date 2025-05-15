package ex_03_Literals;

public class Lab034_Char_Literals {
    public static void main(String[] args) {

        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("SarangShinde");
        System.out.println("Sarang" + new_line + "Shinde");
        System.out.println("Sarang" + tab_line + "Shinde");
        System.out.println("Sarang"+ back_space + "Shinde");
        System.out.println("------");
        System.out.println("Sarang is old"+carriage_return + "Shinde");

    }
}
