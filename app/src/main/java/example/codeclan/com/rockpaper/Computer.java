package example.codeclan.com.rockpaper;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 01/03/2017.
 */

public class Computer {

    protected ArrayList<String> choices;

    public Computer() {
        choices = new ArrayList<String >();
        getMove();
    }

    public Computer(ArrayList<String> choices){
        this.choices = choices;

    public String getMove() {
        Random rand = new Random();
        int listSize = getLength();
        int index = rand.nextInt(listSize);
        String choice = getChoiceAtIndex(index);
        return choice;

    }

    public int getLength() {
        return choices.size();
    }

    public String getChoiceAtIndex(int index) {
        return choices.get(index);
    }
}

