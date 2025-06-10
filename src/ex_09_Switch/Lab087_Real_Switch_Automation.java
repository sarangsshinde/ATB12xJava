package ex_09_Switch;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {


        //Web automation
        // i will ask the user to give me the input from browser which he wants to
        // use to i will start the automation in that browser

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser :");
        String browser = scanner.next();
        browser = browser.toLowerCase();  // lower case convert

        switch (browser){

            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("----------");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firfox":
                System.out.println("Starting the firefox");
                System.out.println("----------");
                System.out.println("TC3");
                System.out.println("TC4");
                break;
            case"edge":
                System.out.println("Starting the edge");
                System.out.println("----------");
                System.out.println("TC5");
                System.out.println("TC6");
                break;
            default:
                System.out.println(" i have no idea which browser is this");
                break;




        }


    }
}
