package dataStructuresAndAlgorithms;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList {

	/*
	 * With Linkedlist or - Simple Queue (FIFO) Inserts at the rear, removes from
	 * the front
	 */
	public void queueUsingLinkedList() {
		Queue<Integer> queue = new LinkedList<>();

		queue.add(10);
		queue.add(20);
		queue.add(30);

		// Print all elements in queue.
		System.out.println("Queue :" + queue);

		// Print the front element in queue
		System.out.println("Front element: " + queue.peek());

		// Remove the front element from queue
		System.out.println("Removed Element: " + queue.poll());

		// Print all elements in queue after removing 1 element.
		System.out.println("Queue after removing 1 element: " + queue);

		// Check if queue is empty or not.
		System.out.println("Is Queue empty? " + queue.isEmpty());

	}
}

/*
 * Deque (Double-Ended Queue) - Allows insertion and removal from both ends
 */
class QueueUsingArray {
	private int front, rear, capacity;
	private int[] arrayQueue;

	public QueueUsingArray(int capacity) {
		this.capacity = capacity;
		front = rear = -1;
		arrayQueue = new int[capacity];
	}

	public void enqueue(int item) {
		if (rear == capacity - 1) {
			System.out.println("Queue is full");
			return;
		}
		if (rear == -1) {
			front = 0;
			rear = 0;
			arrayQueue[rear] = item;
		} else {
			rear++;
			arrayQueue[rear] = item;
		}
		System.out.println("Inserted Value: " + item);
	}

	public void displayQueue() {
		if (front == -1) {
			System.out.println("Queue is empty");
			return;
		} else {
			for (int i = front; i < rear + 1; i++) {
				System.out.print("Values in Queue are: ");
				System.out.print(arrayQueue[i] + " ");
				System.out.println();
			}
		}
	}

	public int deQueue() {
		if (front == -1) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int item = arrayQueue[front];
		front++;
		if (front > rear) {
			front = rear = -1;
		}
		return item;
	}
}

class Main {
	public static void main(String[] args) {
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.queueUsingLinkedList();
		QueueUsingArray queueArray = new QueueUsingArray(3);
		queueArray.enqueue(10);
		queueArray.enqueue(20);
		queueArray.enqueue(30);
		queueArray.enqueue(40);

		queueArray.displayQueue();

		System.out.println("Dequeued Element : " + queueArray.deQueue());
		System.out.println("Dequeued Element : " + queueArray.deQueue());
		System.out.println("Dequeued Element : " + queueArray.deQueue());

		queueArray.displayQueue();
	}
}
