package dataStructuresAndAlgorithms;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TypesOfQueues {

	/*
	 * Simple Queue (FIFO)-- Inserts at the rear, removes from the front
	 */
	void simpleQueue_FIFO() {
		Queue<String> queue = new LinkedList<>();
		queue.add("John");
		queue.add("wick");
		System.out.println("Simple Queue (FIFO)_remove first Element: " + queue.poll());
		System.out.println("Simple Queue (FIFO)_Last Element: " + queue.peek());
	}
	
	/*
	 * Priority Queue (FIFO)-- Elements are removed based on their priority. Lower priority elements are removed first.
	 */
	void priortyQueue() {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(5);
		pq.add(4);
		pq.add(1);
		pq.add(10);
		System.out.println("Priority Queue_remove first element(Low Priority): "+pq.poll());//1
		System.out.println("Priority Queue_remove first element(Low Priority): "+pq.poll());//4
		System.out.println("Priority Queue_remove first element(Low Priority): "+pq.poll());//5
		System.out.println("Priority Queue_remove first element(Low Priority): "+pq.poll());//10
		System.out.println("Priority Queue_remove first element(Low Priority): "+pq.poll()); //null
	}
	
	/*
	 * Dequeue(Double-Ended Queue) (LIFO)-- Inserts at the rear,removes from the rear.
	 * - Allows insertion and removal from both ends
	 * - Can act as both a queue and a stack
	 */
	void deQueue() {
		Deque<String> deque=new ArrayDeque<String>();
		deque.add("Will");
		deque.add("Smith");
		deque.addFirst("Gold");
		deque.addLast("Berg");
		//System.out.println("Deque _first Element at top: "+deque.peekFirst());
		//System.out.println("Deque _last Element at top: "+deque.peekLast());
		System.out.println("Dequeu _Removed Element: "+deque.poll());//Gold
		System.out.println("Dequeu _Removed Element: "+deque.poll());//Will
		System.out.println("Dequeu _Removed Element: "+deque.poll());//Smith
		System.out.println("Dequeu _Removed Element: "+deque.poll());//Berg
		System.out.println("Dequeu _Removed Element: "+deque.poll());//null
		System.out.println("Elements in Deque: "+deque);
				
	}
	public static void main(String[] args) {

		TypesOfQueues typesOfQueues = new TypesOfQueues();
		typesOfQueues.simpleQueue_FIFO();
		
		typesOfQueues.priortyQueue();
		
		typesOfQueues.deQueue();

	}

}
