package ua.edu.ucu.collections.immutable;

import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableArrayListTest {
    
    @Test
    public void testCreateEmpty() {
        ImmutableArrayList arr = new ImmutableArrayList();
        AssertEqual(arr.size(), 0);
        AssertEqual(arr.isEmpty(), true);
    }

    @Test
    public void testCreateFromArray() {
        Object[] obj = {3, 4, 5};
        ImmutableArrayList arr = new ImmutableArrayList(obj);
        AssertEqual(arr.toArray(), obj);
    }

    @Test
    public void testAdd() {
        ImmutableArrayList arr = new ImmutableArrayList();
        ImmutableArrayList arr1 = arr.add(9);
        AssertEqual(arr.Empty(), true);
        AssertEqual(arr1.toArray(), new Object[] {9});
    }

    @Test
    public void testAddAt() {
        ImmutableArrayList arr = new ImmutableArrayList(new Object[] {5, 6, 9, 0});
        ImmutableArrayList arr1 = arr.add(2, 7);
        AssertEqual(arr1.get(2), 7);
        AssertEqual(arr.get(2), 9);
    }

    @Test
    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddAtOutOfBounds() {
        ImmutableArrayList arr = new ImmutableArrayList(new Object[] {5, 6, 9, 0});
        arr.add(9, 2);
    }

    @Test
    public void testAddAll() {
        Object[] obj = {3, 4, 5};
        ImmutableArrayList arr = new ImmutableArrayList();
        ImmutableArrayList arr1 = arr.addAll(obj);
        AssertEqual(arr.Empty(), true);
        AssertEqual(arr1.toArray(), obj);
    }

    @Test
    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddAllAt() {
        Object[] obj = {3, 4, 5};
        ImmutableArrayList arr = new ImmutableArrayList(new Object[] {1, 2});
        arr.addAll(3, obj);
    }

    @Test
    public void testGet() {
        ImmutableArrayList arr = new ImmutableArrayList(new Object[] {3, 4, 5});
        AssertEqual(arr.get(0), 3);
        AssertEqual(arr.get(2), 5);
    }

    @Test
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBounds() {
        ImmutableArrayList arr = new ImmutableArrayList(new Object[] {3, 4, 5});
        arr.get(3);
    }

    @Test
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBoundsNeggative() {
        ImmutableArrayList arr = new ImmutableArrayList(new Object[] {3, 4, 5});
        arr.get(-5);
    }

    @Test
    public void testRemove() {
        ImmutableArrayList arr = new ImmutableArrayList(new Objcet[] {3, 4, 5});
        arr.remove(0);
        AssertEqual(arr.toArray(), new Object[] {4, 5});
    }

    @Test
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveOutOfBounds() {
        ImmutableArrayList arr = new ImmutableArrayList(new Object[] {3, 4, 5});
        arr.remove(6);
    }

    @Test
    public void testSet() {
        Object[] obj = {3, 4, 5};
        ImmutableArrayList arr = new ImmutableArrayList();
        ImmutableArrayList arr1 = arr.set(0, 8);
        AssertEqual(arr.toArray(), obj);
        AssertEqual(arr1.get(0), 8);
    }

    @Test
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetOutOfBounds() {
        ImmutableArrayList arr = new ImmutableArrayList(new Object[] {3, 4, 5});
        arr.set(3, 7);
    }

    @Test
    public void testIndexOf() {
        Object[] obj = {3, 4, 5};
        ImmutableArrayList arr = new ImmutableArrayList();
        AssertEqual(arr.indexOf(4), 1);
        AssertEqual(arr.indexOf(8), -1);
    }

    @Test
    public void testSize() {
        Object[] obj = {3, 4, 5};
        ImmutableArrayList arr = new ImmutableArrayList();
        ImmutableArrayList arr1 = arr.addAll(obj);
        AssertEqual(arr.size(), 0);
        AssertEqual(arr1.size(), obj.length);
    }

    @Test
    public void testClear() {
        Object[] obj = {3, 4, 5};
        ImmutableArrayList arr = new ImmutableArrayList(obj);
        ImmutableArrayList arr1 = arr.clear();
        AssertEqual(arr.size(), obj.length);
        AssertEqual(arr1.size(), 0);
    }

    @Test
    public void testIsEmpty() {
        Object[] obj = {3, 4, 5};
        ImmutableArrayList arr = new ImmutableArrayList(obj);
        ImmutableArrayList arr1 = arr.clear();
        ImmutableArrayList arr2 = new ImmutableArrayList();
        AssertEqual(arr.isEmpty(), false);
        AssertEqual(arr1.isEmpty(), true);
        AssertEqual(arr2.isEmpty(), true);
    }
}
