package day02;

import java.util.ArrayList;
import java.util.List;

public class StringList {

    public List<String> shortestWord(List<String> word) {
        List<String> sWordSolution = new ArrayList<>();
        int minLenght = word.get(0).length();
        for (String item : word) {
            if (item.length() < minLenght) {
                minLenght = item.length();
                sWordSolution.clear();
            }
            if (item.length() == minLenght)
                sWordSolution.add(item);
        }
        return sWordSolution;
    }

    public StringList() {
    }
}
