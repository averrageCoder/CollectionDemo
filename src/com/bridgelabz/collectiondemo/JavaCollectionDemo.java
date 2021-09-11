package com.bridgelabz.collectiondemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

public class JavaCollectionDemo {

	public static void main(String[] args) {

		doListDemo();
		doStackDemo();
		doQueueDemo();

	}

	private static void doListDemo() {

		System. out.println("In doListDemo") ;
		//Creating List
		List<String> list = new LinkedList<>();
		//Adding object to the list

		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");

		//Traversing list through Iterator
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

	private static void doStackDemo() {
		System.out.println("\nIn doStackDemo") ;
		Stack<String> stack = new Stack<>();
		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Amit");
		stack.push("Ashish");
		stack.push("Garima");

		String pop = stack.pop();

		Iterator itr=stack.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

	private static void doQueueDemo() {
		System.out.println("\nIn doQueueDemo") ;
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Amit Sharma");
		queue.add("Vijay Raj");
		queue.add("JaiShankar") ;
		queue.add("Raj");
		System.out.println("Head: "+queue.element());
		System.out.println("Head: "+queue. peek());
		System.out.println("Iterating the queue elements:");
		Iterator itr=queue.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("\nAfter removing two elements:");
		
		Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
	}

}
