import javax.naming.Name;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Ex10();


        System.out.println("Hello");
        System.out.println("Tarybayev Talap");
    }

    public static void Number() {
        int a = 74;
        int b = 36;
        int sum = a + b;
        System.out.println("sum of two numbers s eq.to " + sum);
    }


    public static void Devide() {
        int a = 10;
        int b = 2;
        int sum = a / b;
        System.out.println("10/2");
        System.out.println(sum);
    }

    public static void Ex4() {
        int a = -5 + 8 * 6;
        int b = (55 + 9) % 9;
        int c = 20 + (-3 * 5 / 8);
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }

    public static void Ex5() {

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x * y);


    }

    public static void Ex6() {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
    }

    public static void Ex7() {
        int x = scanner.nextInt();
        for (x = 1; x <= 10; x++) ;
        System.out.println(" x " + x + " = ");
    }

    public static void Ex8() {
        int J, a, v;
        System.out.println(" " + " " + "J" + " " + " " + " " + "a" + " " + " " + "v" + " " + " " + " " + " " + "v" + " " + " " + "a");
        System.out.println(" " + " " + "J" + " " + " " + "a" + " " + "a" + " " + " " + "v" + " " + " " + "v" + " " + " " + "a" + " " + "a");
        System.out.println("J" + " " + "J" + " " + " " + "aaaaa" + " V" + " " + "V" + " " + " " + "aaaaa");
        System.out.println(" " + "JJ" + " " + "a" + " " + " " + " " + " " + "a" + " " + " " + "V" + " " + " " + "a" + " " + " " + " " + " " + " " + "a");
    }

    public static void Ex9(){
        double result = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(result);
    }
    public static void Ex10(){
        double result = (4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
        System.out.println(result);
    }
}
