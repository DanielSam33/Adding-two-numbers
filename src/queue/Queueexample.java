package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queueexample {

	public static void main(String[] args) {
		Queue<Integer> queue1=new LinkedList<Integer>();
		
		queue1.offer(20);
		queue1.offer(21);
		queue1.offer(22);
		queue1.offer(23);
		queue1.offer(24);
		
		System.out.println(queue1);
		
		queue1.poll();
		System.out.println(queue1);
		System.out.println("peek = "+queue1.peek());
		
	}

}
