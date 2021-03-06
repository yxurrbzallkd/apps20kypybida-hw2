package ua.edu.ucu.collections.immutable;

import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableLinkedListTest {
      
    @Test
    public void testCreateEmpty() {
        ImmutableLinkedList arr = new ImmutableLinkedList();
        AssertEqual(arr.size(), 0);
        AssertEqual(arr.isEmpty(), true);
    }

    @Test
    public void testAdd() {
        ImmutableLinkedList arr = new ImmutableLinkedList();
        ImmutableLinkedList arr1 = arr.add(9);
        AssertEqual(arr.Empty(), true);
        AssertEqual(arr1.toArray(), new Object[] {9});
    }

    @Test
    public void testAddAt() {
        ImmutableLinkedList arr = new ImmutableLinkedList(new Object[] {5, 6, 9, 0});
        ImmutableLinkedList arr1 = arr.add(2, 7);
        AssertEqual(arr1.get(2), 7);
        AssertEqual(arr.get(2), 9);
    }

    @Test
    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddAtOutOfBounds() {
        ImmutableLinkedList arr = new ImmutableLinkedList(new Object[] {5, 6, 9, 0});
        arr.add(9, 2);
    }

    @Test
    public void testAddAll() {
        Object[] obj = {3, 4, 5};
        ImmutableLinkedList arr = new ImmutableLinkedList();
        ImmutableLinkedList arr1 = arr.addAll(obj);
        AssertEqual(arr.Empty(), true);
        AssertEqual(arr1.toArray(), obj);
    }

    @Test
    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddAllAt() {
        Object[] obj = {3, 4, 5};
        ImmutableLinkedList arr = new ImmutableLinkedList(new Object[] {1, 2});
        arr.addAll(3, obj);
    }

    @Test
    public void testGet() {
        ImmutableLinkedList arr = new ImmutableLinkedList(new Object[] {3, 4, 5});
        AssertEqual(arr.get(0), 3);
        AssertEqual(arr.get(2), 5);
    }

    @Test
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBounds() {
        ImmutableLinkedList arr = new ImmutableLinkedList(new Object[] {3, 4, 5});
        arr.get(3);
    }

    @Test
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBoundsNeggative() {
        ImmutableLinkedList arr = new ImmutableLinkedList(new Object[] {3, 4, 5});
        arr.get(-5);
    }

    @Test
    public void testRemove() {
        ImmutableLinkedList arr = new ImmutableLinkedList(new Objcet[] {3, 4, 5});
        arr.remove(0);
        AssertEqual(arr.toArray(), new Object[] {4, 5});
    }

    @Test
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveOutOfBounds() {
        ImmutableLinkedList arr = new ImmutableLinkedList(new Object[] {3, 4, 5});
        arr.remove(6);
    }

    @Test
    public void testSet() {
        Object[] obj = {3, 4, 5};
        ImmutableLinkedList arr = new ImmutableLinkedList();
        ImmutableLinkedList arr1 = arr.set(0, 8);
        AssertEqual(arr.toArray(), obj);
        AssertEqual(arr1.get(0), 8);
    }

    @Test
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetOutOfBounds() {
        ImmutableLinkedList arr = new ImmutableLinkedList(new Object[] {3, 4, 5});
        arr.set(3, 7);
    }

    @Test
    public void testIndexOf() {
        Object[] obj = {3, 4, 5};
        ImmutableLinkedList arr = new ImmutableLinkedList();
        AssertEqual(arr.indexOf(4), 1);
        AssertEqual(arr.indexOf(8), -1);
    }

    @Test
    public void testSize() {
        Object[] obj = {3, 4, 5};
        ImmutableLinkedList arr = new ImmutableLinkedList();
        ImmutableLinkedList arr1 = arr.addAll(obj);
        AssertEqual(arr.size(), 0);
        AssertEqual(arr1.size(), obj.length);
    }

    @Test
    public void testClear() {
        Object[] obj = {3, 4, 5};
        ImmutableLinkedList arr = new ImmutableLinkedList(obj);
        ImmutableLinkedList arr1 = arr.clear();
        AssertEqual(arr.size(), obj.length);
        AssertEqual(arr1.size(), 0);
    }

    @Test
    public void testIsEmpty() {
        Object[] obj = {3, 4, 5};
        ImmutableLinkedList arr = new ImmutableLinkedList(obj);
        ImmutableLinkedList arr1 = arr.clear();
        ImmutableLinkedList arr2 = new ImmutableLinkedList();
        AssertEqual(arr.isEmpty(), false);
        AssertEqual(arr1.isEmpty(), true);
        AssertEqual(arr2.isEmpty(), true);
    }

    @Test
    public void testAddFirst() {
		ImmutableLinkedList arr;
		ImmutableLinkedList arr1;
        arr = new ImmutableLinkedList();
        arr1 = arr.addFirst(9);
        arr1 = arr1.addFirst(1);
        AssertEqual(arr.Empty(), true);
        AssertEqual(arr1.toArray(), new Object[] {1, 9});
	}

	@Test
    public void testAddLast() {
		ImmutableLinkedList arr;
		ImmutableLinkedList arr1;
        arr = new ImmutableLinkedList();
        arr1 = arr.addLast(9);
        arr1 = arr1.addLast(6);
        AssertEqual(arr.Empty(), true);
        AssertEqual(arr1.toArray(), new Object[] {9, 6});
	}

	@Test
    public void testGetFirst() {
		ImmutableLinkedList arr;
		ImmutableLinkedList arr1;
        arr = new ImmutableLinkedList();
        arr1 = arr.addAll(new Object[] {1, 2, 3, 4, 5});
        AssertEqual(arr.Empty(), true);
        AssertEqual(arr1.getFirst(), 1);
	}

    @Test
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFirstOutOfBounds() {
		ImmutableLinkedList arr;
        arr = new ImmutableLinkedList();
        arr.getFirst();
    }

	@Test
    public void testGetLast() {
		ImmutableLinkedList arr;
		ImmutableLinkedList arr1;
        arr = new ImmutableLinkedList();
        arr1 = arr.addAll(new Object[] {1, 2, 3, 4, 5});
        AssertEqual(arr.Empty(), true);
        AssertEqual(arr1.getLast(), 5);
	}

    @Test
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetLastOutOfBounds() {
		ImmutableLinkedList arr;
        arr = new ImmutableLinkedList();
        arr.getLast();
    }

	@Test
    public void testRemoveFirst() {
		ImmutableLinkedList arr;
		ImmutableLinkedList arr1;
        arr = new ImmutableLinkedList();
        arr = arr.addAll(new Object[] {1, 2});
        arr1 = arr.removeFirst();
        AssertEqual(arr1.getFirst(), 2);
	}

    @Test
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveFirstOutOfBounds() {
		ImmutableLinkedList arr;
        arr = new ImmutableLinkedList();
        arr.removeFirst();
    }

	@Test
    public void testRemoveLast() {
		ImmutableLinkedList arr;
		ImmutableLinkedList arr1;
        arr = new ImmutableLinkedList();
        arr = arr.addAll(new Object[] {1, 2});
        arr1 = arr.removeLast();
        AssertEqual(arr1.getLast(), 1);
	}

    @Test
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveLastOutOfBounds() {
		ImmutableLinkedList arr;
        arr = new ImmutableLinkedList();
        arr.removeLast();
    }
}
