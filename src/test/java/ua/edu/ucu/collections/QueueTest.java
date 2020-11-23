package ua.edu.ucu.collections;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void testPeek() {
        Queue q = new Queue();
        assertEquals(q.peek(), null);
        q.enqueue(7);
        q.enqueue(5);
        assertEquals(q.peek(), 7);
    }

    @Test
    public void testDequeue() {
        Queue q = new Queue();
        q.enqueue(7);
        q.enqueue(5);
        assertEquals(q.dequeue(), 7);
        assertEquals(q.dequeue(), 5);
        assertEquals(q.dequeue(), null);
    }

	@Test
    public void testEnqueue() {
        Queue q = new Queue();
        q.enqueue(7);
        assertEquals(q.peek(), 7);
        q.enqueue(5);
        assertEquals(q.peek(), 7);
    }
}
