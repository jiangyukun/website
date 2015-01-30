package base.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Created by jiangyukun on 2015/1/30.
 */
public class StreamTest {
    @Test
    public void testListStream() {
        List<String> stringLists = new ArrayList<>();
        stringLists.add("a");
        stringLists.add("b");
        Optional<String> r = stringLists.stream().filter(string -> string.length() == 1).findFirst();
        assertEquals(r.get(), "a");
    }
}
