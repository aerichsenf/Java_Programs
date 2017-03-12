import java.util.*;

public class StackOfIntegers {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;

	// An empty stack with a default capacity of 16;
	public StackOfIntegers() {
		this (DEFAULT_CAPACITY);
	}
	
	//Constructs an empty stack with a specified capacity.
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	//Returns true if the stack is empty
	public boolean empty(){
		return size == 0;
	}

	//Returns the integer at the top of the stack without
	//removing it from the stack.
	public int peek() {
		return elements[size -1];
	}

	//Stores an integer into the top of the stack.
	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			// The java.lang.System.arraycopy() method copies 
			// an array from the specified source array, beginning
			// at the specified position, to the specified 
			// position of the destination array. 
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = value;
	}

	// Removes the integer at the top of the stack and returns it.
	public int pop() {
		return elements[--size];
	}

	// Returns the number of elements in the stack.
	public int getSize() {
		return size;
	}
}