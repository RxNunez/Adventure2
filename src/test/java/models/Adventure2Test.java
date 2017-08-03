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

}