import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Task36();

    }

    public static void Task25() {
        double MarkSubject1 = scanner.nextDouble();
        double MarkSubject2 = scanner.nextDouble();
        double MarkSubject3 = scanner.nextDouble();
        double MarkSubject4 = scanner.nextDouble();
        double MarkSubject5 = scanner.nextDouble();

        double percentage = ((MarkSubject1 + MarkSubject2 + MarkSubject3
                + MarkSubject4 + MarkSubject5) / 5);
        double total = (MarkSubject1 + MarkSubject2 + MarkSubject3
                + MarkSubject4 + MarkSubject5);
        if (percentage >= 60) {
            System.out.println("First division");
        } else if (percentage >= 50 && percentage <= 59) {
            System.out.println("Second division");

        } else if (percentage >= 40 && percentage <= 49) {
            System.out.println("Third division");
        } else System.out.println("Fail");
        System.out.println("Total " + total);
        System.out.println("percentege avarage " + percentage);
    }

    public static void Task26() {
        String MaritialStatus = scanner.next();
        String gender = scanner.next();
        int age = scanner.nextInt();
        if (MaritialStatus.equalsIgnoreCase("married")) {
            System.out.println("Driver shoud be insured");
        } else if (MaritialStatus.equalsIgnoreCase("unmarried") &&
                gender.equalsIgnoreCase("male") && age > 30) {
            System.out.println("Driver shoud be insured");
        } else if (MaritialStatus.equalsIgnoreCase("unmarried") &&
                gender.equalsIgnoreCase("female") && age > 25) {
            System.out.println("Driver shoud be insured");
        } else {
            System.out.println("Driver shoud not be insured");

        }
    }

    public static void Task27() {
        String gender = scanner.next();
        int yearOfService = scanner.nextInt();
        String Qualiti = scanner.next();
        if (gender.equalsIgnoreCase("Male") && yearOfService >= 10 &&
                Qualiti.equalsIgnoreCase("Post-Graduate")) {
            System.out.println("Salary is 0");
        } else if (gender.equalsIgnoreCase("Male") && yearOfService >= 10 &&
                Qualiti.equalsIgnoreCase("Graduate")) {
            System.out.println("Salary is 10000");
        } else if (gender.equalsIgnoreCase("Male") && yearOfService < 10 &&
                Qualiti.equalsIgnoreCase("Post-Graduate")) {
            System.out.println("Salary is 10000");
        } else if (gender.equalsIgnoreCase("Male") && yearOfService < 10 &&
                Qualiti.equalsIgnoreCase("Graduate")) {
            System.out.println("Salary is 7000");
        } else if (gender.equalsIgnoreCase("Female") && yearOfService >= 10 &&
                Qualiti.equalsIgnoreCase("Post-Graduate")) {
            System.out.println("Salary is 12000");
        } else if (gender.equalsIgnoreCase("Female") && yearOfService >= 10 &&
                Qualiti.equalsIgnoreCase("Graduate")) {
            System.out.println("Salary is 9000");
        } else if (gender.equalsIgnoreCase("Female") && yearOfService < 10 &&
                Qualiti.equalsIgnoreCase("Post-Graduate")) {
            System.out.println("Salary is 10000");
        } else if (gender.equalsIgnoreCase("Female") && yearOfService < 10 &&
                Qualiti.equalsIgnoreCase("Graduate")) {
            System.out.println("Salary is 6000");
        }
    }

    private static void Task28() {
        int num = scanner.nextInt();
        boolean result = compare(num);
        System.out.println("is reversed number equal? " + result);
    }

    static boolean compare(int number) {
        int firstDigit = number / 10000;
        int secondDigit = number / 1000 % 10;
        int thirdDigit = number / 100 % 10;
        int fourthDigit = number / 10 % 10;
        int fifthDigit = number % 10;

        int reversedNumber =
                fifthDigit * 10000 + fourthDigit * 1000 + thirdDigit * 100 + secondDigit * 10 + firstDigit;
        System.out.println("Reversed number is: " + reversedNumber);

        return reversedNumber == number;
    }

    private static void Task29() {
        int Ram = scanner.nextInt();
        int Shyam = scanner.nextInt();
        int Ajay = scanner.nextInt();
        if (Ram > Shyam && Shyam > Ajay) {
            System.out.println(Ajay + " The youngest is Ajay");
        } else if (Ram > Shyam && Ajay > Shyam) {
            System.out.println(Shyam + " The youngest Shyam");
        } else {
            System.out.println(Ram + " The youngest Ram");
        }

    }

    public static void Task30() {
        double firstAngle = scanner.nextDouble();
        double secondAngle = scanner.nextDouble();
        double thirdAngle = scanner.nextDouble();
        if (firstAngle + secondAngle + thirdAngle == 180) {
            System.out.println("This is triangle ");
        } else {
            System.out.println("This is not triangle");
        }
    }

    public static void Task31() {
        int number = scanner.nextInt();
        int AbsoluteValue = Math.abs(number);
        System.out.println(AbsoluteValue + " absolute value of a number ");
    }

    public static void Task32() {
        int lenght = scanner.nextInt();
        int breadht = scanner.nextInt();
        int P = (lenght + breadht) * 2;
        System.out.println("Perimetr " + P);
        int S = lenght * breadht;
        System.out.println("Area " + S);
        if (S > P) {
            System.out.println("Area of the rectangle is greater than its perimeter");
        } else {
            System.out.println("Area of the rectangle is not greater than its perimeter");
        }
    }

    public static void Task33() {
        double Hardness = scanner.nextDouble();
        double Carbon = scanner.nextDouble();
        double Tensile = scanner.nextDouble();
        if (Hardness > 50 && Carbon < 0.7 && Tensile > 5600) {
            System.out.println("10");
        } else if (Hardness > 50 && Carbon < 0.7 && Tensile < 5600) {
            System.out.println("9");
        } else if (Hardness < 50 && Carbon < 0.7 && Tensile > 5600) {
            System.out.println("8");
        } else if (Hardness > 50 && Carbon > 0.7 && Tensile > 5600) {
            System.out.println("7");
        } else if (Hardness > 50 || Carbon < 0.7 || Tensile > 5600) {
            System.out.println("6");
        } else {
            System.out.println("5");
        }
    }

    public static void Task34() {
        int LateDay = scanner.nextInt();
        if (LateDay <= 5) {
            System.out.println("The fine is 50 paise");
        } else if (LateDay >= 6 && LateDay <= 10) {
            System.out.println("Fine is 1 rupee");
        } else if (LateDay > 10 && LateDay < 30) {
            System.out.println("Fine is 5 rupee");
        } else {
            System.out.println("Your membership will be cancelled");
        }
    }

    public static void Task35() {
        double TimeWorker = scanner.nextDouble();
        if (TimeWorker >= 2 && TimeWorker <= 3) {
            System.out.println(" The worker is said to be highly efficient");
        } else if (TimeWorker > 3 && TimeWorker < 4) {
            System.out.println(" The worker is ordered to improve speed");
        } else if (TimeWorker > 4 && TimeWorker < 5) {
            System.out.println("Worker is given training to improve  his speed");
        } else if (TimeWorker < 2) {
            System.out.println("It is impossible");
        } else {
            System.out.println("The worker has to leave the company");
        }
    }

    public static void Task36() {
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        if (number1 == number2 && number1 == number3
                && number2 == number3) {
            System.out.println(" All numbers are  equal ");
        } else {
            System.out.println(" All numbers are not equal ");
        }

    }
    public static void Task37(){

    }
    public static void Task38(){
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        if (number1>number2 && number2>number3){
            System.out.println("The numbers are increasing");
        } else if (number1<number2 && number2<number3){
            System.out.println("The numbers are decreasing");
        }else {
            System.out.println("The numbers are not incres or decreas");
        }

    }
    public static void Task39(){
        int number = scanner.nextInt();
        if (number%5==0){
            System.out.println("The number is multiplied by 5");
        }else{
            System.out.println("The number is not multiply by 5");
        }
    }

}



