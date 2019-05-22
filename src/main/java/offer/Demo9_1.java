package offer;
/**
 * 2个队列实现栈
 * 2019年5月22日
 *
 */

import java.util.LinkedList;
import java.util.Queue;

public class Demo9_1 <E> {

	private Queue<E> q1=new LinkedList<E>();
	private Queue<E> q2=new LinkedList<E>();
	
	public void push(E e) {
		if(!q2.isEmpty()) {
			q2.offer(e);
		}else {
			q1.offer(e);
		}
	}
	
	public E pop() throws Exception {
		if(!q1.isEmpty()) {
			while(q1.size()>1) {
				q2.offer(q1.poll());
			}
			return q1.poll();
		}else if(!q2.isEmpty()) {
			while(q2.size()>1) {
				q1.offer(q2.poll());
			}
			return q2.poll();
		}else {
			throw new Exception("出错，栈为空");
		}
	}
	public static void main(String[] args) throws Exception {
		Demo9_1<Integer> d= new Demo9_1<>();
		d.push(1);
		d.push(2);
		d.push(3);
		System.out.println(d.pop());
		System.out.println(d.pop());
		d.push(4);
		d.push(5);
		
		System.out.println(d.pop());
		System.out.println(d.pop());
		System.out.println(d.pop());
		
		
		
		
	}
}
