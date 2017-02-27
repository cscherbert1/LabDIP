package dip.lab3.student.solution1;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author cscherbert1
 */
public class RandomQuoteInput implements MessageInput {

    private ArrayList<String> someWisdomQuotes = new ArrayList<>();

    public RandomQuoteInput() {
        populateWisdom();
    }

    private final void populateWisdom() {
        someWisdomQuotes.add("Work hard. Dream big.");
        someWisdomQuotes.add("Whatever you are, be a good one.");
        someWisdomQuotes.add("Be the change you wish to see in the world.");
        someWisdomQuotes.add("Life is like riding a bicycle. To keep your balance you must keep moving.");
    }

    public final String selectRandomQuote() {
        Random randNum = new Random();
        int n = randNum.nextInt(someWisdomQuotes.size());
        String randomQuote = someWisdomQuotes.get(n);
        return randomQuote;


    }

    @Override
    public final String readMessage() {
        String message = selectRandomQuote();
        return message;
    }

}
