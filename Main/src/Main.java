import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("What do you want me to do?");
        System.out.println("1 - Guessing Game");
        System.out.println("2 - Vending Machine");
        System.out.println("3 - Quiz Game");

        Scanner scanner = new Scanner(System.in);
        byte choice = scanner.nextByte();

        switch (choice) {
            case 1:
                System.out.println("Welcome to Guessing Game");
                GuessingGame game = new GuessingGame();
                game.Main();
                break;
            case 2:
                System.out.println("Welcome to Vending Machine");
                VendingMachine vendingMachine = new VendingMachine();
                vendingMachine.Main();
                break;
            case 3:
                System.out.println("Welcome to Quiz Game");
                Quiz_Game quiz_game = new Quiz_Game();
                quiz_game.Main();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}

class GuessingGame {
    public void Main() {
        Random rn = new Random();
        int secretNumber = rn.nextInt(10) + 1;
        System.out.println("You have 3 attempts to guess the secret number (1-10)");
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;
        int guess = scanner.nextInt();
        if (guess == secretNumber) {
            System.out.println("Congratulations! You guessed secret number!");
        } else if (guess > secretNumber) {
            System.out.println("The number is lower than the guess");
            attempts -= 1;
            System.out.println("You have " + attempts + " attempts to guess the secret number");
            System.out.println("Make another guess");
            int guess12 = scanner.nextInt();
            if (guess12 == secretNumber) {
                System.out.println("Congratulations! You guessed secret number!");
            } else if (guess12 > secretNumber) {
                System.out.println("The number is lower than the guess");
                attempts -= 1;
                System.out.println("You have " + attempts + " attempts to guess the secret number");
                System.out.println("Make another guess");
                int guess13 = scanner.nextInt();
                if (guess13 == secretNumber) {
                    System.out.println("Congratulations! You guessed secret number!");
                } else {
                    System.out.println("You lose! The number was - " + secretNumber);
                }
            } else {
                System.out.println("The number is higher than the guess");
                attempts -= 1;
                System.out.println("You have " + attempts + " attempts to guess the secret number");
                System.out.println("Make another guess");
                int guess14 = scanner.nextInt();
                if (guess14 == secretNumber) {
                    System.out.println("Congratulations! You guessed secret number!");
                } else if (guess14 < secretNumber) {
                    System.out.println("The number is higher than the guess");
                    attempts -= 1;
                    System.out.println("You have " + attempts + " attempts to guess the secret number");
                    System.out.println("Make another guess");
                    int guess15 = scanner.nextInt();
                    if (guess15 == secretNumber) {
                        System.out.println("Congratulations! You guessed secret number!");
                    } else {
                        System.out.println("You lose! The number was - " + secretNumber);
                    }
                }
            }
        } else {
            System.out.println("The number is higher than the guess");
            attempts -= 1;
        }
    }
}

class VendingMachine {
    public void Main() {
        System.out.println("Code \"A1\" - Product \"Soda\" - Price: $1.50 ");
        System.out.println("Code \"B2\" - Product \"Chips\" - Price: $1.25 ");
        System.out.println("Code \"C3\" - Product \"Candy\" - Price: $0.75 ");
        System.out.println("Code \"D4\" - Product \"Water\" - Price: $1.00 ");
        Scanner scanner = new Scanner(System.in);
        String Vending_choice = scanner.nextLine();
        switch (Vending_choice) {
            case "A1":
                System.out.println("\"Soda\" - Price: $1.50");
                break;
            case "B2":
                System.out.println("\"Chips\" - Price: $1.25");
                break;
            case "C3":
                System.out.println("\"Candy\" - Price: $0.75");
                break;
            case "D4":
                System.out.println("\"Water\" - Price: $1.00");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}

class Quiz_Game {
    public void Main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select a question category: ");
        System.out.println("1 - Science");
        System.out.println("2 - History");
        System.out.println("3 - Sports");
        byte Quiz_choice = scanner.nextByte();
        switch (Quiz_choice) {
            case 1:
                System.out.println("where is the mytocondria?");
                String ans = "Cells";
                ans = ans.toLowerCase();
                String answer = scanner.next();
                answer = answer.toLowerCase();
                if (answer.equalsIgnoreCase(ans)){
                    System.out.println("Correct! You earned 1 point.");
                } else {
                    System.out.println("Incorrect. The correct answer is [The powerhouse of the cell].");
                }
                break;
            case 2:
                System.out.println("When was Bulgaria founded?");
                int ans1 = 681;
                int user_answer = scanner.nextInt();
                if (user_answer == ans1) {
                    System.out.println("Correct! You earned 1 point.");
                } else {
                    System.out.println("Incorrect. The correct answer is [681]");
                }
                break;
            case 3:
                System.out.println("Who is the basketball goal?");
                String ans2 = "Jordan";
                String answer2 = scanner.next();
                if (answer2.equalsIgnoreCase(ans2)) {
                    System.out.println("Correct! You earned 1 point.");
                } else {
                    System.out.println("Incorrect. The correct answer is [Jordan]");
                }
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
