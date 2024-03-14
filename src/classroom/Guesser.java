package classroom;

import java.util.Random;
import java.util.Scanner;

public class Guesser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();

        int number = randomNumber.nextInt(10) + 1;
        System.out.println("Guess the right number from 1 to 10: ");
        int answer = input.nextInt();

        //while(condition)

        boolean isGuessed = false;

        while (!isGuessed) {
            if (number == answer) {
                System.out.println("You guessed the number!");
                isGuessed = true;
            } else {
                System.out.println("Incorrect guess, please try again:");
                answer = input.nextInt();
            }
        }

    }
}
