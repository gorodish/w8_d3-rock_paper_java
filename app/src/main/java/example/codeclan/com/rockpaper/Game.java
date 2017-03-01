package example.codeclan.com.rockpaper;

/**
 * Created by user on 01/03/2017.
 */

public class Game {

    public String checkWin(RPSnames hand1, RPSnames hand2) {

        if(hand1 == hand2) {
            return "Draw";
        }

        if(hand1.equals(RPSnames.ROCK) && hand2.equals(RPSnames.SCISSORS)) {
            return "Rock wins";
        }
        if(hand1.equals(RPSnames.ROCK) && hand2.equals(RPSnames.PAPER)) {
            return "Paper wins";
        }
        if(hand1.equals(RPSnames.PAPER) && hand2.equals(RPSnames.SCISSORS)) {
            return "Scissors win";
        }
        if(hand1.equals(RPSnames.PAPER) && hand2.equals(RPSnames.ROCK)) {
            return "Paper wins";
        }
        if(hand1.equals(RPSnames.SCISSORS) && hand2.equals(RPSnames.PAPER)) {
            return "Scissors win";
        }
        if(hand1.equals(RPSnames.SCISSORS) && hand2.equals(RPSnames.ROCK)) {
            return "Rock wins";
        }
        return null;
    }
}