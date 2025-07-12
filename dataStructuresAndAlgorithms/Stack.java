package dataStructuresAndAlgorithms;

/**
 * Stack is a linear data structure that follows the Last In First Out (LIFO)
 * principle.
 * 
 * Push operation adds an item to the top of the stack.
 * 
 * Pop operation removes the item from the top of the stack.
 */
public class Stack {

	private int maxSize;
	private int top;
	private int[] stackArray;

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.top = -1;
		this.stackArray = new int[maxSize];
	}

	public int pushOperation(int value) {
		if (isFull()) {
			System.out.println("Stack Overflow");
		} else {
			stackArray[++top] = value;
			System.out.println("Pushed value: " + value);
		}
		return value;
	}
	
	public int popOperation() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		} else {
			int value=stackArray[top] ;
			stackArray[top]=0;
			top--;
			System.out.println("Popped value: " + value);
			return value;
		}		
	}

	public boolean isEmpty() {
		return top == -1;
	}

	private boolean isFull() {
		return top == maxSize - 1;
	}

	public int peekOperation() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1; // Or throw an exception
		} else {
			return stackArray[top];// returns top value in the stack
		}
	}

	public void displayStack() {
	    if (isEmpty()) {
	        System.out.println("Stack is empty");
	    } else {
	        System.out.print("Current stack contents: ");
	        for (int i = 0; i <= top; i++) {
	            System.out.print(stackArray[i] + " ");
	        }
	        System.out.println();
	    }
	}
	public static void main(String[] args) {

		Stack stack = new Stack(5);
		stack.pushOperation(10);
		stack.pushOperation(20);
		stack.pushOperation(30);
		stack.pushOperation(40);
		stack.pushOperation(50);

		// Test stack overflow
		stack.pushOperation(60);
		System.out.println("Check Stack is empty: " + stack.isEmpty());

		// Test peek operation
		System.out.println("Top value: " + stack.peekOperation());
		
		stack.popOperation();
		stack.displayStack();

	}

}
