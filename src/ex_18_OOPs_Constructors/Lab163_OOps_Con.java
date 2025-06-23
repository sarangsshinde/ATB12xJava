package ex_18_OOPs_Constructors;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.FileInputStream;


public class Lab163_OOps_Con {
    public static void main(String[] args) {

        A a1 = new A();
        System.out.println(a1);
    }


}

class A{
    A(){ // use of Constructor
        System.out.println(" I want to read a CSV file");
        System.out.println("Open the page before loading to do, when object is creation");
        System.out.println("you can do anything which you want to do, when object is created");
        //FileInputStream fileInputStream = new FileInputStream("C://a.txt")
    }
}
