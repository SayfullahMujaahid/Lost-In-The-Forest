package org.example;

import java.util.Scanner;

public class LostInTheForest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Lost in the Forest!");
        System.out.println("You find yourself in the middle of a dense forest. Your goal is to find your way out.");

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1. Go left");
            System.out.println("2. Go right");
            System.out.println("3. Go straight");
            System.out.println("4. Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You chose to go left.");
                    exploreLeft();
                    break;
                case 2:
                    System.out.println("You chose to go right.");
                    exploreRight();
                    break;
                case 3:
                    System.out.println("You chose to go straight.");
                    exploreStraight();
                    break;
                case 4:
                    System.out.println("Thanks for playing! Goodbye.");
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }

    public static void exploreLeft() {
        System.out.println("You venture into a dark cave.");
        System.out.println("It's too dark to see anything.");
        System.out.println("You feel a sense of dread and decide to turn back.");
    }

    public static void exploreRight() {
        System.out.println("You encounter a river blocking your path.");
        System.out.println("There's no bridge in sight.");
        System.out.println("You decide to follow the riverbank in search of a crossing.");

        System.out.println("As you walk along the riverbank, you spot a narrow bridge ahead.");
        System.out.println("Do you want to attempt to cross the bridge? (yes/no)");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("You cautiously step onto the bridge and make it safely to the other side.");
            System.out.println("Congratulations! You've successfully crossed the river.");
        } else {
            System.out.println("You decide not to risk crossing the bridge and continue exploring.");
        }
    }

    public static void exploreStraight() {
        System.out.println("You walk through dense undergrowth.");
        System.out.println("You stumble upon an old, abandoned cabin.");
        System.out.println("Do you want to enter the cabin? (yes/no)");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("You cautiously enter the cabin.");
            System.out.println("Inside, you find an antique rotary dial phone which surprisingly works.");
            System.out.println("You call for help and are rescued!");
            System.out.println("Congratulations! You've found your way out of the forest. You win!");
            System.exit(0);
        } else {
            System.out.println("You decide not to enter the cabin and continue exploring.");
        }
    }
}