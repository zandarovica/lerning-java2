package homework;

import java.util.Scanner;

public class FirstHomeWork {
    public static void main(String[] args) {
        // positive number
        int num = 1;
        if (num > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Another");
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


        //Multiple conditions: Write a Java program that checks if a given number
        // is positive, even, and less than 100. If all conditions are true, print
        // "Valid number."
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numb = scanner.nextInt();

        if (numb > 0 && numb % 2 == 0 && numb < 100) {
            System.out.println("Valid number.");
        } else {
            System.out.println("Invalid number.");
        }

        //Nested conditions: Create a Java program that checks if a number
        // is positive, and if so, check if it's even. If both conditions are
        // true, print "Positive and Even."

        System.out.println("Enter a number: ");
        int numm = scanner.nextInt();

        if (numm > 0 && numm % 2 == 0) {
            System.out.println("Positive and Even.");
        } else {
            System.out.println("Unfortunately");
        }

        //Character type identifier: Write a Java program that determines if a
        // given character is a vowel. If it is, print "Vowel." (Use variable with
        // data type: char. When checking character use == and ||)

        System.out.println("Enter a character: ");
        char character = scanner.next().charAt(0);

        char lowerCaseChar = Character.toLowerCase(character);

        boolean isVowel = false;
        if (lowerCaseChar == 'a' || lowerCaseChar == 'e' || lowerCaseChar == 'i'
                || lowerCaseChar == 'o' || lowerCaseChar == 'u') {
            isVowel = true;
        }

        if (isVowel) {
            System.out.println("Vowel");
        } else {
            System.out.println("Not vowel.");
        }

        //BMI calculator: Create a Java program that calculates BMI (Body Mass Index)
        // and categorizes it into different ranges. Print the category based on
        // the BMI. Formula: bmi = weight / (height * height);
        double weight = 72.4;
        double height = 1.67;

        double bmi = weight / (height * height);
        System.out.println(bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
            System.out.println("Minimal health risk");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
            System.out.println("Minimal health risk");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Overweight");
            System.out.println("Increased");
        } else if (bmi >= 30 && bmi <= 34.9) {
            System.out.println("Obese");
            System.out.println("High");
        } else if (bmi >= 35 && bmi <= 39.9) {
            System.out.println("Severely obese");
            System.out.println("Very high");
        } else {
            System.out.println("Morbidly Obese");
            System.out.println("Extremely high");
            }

        //Write a Java program that calculates the final grade for a student based on
        // their scores in three subjects: Math, Science, and English. The program
        // should take input scores for each subject and calculate the average.
        // Assign a final grade based on the following criteria:

        //If the average score is 90 or above, assign a grade of "A."
        //If the average score is between 80 and 89, assign a grade of "B."
        //If the average score is between 70 and 79, assign a grade of "C."
        //If the average score is between 60 and 69, assign a grade of "D."
        //If the average score is below 60, assign a grade of "F."

        System.out.println("Enter Math score:");
        double mathScore = scanner.nextDouble();

        System.out.println("Enter Science score:");
        double scienceScore = scanner.nextDouble();

        System.out.println("Enter English score:");
        double englishScore = scanner.nextDouble();

        double allScore = (mathScore + scienceScore + englishScore) / 3;

        char finalGrade;
        if (allScore >= 90) {
            finalGrade = 'A';
        } else if (allScore > 89) {
            finalGrade = 'B';
        } else if (allScore > 79) {
            finalGrade = 'C';
        } else if (allScore > 60 && allScore < 69) {
            finalGrade = 'D';
        } else {
            finalGrade = 'F';
        }
        System.out.println("Final Grade: " + finalGrade);
    }


}
