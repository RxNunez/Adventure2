package models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Guest on 8/3/17.
 */

    public class App {
        public static void main(String[] args) {
            int choice;
            int timer = 0;
            int defaultTimer = 4;
            int value;
            System.out.println("Welcome to our Adventure!");
            System.out.println("What is your name?");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            Adventure2 newAdventure2 = new Adventure2();
            String[] questions = {"What do you do? Press 1 to go East or Press 2 to go West?", "Do you want to eat at a food truck? Press 1 for Mexican or Press 2 for Indian."};

            try {
                String playerName = bufferedReader.readLine();
                System.out.println("What the HECK," + playerName + "! Let's go eat NOW!");
                System.out.println("Don't you like the food trucks?");

                for (String individualEntry : questions) {
                    System.out.println(individualEntry);
                    choice = Integer.parseInt(bufferedReader.readLine());
                    choice = checkValidChoice(choice);
                    value = newAdventure2.getUserInput(choice);
                    timer = newAdventure2.countDown(value, defaultTimer);
                    defaultTimer=(timer);

                }
                newAdventure2.endGame(timer);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static int checkValidChoice(int choice) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            while (choice != 1 && choice != 2) {
                System.out.println("Please select a valid choice.");
                try {
                    choice = Integer.parseInt(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return choice;
        }
    }

