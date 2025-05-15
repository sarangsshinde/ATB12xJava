package Tasks;

public class Tasks1 {

    /*
      5 table to create

       5 * 1 = 5
       5 * 2 = 10
       ...
       ...
       ...
       .
       5 * 10 = 50
     */

    public static void main(String[] args) {
        int num =5;

        for(int i=1;i<=10;i++)
        System.out.printf("%d * %d = %d%n",num,i,num*i);

    }
}
