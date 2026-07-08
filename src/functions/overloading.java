package functions;

public class overloading {
    public static void main(String[] args) {
        fun(2);
        fun("tom");;
    }
    static void fun(int a){
        System.out.println("hello there!");
    }
    static void fun(String name){
        System.out.println("hello string and fam !");

    }
}
