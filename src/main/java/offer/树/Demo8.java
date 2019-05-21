package offer.树;
/**
 * 二叉树的下一个节点（给定一颗二叉树和其中的一个节点，如何找出中序遍历序列的下一个节点（树中的节点除了有左、右子节点的指针，还有指向父节点的指针））
 * 2019年5月21日
 *
 */
public class Demo8 {
	
	BinaryTreeNode getNext(BinaryTreeNode e) {
		if(e==null) {
			return null;
		}
		
		BinaryTreeNode tnext=null;
		if(e.pright!=null) {
			BinaryTreeNode pright=e.pright;
			while(pright.pleft!=null) {
				pright=pright.pleft;
			}
			tnext=pright;
		}else if(e.parent!=null) {
			BinaryTreeNode pcurrent=e;
			BinaryTreeNode parent=e.parent;
			while(parent!=null && pcurrent==parent.pright) {
				pcurrent=parent;
				parent=pcurrent.parent;
			}
			tnext=parent;
		}
		
		return tnext;
		
	}
}
