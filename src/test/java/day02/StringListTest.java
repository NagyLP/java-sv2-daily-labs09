package day02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringListTest {

    List<String> actualTest = new ArrayList<>(Arrays.asList("Béla", "sdfa", "12", "és", "Sokaság"));
    List<String> exeptedTest = new ArrayList<>(Arrays.asList("12", "és"));

    @Test
    void shortestWord() {
        assertEquals( exeptedTest,new StringList().shortestWord(actualTest));
    }
}