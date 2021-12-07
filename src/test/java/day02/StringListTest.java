package day02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringListTest {

    List<String> stringList = new ArrayList<>(Arrays.asList("Béla", "sdfa", "Sokaság"));

    @Test
    void shortestWord() {
        assertEquals("sdfa", new StringList().shortestWord(stringList));
    }
}