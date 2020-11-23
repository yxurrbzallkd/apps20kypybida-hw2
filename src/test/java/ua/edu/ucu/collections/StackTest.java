package ua.edu.ucu.collections;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void testPeek() {
        Stack s = new Stack();
        assertEquals(s.peek(), null);
        s.push(7);
        s.push(5);
        assertEquals(s.peek(), 5);
    }

    @Test
    public void testPop() {
        Stack s = new Stack();
        s.push(7);
        s.push(5);
        assertEquals(s.pop(), 5);
        assertEquals(s.pop(), 7);
        assertEquals(s.pop(), null);
    }

	@Test
    public void testPush() {
        Stack s = new Stack();
        s.push(7);
        assertEquals(s.peek(), 7);
        s.push(5);
        assertEquals(s.peek(), 5);
    }

    @Test
    public void testtoString() {
        Stack s = new Stack();
        s.push(7);
        s.push(5);
        s.push(2);
        assertEquals(s.toString(), "Stack [7, 5, 2] < TOP");
    }
}
