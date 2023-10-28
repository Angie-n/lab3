import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    LinkedList list = new LinkedList();

    @Test 
        public void testFirst() {
            assertEquals(list.first(), null);
        }

    @Test 
        public void testLast() {
            assertEquals(list.last(), null);
        }

    @Test 
        public void testToString() {
            assertEquals(list.toString(), "");
        }
    
    @Test 
        public void testLength() {
            assertEquals(list.length(), 0);
        }

    @Test 
        public void testAppend() {
            list.append(1);
            assertEquals(list.first(), 1);
            assertEquals(list.last(), 1);
            assertEquals(list.toString(), "1 ");
            assertEquals(list.length(), 1);
        }
    
    @Test 
        public void testPrepend() {
            list.prepend(0);
            assertEquals(list.first(), 0);
            assertEquals(list.last(), 1);
            assertEquals(list.toString(), "0 1 ");
            assertEquals(list.length(), 2);
        }
}
