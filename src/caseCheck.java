import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().trim().charAt(0);

        // .next() tells to take the input
        //.trim() remove the extra spaces that the word follows
        //.charAt(n) gives the character present at the nth index

        //System.out.println(sc.next().trim());
//        String word = "Ujjwal";
//        System.out.println(word.trim().charAt(3));    // prints w



        if(ch >='a' && ch <= 'z'){
            System.out.println("Character is Lowercase :"+ch);
        }
        else{
            System.out.println("Character is Uppercase");
        }

     }
}
