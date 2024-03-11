package homework;

public class FirstHomeWork {
    public static void main(String[] args) {
        // positive number
        int num = 1;
        if (num > 0) {
            System.out.println("The number is positive");
        } else if (num < 0) {
            System.out.println("The number is negative");
        } else if (num == 0) {
            System.out.println("Is The number is equal 0");
        }

        // odd/even number
        int number = 50;
        boolean isEven = number % 2 == 0;
        System.out.println(isEven);

        // age
        int age = 22;
        if (age <= 12) {
            System.out.println("This is Child!");
        } else if (age >= 13 && age <= 19) {
            System.out.println("This is Teenager!");
        } else if (age >= 20 && age <= 59) {
            System.out.println("This is Adult!");
        } else {
            System.out.println("This is Senior!");
        }

//        int year = 2020;
//        boolean isLeapYear;
//
//        // divisible by 4
//        isLeapYear = (year % 4 == 0);
//
//        // divisible by 4, not by 100, or divisible by 400
//        isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0);
//
//        if (isLeapYear) {
//            System.out.println(year + " is a leap year.");
//        } else {
//            System.out.println(year + " is not a leap year.");
//        }



    }
}
