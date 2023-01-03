import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {

            System.out.println("To play, enter ROCK, PAPER, or SCISSORS. Enter EXIT to leave the game.");
            String userInput = scan.nextLine();

            ArrayList<String> pcChoices = new ArrayList<String>();
            pcChoices.add("ROCK");
            pcChoices.add("PAPER");
            pcChoices.add("SCISSORS");

            Random rand = new Random(System.currentTimeMillis());
            String pcInput = pcChoices.get(rand.nextInt(pcChoices.size()));

            if (pcInput.equals(userInput))
            {
                System.out.println("A tie! You both chose " + pcInput);

            } else if ((pcInput.equals("ROCK") && userInput.equals("SCISSORS")) ||
                    (pcInput.equals("PAPER") && userInput.equals("ROCK")) ||
                    (pcInput.equals("SCISSORS") && userInput.equals("PAPER")))
            {
                System.out.println("The computer won with " + pcInput + " against " + userInput);

            } else if ((userInput.equals("ROCK") && pcInput.equals("SCISSORS")) ||
                    (userInput.equals("PAPER") && pcInput.equals("ROCK")) ||
                    (userInput.equals("SCISSORS") && pcInput.equals("PAPER")))
            {
                System.out.println("You won with " + userInput + " against " + pcInput);

            } else if (!(userInput.equals("ROCK") || userInput.equals("PAPER") || userInput.equals("SCISSORS") || userInput.equals("EXIT")))
            {
                System.out.println("Invalid Input");
            }
            if (userInput.equals("EXIT"))
            {
                System.out.println("Thank you for playing!");
                break;
            }

        }
        scan.close();




    }
}
