package Package2;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Deque;
public class queue {
public static void main(String[]args)
{
	/***Queue<Integer> q = new LinkedList<>();
	
	q.add(10);
	q.add(20);
	q.add(30);
	
	System.out.println("Queue: "+ q);
	q.offer(40);
	System.out.println(q);
	System.out.println(q.peek());
	
	System.out.println(q.peek());
	System.out.println(	q.element());
	q.remove();
	System.out.println(q);
	q.poll();
	System.out.println(q);
	System.out.println(q.size());
	System.out.println(q.contains(30));
	for(Integer val:q)
	{
		System.out.println(val);
	}
	q.clear();
	System.out.println(q.isEmpty());
	
	PriorityQueue<Integer>pq = new PriorityQueue<>();
	pq.add(20);
	pq.add(10);
	pq.add(30);
	System.out.println(pq);
	
	while(!pq.isEmpty()) {
		pq.poll();
		System.out.println(pq);
	}***/
	
	ArrayDeque<Integer>dq=new ArrayDeque<>();
	dq.add(10);
	dq.add(5);
	dq.add(6);
	dq.add(30);
	dq.add(20);
	System.out.println(dq);
	
	dq.removeFirst();
	System.out.println(dq);
	dq.removeLast();
	System.out.println(dq);
}
}
