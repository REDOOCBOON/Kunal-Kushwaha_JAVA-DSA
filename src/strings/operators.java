package strings;



import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // operator converts them into ascii values and just adds them
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char) ('a' + 3));   // converts the final ascii value to a character that is d here
        System.out.println("a" + 1);

        System.out.println("Ujjwal" + new ArrayList<>());



    }
}
