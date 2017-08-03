package models;

import java.util.*;


/**
 * Created by Guest on 8/3/17.
 */
public class Adventure2 {

    public int timer;
    public int userInput;
    public int value;
    public int newTurnLeft;
    public int turnLeft;

    public int getUserInput(int userInput) {

     switch(userInput) {
         case 1: value =  1;
                 System.out.println(value);
                 break;
         case 2: value =  2;
                 System.out.println(value);
                 break;
         default:
             System.out.println("1 or 2 are your only options! TRY AGAIN ");
     }
     return value;
    }

    public int countDown(int value, int turnLeft) {
        newTurnLeft = turnLeft - value;
        return newTurnLeft;
    }

    public String endGame(int countDownValue) {
        if (countDownValue < 0) {
            String loser = "Out of moves!";
//            System.out.println(loser + " " + countDownValue);
            return loser;
        } else {
            String winner = "You win!";
//            System.out.println(winner + " " + countDownValue);
            return winner;
        }
    }

//    public int getPlayerChoice(int choice) {
//    }

}
