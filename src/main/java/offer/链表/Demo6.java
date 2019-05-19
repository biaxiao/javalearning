package offer.链表;

import java.util.Stack;

/***
 * 从尾到头打印链表
 */
public class Demo6 {
	
	void printListReversingly_Iteratively(ListNode phead) {
		Stack<ListNode> s= new Stack<>();
		ListNode e=phead;
		while(e!=null) {
			s.push(e);
			e=e.next;
		}
		
		while(!s.empty()) {
			ListNode pop = s.pop();
			System.out.println(pop.value);
		}
	}
	
	/**
	 * 递归在本质上就是栈结构    上面的方法更优，因为当链表很长时，会导致函数调用的层级很深，从而有可能导致函数调用栈溢出
	 */
	void printListReversingly_Recursively(ListNode phead) {
		if(phead!=null) {
			if(phead.next!=null) {
				printListReversingly_Recursively(phead.next);
			}
			System.out.println(phead.value);
		}
	}
	
}
