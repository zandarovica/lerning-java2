package classroom;

public class ConditionalStatements {
    public static void main(String[] args) {
        if (true) {
            System.out.println("This code is executed!");
        }

        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        if (x > 12) {
            System.out.println("x is graeter than 12");
        }

        boolean isSpring = true;
        if (isSpring) {
            System.out.println("It is spring!");
        }

        // <, >, ==, <=, >=, !=

        int age = 28;
        if (age <= 12) {
            System.out.println("This is Child!");
        } else {
            System.out.println("Something else!");
        }

        if (age <= 12) {
            System.out.println("This is Child!");
        } else if (age >= 13 && age <= 19) {
            System.out.println("This is Teenager!");
        } else if (age >= 20 && age <= 59) {
            System.out.println("This is Adult!");
        } else {
            System.out.println("This is Senior!");
        }

        int num = -2;
        if (num == 10) {
            System.out.println("Is The number is equal 0");
        } else if (num < 0) {
            System.out.println("The number is negative");
        } else if (num > 0) {
            System.out.println("The number is positive");
        }
        
        int time = 24;
        if (time >= 0 && time <= 11) {
            System.out.println("Good Morninng!");
        } else if (time >= 12 && time <= 17) {
            System.out.println("Good Afternoon!");
        } else if (time >= 18 && time <= 23) {
            System.out.println("Good Night!");
        } else {
            System.out.println("Invalid time provided!");
        }

        

    }
}
