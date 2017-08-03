package models;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Guest on 8/3/17.
 */
public class Adventure2Test {

    @Test
    public void getUserInput_whenInputIs1_1 () {
        Adventure2 testAdventure = new Adventure2();
        assertEquals(1, testAdventure.getUserInput(1));
    }
    @Test
    public void getUserInput_whenInputIs2_2 () {
        Adventure2 testAdventure = new Adventure2();
        assertEquals(2, testAdventure.getUserInput(2));
    }
    @Test
    public void countDown_subtractTurn_9 () {
        Adventure2 testAdventure = new Adventure2();
        assertEquals(9, testAdventure.countDown(1,10));
    }
    @Test
    public void countDown_subtractTurn_7 () {
        Adventure2 testAdventure = new Adventure2();
        assertEquals(7, testAdventure.countDown(3,10));
    }

    @Test
    public void endGame_whenLose_loser () {
        Adventure2 testAdventure = new Adventure2();
        assertEquals("Out of moves!", testAdventure.endGame(-1));
    }

    @Test
    public void endGame_whenWinner_winner () {
        Adventure2 testAdventure = new Adventure2();
        assertEquals("You win!", testAdventure.endGame(0));
    }

}