package ex_17_OOPs;

public class Lab161_Cats {
    public static void main(String[] args) {

        Cat c1 = new Cat(); // object create with reference
        Cat c2 = null;// here object not created
        new Cat(); // object created without reference

        c1.running();
      //  c2.running();  // this line throw error 'Null Pointer Exception' because c2 are not created object

    }


}

class Cat{
    String name;


    void running(){

        System.out.println("Running");
    }
}
