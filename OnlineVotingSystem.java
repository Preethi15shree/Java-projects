import java.util.Scanner;

public class OnlineVotingSystem {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Initialize variables to keep track of the vote count
        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;
        int candidate4Votes = 0; 

        // Get the user's name
        System.out.print("Please enter your name: ");
        String userName = input.nextLine();

        // Get the user's age
        System.out.print("Please enter your age: ");
        int userAge = input.nextInt();

        // Check if the user is eligible to vote
        if (userAge >= 18) {
            // Present the user with a list of candidates to vote for
            System.out.println("Please select a candidate to vote for:");
            System.out.println("1. Candidate 1");
            System.out.println("2. Candidate 2");
            System.out.println("2. Candidate 3");
            System.out.println("2. Candidate 4");

            // Get the user's selection
            int userSelection = input.nextInt();

            // Increment the vote count for the selected candidate
            if (userSelection == 1) {
                candidate1Votes++;
            } else if (userSelection == 2) {
                candidate2Votes++;
            } else if (userSelection == 3) {
                candidate3Votes++;
            } else if (userSelection == 4) {
                candidate4Votes++;
            }

            // Display a confirmation message to the user
            System.out.println("Thank you for voting, " + userName + "!");
        } else {
            // Display a message to the user if they are not eligible to vote
            System.out.println("I'm sorry, you are not eligible to vote.");
        }

        // Display the final vote count
        System.out.println("Candidate 1: " + candidate1Votes + " votes");
        System.out.println("Candidate 2: " + candidate2Votes + " votes");
        System.out.println("Candidate 3: " + candidate3Votes + " votes");
        System.out.println("Candidate 4: " + candidate4Votes + " votes");
    }
}