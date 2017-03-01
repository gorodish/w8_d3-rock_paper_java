package example.codeclan.com.rockpaper;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 01/03/2017.
 */

public class GameTest {

    Game game;

    @Before
    public void before() {
        game = new Game();
    }

    @Test
    public void testCanWin() {
        assertEquals("Rock wins", game.checkWin(RPSnames.ROCK, RPSnames.SCISSORS));
    }

}
