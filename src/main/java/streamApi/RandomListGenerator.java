package streamApi;

import java.util.ArrayList;
import java.util.List;

public class RandomListGenerator {
    public static List<String> getGeneratedValuesList(Integer elementsAmount) {
        List<String> outputListValues = new ArrayList<>();
        for (int i = 0; i <= elementsAmount; i++) {
                if (i % 2 == 0) {
                    outputListValues.add("banana");
                } else {
                    outputListValues.add("goes");
                }
        }
        System.out.println(outputListValues);
        return outputListValues;
    }
}


