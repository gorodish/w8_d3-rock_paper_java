package example.codeclan.com.rockpaper;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 01/03/2017.
 */

public class Computer {

    protected ArrayList<String> RPSnames;

    public Computer() {
        RPSnames = new ArrayList<String >();
        getMove();
    }

    public Computer(ArrayList<String> RPSnames) {
        this.RPSnames = RPSnames;
    }

    public String getMove() {
        Random rand = new Random();
        int listSize = getLength();
        int index = rand.nextInt(listSize);
        String choice = getChoiceAtIndex(index);
        return choice;

    }

    public int getLength() {
        return RPSnames.size();
    }

    public String getChoiceAtIndex(int index) {
        return RPSnames.get(index);
    }

    public boolean checkChoice(RPSnames ROCK, RPSnames SCISSORS) {
        return true;
    }
}

