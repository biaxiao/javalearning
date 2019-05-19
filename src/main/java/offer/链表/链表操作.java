package offer.链表;

public class 链表操作 {
	//往链表的末尾添加一个节点
	void addToTail(ListNode phead, int value) {
		
		/*for(ListNode e=phead;e!=null;e=e.next) {
			if(e.next==null) {
				e.next=new ListNode(value);
				break;
			}
		}
		
		phead=new ListNode(value);*/
		
		
		ListNode eNew= new ListNode(value);
		if(phead==null) {
			phead=eNew;
		}else {
			ListNode e=phead;
			while(e.next!=null) {
				e=e.next;
			}
			e.next=eNew;
		}
		
		
		
	}
	
	//删除节点
	void removeNode(ListNode phead, int value) {
		/*if(phead==null) {
			return;
		}
		
		ListNode pre=null;
		for(ListNode e=phead;e!=null;e=e.next) {
			if(e.value==value) {
				ListNode t=e.next;
				e.next=null;
				if(pre==null) {
					phead=t;
				}else {
					pre.next=t;
				}
				break;
			}
			pre=e;
		}*/
		if(phead==null) return;
		if(phead.value==value) {
			phead=phead.next;
		}else {
			ListNode e=phead;
			while(e.next!=null&&e.next.value!=value) {
				e=e.next;
			}
			if(e.next!=null&&e.next.value==value) {
				e.next=e.next.next;
			}
		}
		
	}
}
