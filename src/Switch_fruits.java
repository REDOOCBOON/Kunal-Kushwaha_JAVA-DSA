import java.util.Scanner;
import java.util.SortedMap;

public class Switch_fruits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter fruit name :");
        String fruit = in.next();

        switch (fruit) {
            case ("Mango") -> System.out.println("King of Fruits");
            case ("Orange") -> System.out.println("Round fruit");
            case ("Banana") -> System.out.println("rich in Mg");
            case ("Apple") -> System.out.println("Keeps the doctor away");
            default -> System.out.println("Fruit not in dict ");
        }

        System.out.println("enter the number of day");
        int day = in.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("enter number between 1-7");


        }

    }
}
