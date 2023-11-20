
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task24();

    }


    public static void task1() {

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x > y) {
            System.out.println("Max number " + x);
        } else {
            System.out.println("Max number " + y);
        }
    }

    public static void task2() {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if (x > y && y > z) {
            System.out.println("Max number " + x);
        } else if (y > x && x > z) {
            System.out.println("Max number " + y);
        } else if (z > x && z > y) {
            System.out.println("Max number " + z);

        }
    }

    public static void task3() {
        int x = scanner.nextInt();
        if (x < 0) {
            System.out.println("Number is negdtive");
        } else if (x > 0) {
            System.out.println("Number is positiv");
        } else {
            System.out.println("Number is ZERO");
        }
    }

    public static void task4() {
        int x = scanner.nextInt();
        if (x % 5 == 0 && x % 11 == 0) {
            System.out.println(x + " is divisible by 5 and 11");
        } else {
            System.out.println(x + " is not divisible by 5 and 11");
        }


    }

    public static void task5() {
        int x = scanner.nextInt();
        if (x % 2 == 0) {
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }

    }

    public static void task6() {
        int x = scanner.nextInt();
        if (x % 4 == 0) {
            System.out.println(x + " is a leap year");
        } else {
            System.out.println(x + " is not leap year");

        }
    }

    public static void task7() {
        char ch = scanner.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an alphabet");
        } else {
            System.out.println(ch + " is not an alphabet");

        }

    }

    public static void task8() {
        char ch = scanner.next().charAt(0);
        if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
            System.out.println(ch + " is vowels");
        } else {
            System.out.println(ch + " is not vowels");
        }
    }

    public static void task9() {
        char ch = scanner.next().charAt(0);
        if (Character.isAlphabetic(ch)) {
            System.out.println(ch + " is alphabet");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit");
        } else {
            System.out.println(ch + " is special character");
        }

    }

    public static void task10() {
        char ch = scanner.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is uppercase");
        } else {
            System.out.println(ch + " is not a letter");

        }
    }

    public static void task11() {
        int x = scanner.nextInt();

        if (x == 1) {
            System.out.println(x + " is Monday");
        } else if (x == 2) {
            System.out.println(x + " is Tuesday");
        } else if (x == 3) {
            System.out.println(x + " is Wednesday");
        } else if (x == 4) {
            System.out.println(x + " is Thursday");
        } else if (x == 5) {
            System.out.println(x + " is Friday");
        } else if (x == 6) {
            System.out.println(x + " is Saturday");
        } else if (x == 7) {
            System.out.println(x + " is Sunday");
        } else {
            System.out.println(x + " is not day of week");

        }

    }

    public static void task12() {
        int x = scanner.nextInt();

        if (x == 1) {
            System.out.println(x + " is January");
        } else if (x == 2) {
            System.out.println(x + " is February");
        } else if (x == 3) {
            System.out.println(x + " is March");
        } else if (x == 4) {
            System.out.println(x + " is April");
        } else if (x == 5) {
            System.out.println(x + " is May");
        } else if (x == 6) {
            System.out.println(x + " is June");
        } else if (x == 7) {
            System.out.println(x + " is July");
        } else if (x == 8) {
            System.out.println(x + " is August ");
        } else if (x == 9) {
            System.out.println(x + " is September");
        } else if (x == 10) {
            System.out.println(x + " is October");
        } else if (x == 11) {
            System.out.println(x + " is November");
        } else if (x == 12) {
            System.out.println(x + " is December");
        } else {
            System.out.println(x + " is not month");

        }

    }

    public static void task13() {
        int amount = 6825;
        if (amount >= 2000) {
            int notes = amount / 2000;
            System.out.println("2000 tg = " + notes);
            amount %= 2000;
        }
        if (amount >= 500) {
            int notes = amount / 500;
            System.out.println("500 tg = " + notes);
            amount %= 500;
        }
        if (amount >= 200) {
            int notes = amount / 200;
            System.out.println("200 tg = " + notes);
            amount %= 200;
        }
        if (amount >= 100) {
            int notes = amount / 100;
            System.out.println("100 tg = " + notes);
            amount %= 100;
        }
        if (amount >= 20) {
            int notes = amount / 20;
            System.out.println("20 tg = " + notes);
            amount %= 20;
        }
        if (amount >= 5) {
            int notes = amount / 5;
            System.out.println("5 tg = " + notes);
        }


    }

    public static void task14() {
        double x = scanner.nextInt();// gradus pervogo ugla
        double y = scanner.nextInt();// gradus vtorogo ugla
        double z = scanner.nextInt();// gradus tret'ego ugla
        if (x + y + z == 180) {
            System.out.println("it is triangle");
        } else {
            System.out.println("it is not triangle");
        }
    }

    public static void task15() {
        double a = scanner.nextInt();// bedro triugol'nika
        double b = scanner.nextInt();// bedro triugol'nika
        double c = scanner.nextInt();// bedro trigol'nika
        if ((a + b > c) && (a + c > b) && (c + b > a) && (a > 0) && (b > 0) && (c > 0)) {
            System.out.println("it is triangle");
        } else {
            System.out.println("it is not triangle");
        }

    }

    public static void task16() {
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        if (a == b && b == c && a > 0) {
            System.out.println("Triangle is equilateral");
        } else if (a == b && b != c) {
            System.out.println("Triangle is isosceles");
        } else if (a != b && b != a && a != c) {
            System.out.println("Triangle is scalene");

        }
    }

    public static void task17() {
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root1: " + root1);
            System.out.println("Root2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Root1: " + realPart + " + " + imaginPart + "i");
            System.out.println("Root2: " + realPart + " + " + imaginPart + "i");
        }
    }


    public static void task18() {
        double a = scanner.nextInt(); // profit
        double b = scanner.nextInt(); // loss
        if (a - b > 0) {
            System.out.println("We went to profit");
        } else if (a - b < 0) {
            System.out.println("we went to loss");
        } else
            System.out.println("with my own");

    }

    public static void task19() {
         int m1 = scanner.nextInt();// Physics,
         int m2 = scanner.nextInt();// Chemistry
         int m3 = scanner.nextInt();// Biology
         int m4 = scanner.nextInt();// Mathematics
         int m5 = scanner.nextInt();// Computer
         int tot = m1+m2+m3+m4+m5;
         float percent = tot/5;
         if (percent >=90) {
             System.out.println("Grade A");
         }
             else if (percent >=80) {
                 System.out.println("Grade B");
             }
                 else if (percent >=70) {
                     System.out.println("Grade C");
                 }
                     else if (percent >=60) {
                         System.out.println("Grade D");
                     }
                         else if (percent >=40) {
                             System.out.println("Grade E");
                         }else {
                             System.out.println("Dont pass");
         }



    }
    public static void task20(){
        double basic_salary = scanner.nextInt();
        double hraPercentage;
        double daPercentage;
          if (basic_salary <= 10000){
              hraPercentage = 0.2;
              daPercentage = 0.8;
          } else if (basic_salary <= 20000) {
              hraPercentage = 0.25;
              daPercentage = 0.90;
          } else {
              hraPercentage = 0.30;
              daPercentage = 0.95;
          }
          double hra = basic_salary * hraPercentage;
          double da = basic_salary*daPercentage;
          System.out.println("basic salary: " + basic_salary);
              
          }
          public static void task21(){

        double x = scanner.nextDouble();
        if (x <= 50){
         System.out.println((x*0.5)*0.2 + (x*0.5));
        } else if (x<=150)
        {System.out.println((x*0.75)*0.2 + (x*0.75));

        } else if (x<=250)
        {System.out.println((x*1.2)*0.2 + (x*1.2));

        } else  {System.out.println((x*1.5)*0.2 + (x*1.5));
            
        }

          }
              public static void task22(){
            double x = scanner.nextDouble();//price
            double y = scanner.nextDouble();// quantity
              if (y < 100) {
                  System.out.println(x*y);
              }else if (y >= 100){
                  System.out.println((x*y) - (x*y)*0.1);
                  }
        }
        public static void task23() {
        int currentYear = scanner.nextInt();// Tekuwi god
            int comingYear = scanner.nextInt();// god post

            if ((currentYear - comingYear>3)) {
                System.out.println("Daite bonus " + 2500);
            } else
            {System.out.println("net bonusa");


            }

        }
        public static void task24(){
        double basicSalary = scanner.nextDouble();
        double hra, da;
        if (basicSalary < 1500) {
            hra = basicSalary * 0.1;
            da = basicSalary * 0.9;
        }else {
            hra = 500;
            da = basicSalary * 0.98;
        }
        double grosSalary = basicSalary + da + da;
        System.out.println("Gros salary : " + grosSalary);

        }
}














