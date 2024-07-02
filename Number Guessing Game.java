import java.util.Scanner;
import java.util.Random;

public class Number Guessing Game{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String play = "yes";
4
        while(play.equalsIgnoreCase("yes"))
        {
            Random rand = new Random();
            int randNum = rand.nextInt(100) + 1;
            int guess = -1;
            int tries = 0;

            while(guess != randNum)
            {
                System.out.print("Guess a number between 1 and 100: ");
                guess = reader.nextInt();
                tries++;

                if(guess == randNum)
                {
                    System.out.println("Awesome! You guessed the number!");
                    System.out.println("It only took you " + tries + " attempts!!");
                    System.out.print("Would you like to play again? Enter Yes or No: ");
                    play = reader.next().toLowerCase();
                }
                else if(guess > randNum)
                {
                    System.out.println("Your guess is too high. Try again!");
                }
                else
                {
                    System.out.println("Your guess is too low. Try again!");
                }
            }
        }
        reader.close();
    }
}
