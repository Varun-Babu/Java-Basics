package BasicsOfJava;

import java.util.Scanner;

public class DecisionStatements {
    public static void main(String[] args) {
        // Get user age
        System.out.println("Enter your age");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        //check condition to vote
        if (age >= 18) {
            System.out.println("CAN VOTE");
        } else {
            System.out.println("CANNOT VOTE");
        }

        //Determine the letter grade
        char grade;

        // Get the score
        System.out.println("Enter your marks");
        int score = input.nextInt();

        //check condition using if else if statement
        if (score < 60) {
            grade = 'F';
        } else if (score < 70) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        //Print the result
        System.out.println("Your grade is " + grade);

        //Switch statements to check vowel or a consonant

        //Get value from user
        System.out.println("Enter a single letter to check if vowel or not");
        char letter = input.next().charAt(0);
        input.close();
        //Switch statements
        switch (Character.toLowerCase(letter)) {  //to lowercase the users input
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Is a vowel");
                break;
            default:
                System.out.println("Not a vowel");
        }

        //Enhanced switch
        switch (Character.toLowerCase(letter)) {  //to lowercase the users input
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Is a vowel using enhanced switch");
            default -> System.out.println("Not a vowel using enhanced switch");
        }

        //Switch expression
        String message = switch (grade) {
            case 'A' -> "Excellent";
            case 'B' -> "Great Job";
            case 'C' -> "Good job";
            case 'D' -> "Work harder";
            case 'F' -> "Uh oh";
            default -> "Invalid grade";
        };
        System.out.println("Message for your grade " + message);
    }
}
