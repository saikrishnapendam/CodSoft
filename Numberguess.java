import java.util.Random;
import java.util.Scanner;

public class Numberguess {
    static final int MINI_RANGE = 1;
    static final int MAXI_RANGE = 100;
    static final int MAXI_ATTEMPTS = 10;
    static final int MAXI_ROUNDS = 3;

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int totalScore = 0;

        System.out.println("NUMBER GUESSING GAME");
        System.out.println("Total Number Of Rounds : 3");
        System.out.println("Attempts To Guess Number in Each Round : 10\n");
        for (int i = 1; i <= MAXI_ROUNDS; i++) {
            int number = rd.nextInt(MAXI_RANGE) + MINI_RANGE;
            int attempts = 0;

            System.out.printf("Round %d: Guess the number between %d and %d in %d attempts.\n", i, MINI_RANGE,
                    MAXI_RANGE,
                    MAXI_ATTEMPTS);
            while (attempts < MAXI_ATTEMPTS) {
                System.out.println("Enter your guess : ");
                int guess_number = sc.nextInt();
                attempts = attempts + 1;

                if (guess_number == number) {
                    int score = MAXI_ATTEMPTS - attempts;
                    totalScore = totalScore + score;
                    System.out.printf("Hurray! Number Guessed Successfully. Attempts = %d. Round Score = %d\n",
                            attempts, score);
                    break;
                }

                else if (guess_number < number) {
                    System.out.printf("The number is greater than %d. Attempts Left = %d.\n", guess_number,
                            MAXI_ATTEMPTS - attempts);
                }

                else if (guess_number > number) {
                    System.out.printf("The number is less than %d. Attempts Left = %d.\n", guess_number,
                            MAXI_ATTEMPTS - attempts);
                }

            }

            if (attempts == MAXI_ATTEMPTS) {
                System.out.printf("\nRound = %d\n", i);
                System.out.println("Attempts = 0");
                System.out.printf("The Random Number is : %d\n\n", number);
            }
        }
        System.out.printf("GAME OVER. Total Score = %d\n", totalScore);
        sc.close();
    }  
 }