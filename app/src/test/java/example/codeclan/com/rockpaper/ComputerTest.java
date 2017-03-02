package example.codeclan.com.rockpaper;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 01/03/2017.
 */

public class ComputerTest {

    Computer computer;

    @Before
    public void before() {
        computer = new Computer();
    }

    @Test
    public void testCanPlay() {
        assertEquals("Rock wins", computer.checkChoice(RPSnames.ROCK, RPSnames.SCISSORS));
    }

}
