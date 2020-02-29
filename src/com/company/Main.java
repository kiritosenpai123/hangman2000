package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 for singleplayer and 2 for multiplayer");
        int choice = input.nextInt();
        if (choice == 1) {
            singleplayer(choice);
        } else if (choice == 2) {
            multiplayer();
        }

    }


    public static void singleplayer(int choice) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        String[] cities = {"Асеновград", "Добрич", "Ловеч", "Пловдив", "София", "Варна", "Бургас", "Казанлък", "Сливен"};

        String word = cities[r.nextInt(cities.length)];
        int count = word.length();
        char[] CharrArr = word.toCharArray();
        char[] dash = word.toCharArray();

        for (int i = 0; i < dash.length; i++) {
            dash[i] = '_';
            System.out.print(dash[i] + " ");
        }

        for (int i = 1; i <= 11; i++) {
            System.out.println("Try to guess a letter! ");
            char letter = input.next().charAt(0);



            for (int j = 0; j < CharrArr.length; j++) {


                    if (letter == CharrArr[j]) {
                        dash[j] = letter;
                        i--;
                        System.out.println("Correct guess!");
                        System.out.println();
                    }
                }

            System.out.println(dash);
            switch (i) {
                case 1:
                    System.out.println();
                    System.out.println();
                    System.out.println("|");
                    break;
                case 2:
                    System.out.println();
                    System.out.println("|");
                    System.out.println("|");
                    break;
                case 3:
                    System.out.println();
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    break;
                case 4:
                    System.out.println();
                    System.out.println(" __");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    break;
                case 5:
                    System.out.println();
                    System.out.println(" ___");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    break;
                case 6:
                    System.out.println();
                    System.out.println(" ___");
                    System.out.println("|   |");
                    System.out.println("|");
                    System.out.println("|");
                    break;
                case 7:
                    System.out.println();
                    System.out.println(" ___");
                    System.out.println("|   |");
                    System.out.println("|   O");
                    System.out.println("|");
                    break;
                case 8:
                    System.out.println(" ___");
                    System.out.println("|    O");
                    System.out.println("|    | ");
                    System.out.println("|   ");
                    break;
                case 9:
                    System.out.println(" ___");
                    System.out.println("|   O");
                    System.out.println("|  \\|/");
                    System.out.println("|  ");
                    break;
                case 10:
                    System.out.println(" ___");
                    System.out.println("|   |");
                    System.out.println("|   O");
                    System.out.println("|  \\|/");
                    System.out.println("   / \\");
                    System.out.println("YOU'RE HANGED");
                    break;
            }
            System.out.print(" ");

            if ((new String(word)).equals(new String(dash))) {
                System.out.println("Congratulations! YOU WIN!");
                break;
            }

        }

    }

    public static void multiplayer() {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Welcome to hangman for 2 people with bulgarian cities written in BULGARIAN language");
        System.out.println("First player, enter your name please!");
        String firstPlayerName = input.nextLine();
        System.out.println("And now the second player, too!");
        String secondPlayerName = input.nextLine();

        String[] players = {"Player 1", "Player 2"};
        String[] cities = {"Благоевград", "Кюстендил", "Шумен", "Козлодуй", "Враца", "Плевен"};
        String word = cities[r.nextInt(cities.length)];
        int count = word.length();
        char[] CharrArr = word.toCharArray();
        char[] dash = word.toCharArray();
        for (int i = 0; i < dash.length; i++) {
            dash[i] = '_';
            System.out.print(dash[i] + " ");
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("Try to guess a letter! ");
            char letter = input.next().charAt(0);

            for (int j = 0; j < CharrArr.length; j++) {
                if (letter == CharrArr[j]) {
                    dash[j] = letter;
                    i--;
                    System.out.println("Correct guess!");
                    System.out.println();
                }
            }
            System.out.println(dash);

            switch (i) {
                case 1:
                    System.out.println("Looks like there's no such letter in this word, next player's turn now");
                    System.out.println();
                    System.out.println("|");
                    break;
                case 2:
                    System.out.println("Looks like there's no such letter in this word, next player's turn now");
                    System.out.println();
                    System.out.println("|");
                    System.out.println("|");
                    break;
                case 3:
                    System.out.println("Looks like there's no such letter in this word, next player's turn now");
                    System.out.println();
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    break;
                case 4:
                    System.out.println("Looks like there's no such letter in this word, next player's turn now");
                    System.out.println();
                    System.out.println(" __");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    break;

                case 5:
                    System.out.println("Looks like there's no such letter in this word, next player's turn now");
                    System.out.println();
                    System.out.println(" ___");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    break;
                case 6:
                    System.out.println("Looks like there's no such letter in this word, next player's turn now");
                    System.out.println();
                    System.out.println(" ___");
                    System.out.println("|   |");
                    System.out.println("|");
                    System.out.println("|");
                    break;
                case 7:
                    System.out.println("Looks like there's no such letter in this word, next player's turn now");
                    System.out.println();
                    System.out.println(" ___");
                    System.out.println("|   |");
                    System.out.println("|   O");
                    System.out.println("|");
                    break;
                case 8:
                    System.out.println("Looks like there's no such letter in this word, next player's turn now");
                    System.out.println(" ___");
                    System.out.println("|    O");
                    System.out.println("|    | ");
                    System.out.println("|   ");
                    break;
                case 9:
                    System.out.println("Looks like there's no such letter in this word, next player's turn now");
                    System.out.println(" ___");
                    System.out.println("|   O");
                    System.out.println("|  \\|/");
                    System.out.println("|  ");
                    break;
                case 10:
                    System.out.println("Looks like there's no such letter in this word, next player's turn now");
                    System.out.println(" ___");
                    System.out.println("|   |");
                    System.out.println("|   O");
                    System.out.println("|  \\|/");
                    System.out.println("   / \\");
                    System.out.println("YOU'RE HANGED");
                    break;
                case 11:
                    System.out.println("Nobody gets points in this round");
            }
            System.out.print(" ");

            if ((new String(word)).equals(new String(dash))) {
                System.out.println("Congratulations! You are the winner!");
                break;
            }

        }
    }
}
