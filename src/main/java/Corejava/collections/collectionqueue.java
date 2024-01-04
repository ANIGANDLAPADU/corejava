package Corejava.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class collectionqueue {

	public static void main(String[] args) {
		PriorityQueue priorityQueue = new PriorityQueue();
		priorityQueue.offer(4);
		priorityQueue.add(2);
		priorityQueue.add(3);
		priorityQueue.peek();
		priorityQueue.poll();
		System.out.println(priorityQueue);
		LinkedList linkedList = new LinkedList();
		linkedList.offer("seshubabu");
		linkedList.add(1);
		linkedList.add("karanam");
		linkedList.add(3);
		System.out.println(linkedList);

	}

}
