package offer;
/**
 * 使用2个栈，实现一个队列
 * 2019年5月22日
 *
 */

import java.util.Stack;

public class Demo9<E> {
	private Stack<E> s1= new Stack<>();
	private Stack<E> s2= new Stack<>();
	
	public void appendTail(E e) {
		s1.push(e);
	}
	
	public E deleteHead() throws Exception {
		if(s2.empty()) {
			while(!s1.empty()) {
				s2.push(s1.pop());
			}
			if(s2.empty()) throw new Exception("有错,队列为空");
		}
		return s2.pop();
	}
	
	public static void main(String[] args) throws Exception {
		Demo9 d= new Demo9<>();
		d.appendTail(1);
		d.appendTail(2);
		System.out.println(d.deleteHead());
		System.out.println(d.deleteHead());
		d.appendTail(3);
		d.appendTail(4);
		System.out.println(d.deleteHead());
		System.out.println(d.deleteHead());
	}
}
