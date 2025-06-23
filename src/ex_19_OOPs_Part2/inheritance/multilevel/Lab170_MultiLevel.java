package ex_19_OOPs_Part2.inheritance.multilevel;

public class Lab170_MultiLevel {
    public static void main(String[] args) {

        System.out.println(" -------- Son can access all like Son/Father/GrandFather------");
        Son sarang = new Son();
        sarang.bhk3();
        sarang.extra();
        sarang.gf();
        sarang.home();



        System.out.println(" -------- Father can access Father / GrandFather------");
        Father f1 = new Father();
        f1.extra();
        f1.gf();
        f1.home();


        System.out.println(" -------- Grand Father can access only his property------");
        GrandFather f2 = new GrandFather();
        f2.gf();
        f2.home();


        Son s3 = new Son(); // iT IS POSSIBLE
       // Son s4 = new Father(); // not possible because when 'new Father()' object create that time Son is present - No
        // Son class extends to Father

        Father f3 = new Son(); // This is called 'Dynamic Dispatch
        // above line possible because when 'new Son()' object create that time Father class already exists

        GrandFather gf1 = new Son(); // possible - because when 'new Son()' object create that time GrandFather class already exists
        GrandFather gf2 = new Father(); // possible - because when 'new Father()' object create that time GrandFather class already exists

        // all possible because of 'extend' key word





    }

}
