import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;

class StringLengthEvenChecker implements StringChecker {
    public boolean checkString(String s) {
        if(s.length() % 2 == 0) return true;
        return false;
    }
}

public class ListTests {
    StringLengthEvenChecker evenChecker = new StringLengthEvenChecker();

    @Test 
        public void testFilter() {
        ArrayList<String> input1 = new ArrayList<>();
        input1.add("even");
        input1.add("odd");

        ArrayList<String> output = new ArrayList<>();
        output.add("even");
        assertEquals(output, ListExamples.filter(input1, evenChecker));
    }

    @Test 
        public void testFilter2() {
        ArrayList<String> input1 = new ArrayList<>();
        input1.add("even");
        input1.add("odd");
        input1.add("noteven");
        input1.add("iseven");

        ArrayList<String> output = new ArrayList<>();
        output.add("even");
        output.add("iseven");
        assertEquals(output, ListExamples.filter(input1, evenChecker));
    }
}
