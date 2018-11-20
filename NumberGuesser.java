import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

    public static int generateRandomIntIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    
    public static void main(String[] args){
        int min = 1;
        int max = 5;
        int correctNumber = generateRandomIntIntRange(min, max);

        Scanner input = new Scanner(System.in);
        System.out.println(String.format("Guess a number between %d and %d. ", min, max));
        int guess = input.nextInt();

        do {
            System.out.println(String.format("You guessed %d", guess));

            if (guess < correctNumber) {
                System.out.println("That's wrong! Guess higher.");
            }
            else if (guess > correctNumber) {
                System.out.println("That's wrong! Guess lower.");
            }
            guess = input.nextInt();        
        } while (guess != correctNumber);
       
        if(guess == correctNumber) {
            System.out.println(String.format("The correct number is %d. You are correct!", correctNumber));
        }
    }
}