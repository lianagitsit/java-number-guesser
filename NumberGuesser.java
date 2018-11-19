import java.util.ArrayList;
import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args){
        int correctNumber = 2;

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 5. ");
        int guess = input.nextInt();
        System.out.println(String.format("You guessed %d", guess));

        if(guess == correctNumber) {
            System.out.println(String.format("The correct number is %d. You are correct!", correctNumber));
        }
        else if (guess < correctNumber) {
            System.out.println("That's wrong! Guess higher.");
        }
        else if (guess > correctNumber) {
            System.out.println("That's wrong! Guess lower.");
        }
    }
}