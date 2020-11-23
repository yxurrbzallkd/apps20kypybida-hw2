package ua.edu.ucu.collections.immutable;

import java.util.Arrays;

public class ImmutableArrayList implements ImmutableList{
	private Object[] data;

	public ImmutableArrayList() {
		this.data  = new Object[0];
	}

	public ImmutableArrayList(Object[] data) {
		this.data = Arrays.copyOf(data, data.length);
	}

	public ImmutableArrayList add(Object e) {
		//adds element at the end of collection
		Object[] newData = new Object[this.size() + 1];
		for (int i = 0; i < this.size(); i++) {
			newData[i] = this.get(i); //
		}
		newData[this.size()] = e;
		return new ImmutableArrayList(newData);
	}
	public ImmutableArrayList add(int index, Object e) 
	throws IndexOutOfBoundsException{
		//adds elemet at index, exception if index out of range
		if ((index < 0) || (index >= this.size())) {
			throw new 
			IndexOutOfBoundsException("can't add at index "
			+index);
		}
		Object[] newData = new Object[this.size() + 1];
		for (int i = 0; i < index; i++) {
			newData[i] = this.get(i); //
		}
		newData[index] = e;
		for (int i = index; i < this.size(); i++) {
			newData[i + 1] = this.get(i); //
		}
		return new ImmutableArrayList(newData);
	}

    public ImmutableArrayList addAll(Object[] c) {
		//append array to collection
		Object[] newData = 
		Arrays.copyOf(this.data, this.size() + c.length);
		for (int i = 0; i < c.length; i++) {
			newData[i + this.size()] = c[i]; //
		}
		return new ImmutableArrayList(newData);
	}

	public ImmutableArrayList addAll(int index, Object[] c) 
	throws IndexOutOfBoundsException {
		if ((index < 0) || (index >= this.size())) {
			throw new 
			IndexOutOfBoundsException("can't add at index "
			+index);
		}
		Object[] newData = Arrays.copyOf(this.data, 
		this.size() + c.length - index);
		for (int i = index; i < c.length; i++) {
			newData[i - index] = c[i];
		}
		return new ImmutableArrayList(newData);
	}

	public Object get(int index) 
	throws IndexOutOfBoundsException {
		if ((index < 0) || (index >= this.size())) {
			throw new 
			IndexOutOfBoundsException("can't add at index "
			+index);
		}
		return this.data[index];
	}

	public ImmutableArrayList remove(int index) 
	throws IndexOutOfBoundsException {
		if ((index < 0) || (index >= this.size())) {
			throw new IndexOutOfBoundsException("can't add at index "
			+index);
		}
		Object[] newData = new Object[this.size()-1];
		for (int i = 0; i < index; i++) {
			newData[i] = this.get(i);
		}
		for (int i = index+1; i < this.size(); i++) {
			newData[i - 1] = this.get(i);
		}
		return new ImmutableArrayList(newData);
	}

	public ImmutableArrayList set(int index, Object e) 
	throws IndexOutOfBoundsException {
		if ((index < 0) || (index >= this.size())) {
			throw new 
			IndexOutOfBoundsException("can't add at index "
			+index);
		}
		Object[] newData = Arrays.copyOf(this.data, this.size());
		newData[index] = e;
		return new ImmutableArrayList(newData);
	}

    public int indexOf(Object e) {
		for (int i = 0; i < this.size(); i++) {
			if (this.get(i) == e) {
				return i;
			}
		}
		return -1;
	}

    public int size() {
		return this.data.length;
	}

    public ImmutableArrayList clear() {
		return new ImmutableArrayList(new Object[0]);
	}

    public boolean isEmpty() {
		return this.size() == 0;
	}

	public Object[] toArray() {
		return Arrays.copyOf(this.data, this.size());
	}

    @Override
    public String toString() {
		return Arrays.toString(this.data);
	}
}
