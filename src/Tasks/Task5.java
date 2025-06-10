package Tasks;

public class Task5 {
    public static void main(String[] args) {

        // Age through check he/she is Senior citizen, Minor or Adult
        int age = 66;

        String result = (age>=18) ? (age > 65 ? "You are 'Senior'" : "You are 'Adult'") : " You are 'Minor'";
        System.out.println(result);



    }
}
