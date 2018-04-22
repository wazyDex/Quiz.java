package com.company;

import java.util.Currency;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int score = 0;
        int questionsRight = 0;
        int questionsWrong = 0;

        System.out.println("Welcome to the Quiz!");

        try {
            Thread.sleep(2000);

        } catch (InterruptedException ex) {

        }
        System.out.println("Would you like to take the quiz yes or no?");
        Scanner scanner = new Scanner(System.in);
        String takeQuiz = scanner.nextLine();
        // Probaly should be using a boolean for this

        if (takeQuiz.equalsIgnoreCase("yes")) {
            System.out.println("Before we get started lets get your name");
        } else {
            System.out.println("Goodbye then");
            System.exit(0);
        }

        Scanner scanner1 = new Scanner(System.in);
        String name = scanner.nextLine();

        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {

        }
        System.out.println("Nice to meet you " + name);
        System.out.println("The quiz we have for you today is on Dogs");
        try {
            Thread.sleep(2000);

        } catch (InterruptedException ex) {
        }

        System.out.println("First Question......");
        System.out.println("How many legs does a dog have");
        System.out.println("One");
        System.out.println("Two");
        System.out.println("Four");
        Scanner scanner2 = new Scanner(System.in);
        String questionOneAns = scanner.nextLine();

        if (questionOneAns.equalsIgnoreCase("four")) {
            score++;
            questionsRight++;
            System.out.println("Correct");
            System.out.println("Current Score is " + score);
            System.out.println("Questions answered correctly is " + questionsRight);
            System.out.println("Questions answered wrong is " + questionsWrong);
        } else {
            questionsWrong++;
            System.out.print("Wrong");
            System.out.println("Current Score is " + score);
            System.out.println("Questions answered correctly is " + questionsRight);
            System.out.println("Questions answered wrong is " + questionsWrong);
        }

        System.out.println("Next Question.....");
        System.out.println("What is the best dog");
        System.out.println("Golden");
        System.out.println("Yorki");
        System.out.println("Lab");
        Scanner scanner3 = new Scanner(System.in);
        String questionTwoAns = scanner.nextLine();

        if (questionTwoAns.equalsIgnoreCase("golden")) {
            score++;
            questionsRight++;
            System.out.println("Correct");
            System.out.println("Current Score is " + score);
            System.out.println("Questions answered correctly is " + questionsRight);
            System.out.println("Questions answered wrong is " + questionsWrong);
        } else {
            questionsWrong++;
            System.out.println("Wrong");
            System.out.println("Current Score is " + score);
            System.out.println("Questions answered correctly is " + questionsRight);
            System.out.println("Questions answered wrong is " + questionsWrong);
        }

        System.out.println("Final Question......");
        System.out.println("What do dogs eat?");
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {

        }
        System.out.println("Lettuce");
        System.out.println("Grass");
        System.out.println("Kibble");
        Scanner scanner4 = new Scanner(System.in);
        String questionThreeAns = scanner.nextLine();

        if (questionThreeAns.equalsIgnoreCase("kibble")) {
            score++;
            questionsRight++;
            System.out.println("Correct");
            System.out.println("Current Score is " + score);
            System.out.println("Questions answered correctly is " + questionsRight);
            System.out.println("Questions answered wrong is " + questionsWrong);
        } else {
            questionsWrong++;
            System.out.println("Wrong");
            System.out.println("Current Score is " + score);
            System.out.println("Questions answered correctly is " + questionsRight);
            System.out.println("Questions answered wrong is " + questionsWrong);
        }

        System.out.println("The quiz is over");
        if (score == 3) {
            System.out.println("Congrats you got perfect on the quiz");
        }
        if (score == 2) {
            System.out.println("You scored 2/3 on the quiz good job");
        } else {
            System.out.println("You did terrible");
        }


    }
}



