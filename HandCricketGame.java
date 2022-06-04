import java.util.Scanner;
import java.util.Random;

// Fully bug free Hand Cricket game.
// Made by itsme-Subid
// Special thanks to: Rajeet Kumar Ash for helping me to understand the Java Concepts.
// Thank you to those who helped me in this project.
// Date: 04-06-2022

class User {
    public static boolean InputCheck(int userInput, int max) {
        if (userInput < 0 || userInput > max) {
            System.out.println("\nInvalid input. Please try again.\n");
            return true;
        }
        return false;
    }

    public static int toss() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0(for tail) or 1(for head)");
        int userInput = sc.nextInt(), toss = 0;
        if (InputCheck(userInput, 1)) {
            toss();
        } else {
            toss = rand.nextInt(2);
            System.out.println(toss == userInput ? "\nYou win the toss!\n" : "\nYou lose the toss!\n");
        }
        return toss == userInput ? 1 : 0;
    }

    public static void bat(int userScore, int pcScore, int cout) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int cond = 1, pcInput = 0, isBatting = 1;
        cout += 1;
        System.out.println("You are batting\n");
        againBat: while (cond == 1) {
            System.out.println("Enter number within 0-6");
            int userInput = sc.nextInt();
            if (InputCheck(userInput, 6)) {
                cout -= 1;
                continue againBat;
            } else {
                pcInput = rand.nextInt(7);
                System.out.println("Computer chose " + pcInput + "\n");
                if (userInput == pcInput) {
                    cond = 0;
                    getScore(userScore, pcScore, cout, isBatting);
                    userOut(userScore, pcScore, cout);
                }
                userScore += userInput;
                getScore(userScore, pcScore, cout, isBatting);
            }
        }
    }

    public static void bowl(int userScore, int pcScore, int cout) {
        cout += 1;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int cond = 1, pcInput = 0, isBatting = 0;
        System.out.println("You are bowling");
        againBowl: while (cond == 1) {
            System.out.println("Enter number within 0-6");
            int userInput = sc.nextInt();
            if (InputCheck(userInput, 6)) {
                cout -= 1;
                continue againBowl;
            } else {
                pcInput = rand.nextInt(7);
                System.out.println("Computer chose " + pcInput + "\n");
                if (userInput == pcInput) {
                    cond = 0;
                    getScore(userScore, pcScore, cout, isBatting);
                    pcOut(userScore, pcScore, cout);
                }
                pcScore += pcInput;
                getScore(userScore, pcScore, cout, isBatting);
            }
        }
    }

    public static void userOut(int userScore, int pcScore, int cout) {
        if (cout == 2) {
            Scanner sc = new Scanner(System.in);
            System.out.println(userScore > pcScore ? "You win!" : userScore == pcScore ? "It's a tie!" : "You lose!");
            System.out.println("Would you like to play again?(0(to exit) or 1(to play))");
            int userPlay = sc.nextInt();
            if (InputCheck(userPlay, 1)) {
                pcOut(userScore, pcScore, cout);
            } else {
                if (userPlay == 1) {
                    Main.main(null);
                } else if (userPlay == 0) {
                    System.out.println("\n\nThank you for playing Hand Cricket with us");
                    System.exit(0);
                }
            }
        }
        System.out.println("You are Out!\n");
        bowl(userScore, pcScore, cout);
    }

    public static void pcOut(int userScore, int pcScore, int cout) {
        if (cout == 2) {
            Scanner sc = new Scanner(System.in);
            System.out.println(userScore > pcScore ? "You win!" : userScore == pcScore ? "It's a tie!" : "You lose!");
            System.out.println("Would you like to play again?(0(to exit) or 1(to play))");
            int userPlay = sc.nextInt();
            if (InputCheck(userPlay, 1)) {
                pcOut(userScore, pcScore, cout);
            } else {
                if (userPlay == 1) {
                    Main.main(null);
                } else if (userPlay == 0) {
                    System.out.println("\n\nThank you for playing Hand Cricket with us");
                    System.exit(0);
                }
            }
        }
        System.out.println("Computer is Out! \nScore more than " + pcScore + " to win!\n");
        bat(userScore, pcScore, cout);
    }

    public static void getScore(int userScore, int pcScore, int cout, int isBatting) {
        System.out.println("Your score is " + userScore + "\nComputer's score is " + pcScore + "\n");
        if ((cout == 2) && (isBatting == 1)) {
            if (userScore > pcScore) {
                pcOut(userScore, pcScore, cout);
            }
        } else if ((cout == 2) && (isBatting == 0)) {
            if (pcScore > userScore) {
                userOut(userScore, pcScore, cout);
            }
        }
    }

}

public class HandCricketGame {

    public static void main(String args[]) {
        System.out.println("\tWelcome to the game of Hand Cricket!\n\n");
        int win = User.toss();
        if (win == 1) {
            User.bat(0, 0, 0);
        } else {
            User.bowl(0, 0, 0);
        }
    }
}