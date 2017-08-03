package models;

/**
 * Created by Guest on 8/3/17.
 */
public class Adventure2 {

    public int timer;
    private int userInput;
    private int value;
    private int newTimerValue;
    private int timerValue;

    public int getUserInput(int userInput) {

     switch(userInput) {
         case 1: value = 1;
                 System.out.println(value);
                 break;
         case 2: value = 2;
                 System.out.println(value);
                 break;
         default:
             System.out.println("1 or 2 are your only options! TRY AGAIN ");
     }
     return value;
    }
}
