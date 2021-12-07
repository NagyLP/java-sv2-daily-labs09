package day02;

import java.util.ArrayList;
import java.util.List;

public class StringList {

    public List<String> shortestWord(List<String> word) {
        List<String> sWordSolution = new ArrayList<>();
        for (String item : word) {
            if (item.length() < word.get(0).length()) {
                sWordSolution.add(item);
            }

        }
        return sWordSolution;
    }
}
