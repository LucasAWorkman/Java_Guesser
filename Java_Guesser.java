
import java.util.Random;
import java.util.*;
import java.util.Scanner;

class RandomOutput{
    private int Max_Range = 100;
    private int Min_Range = 1;

    public int RandomNum() {
        Random rand = new Random();
        return rand.nextInt(Max_Range - Min_Range + 1) + Min_Range;
    }

    public void GuessingSim() {
        int Num = RandomNum();
        int CurrentGuess = 0;
        Scanner input = new Scanner(System.in);
        while (CurrentGuess < 7) {
            System.out.println(CurrentGuess + ") Please enter a number : ");
            
            String GuessNumStr = input.nextLine();

            int GuessNum;
            GuessNum = Integer.parseInt(GuessNumStr);

            if (GuessNum < Num) {
                System.out.println("You guessed too low!");
            } else if (GuessNum > Num) {
                System.err.println("You guessed too high!");
            } else {
                System.out.println("You got it right in " + CurrentGuess + " Guesses");
                return;
            }

            CurrentGuess++;
            

        }
        System.out.println("You didnt guess it within 7 guesses");
    }
 


    public void ComputerGuesses() {
        Scanner input = new Scanner(System.in);
        int low = Min_Range;
        int high = Max_Range;
        int attempts = 0;

        System.out.println("Think of a number between " + Min_Range + " and " + Max_Range + " (inclusive).");
        System.out.println("I will try to guess it. Type 'higher', 'lower', or 'correct' when prompted.");

        while (low <= high) {
            int guess = (low + high) / 2;  
            System.out.println("I guess " + guess +  "/n Too (H)igh, Too (L)ow, or (C)orrect?");
            String response = input.nextLine().toLowerCase();

            if (response.equals("h")) {
                low = guess + 1; 
            } else if (response.equals("l")) {
                high = guess - 1;  
            } else if (response.equals("c")) {
                System.out.println("I guessed it in " + (attempts + 1) + " attempts!");
                return;
            } else {
                System.out.println("Invalid input! Please type 'H', 'L', or 'C'.");
                continue;  
            }

            attempts++;
        }

        System.out.println("I was made to get your number correct in 7 guesses so stop lying i got it right!");
    }



    public static void main(String[] args) {
        RandomOutput randomOutput = new RandomOutput();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("0) Exit");
            System.out.println("1) Human Guesser");
            System.out.println("2) Computer Guesser");
            System.out.print("Please enter 0-2: ");
            String choice = input.nextLine().trim();

            if (choice.equals("0")) {
                System.out.println("Goodbye!");
                break;
            } else if (choice.equals("1")) {
                randomOutput.GuessingSim();
            } else if (choice.equals("2")) {
                randomOutput.ComputerGuesses();
            } else {
                System.out.println("Invalid choice! Please enter 0, 1, or 2.");
            }
        }

        input.close();
    }
}