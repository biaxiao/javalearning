package offer.树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 已知二叉树的前序遍历和中序遍历，重建二叉树
 * 2019年5月19日
 *
 */
public class Demo7 {
	public static void main(String[] args) {
		int[] preOrder = {1,2,4,7,3,5,6,8};
		int[] inOrder = {4,7,2,1,5,3,8,6};
		BinaryTreeNode construct = Construct(preOrder,inOrder);
		System.out.println(construct);
		//先序遍历
		preTraverseBinTree(construct);
		System.out.println();
		preTraverseBinTree2(construct);
		System.out.println("\n----------------");
		postTraverseBinTree(construct);
		System.out.println();
		postTraverseBinTree2(construct);
		System.out.println("\n----------------");
		inTraverseBinTree(construct);
		System.out.println();
		inTraverseBinTree2(construct);
	}
	
	//返回头结点
	static BinaryTreeNode Construct(int[] preOrder,int[] inOrder) {
		return ConstructCore(preOrder, 0, preOrder.length-1, inOrder, 0, inOrder.length-1);
	}
	
	static BinaryTreeNode ConstructCore(int[] preOrder,int preLeft,int preRight,int[] inOrder,int inLeft,int inRight) {
		if(preLeft>preRight||inLeft>inRight) {
			return null;  //只能这样写，不然的话，回出现数组下标越界，因为==的话，只能拒绝==，之后并不能拒绝 继续变大后的不等
		}
		
		BinaryTreeNode rootNode=new BinaryTreeNode(preOrder[preLeft]);
		for(int i=inLeft;i<=inRight;i++) {
			if(preOrder[preLeft]==inOrder[i]) {
				rootNode.pleft=ConstructCore(preOrder, preLeft+1, preLeft+i-inLeft, inOrder, inLeft, i-1);
				rootNode.pright=ConstructCore(preOrder, preLeft+i-inLeft+1, preRight, inOrder, i+1, inRight);
				break;
			}
		}
		return rootNode;
	}

	// 将二叉树前序遍历，用于测试结果
	public static void preTraverseBinTree(BinaryTreeNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.value + " ");
		if (root.pleft != null) {
			preTraverseBinTree(root.pleft);
		}
		if (root.pright != null) {
			preTraverseBinTree(root.pright);
		}
	}

	public static void preTraverseBinTree2(BinaryTreeNode root) {
		if(root==null) {
			return;
		}
		Stack<BinaryTreeNode> s=new Stack<>();
		s.push(root);
		while(!s.empty()) {
			BinaryTreeNode e = s.pop();
			System.out.print(e.value+" ");
			if(e.pright!=null) {
				s.push(e.pright);
			}
			if(e.pleft!=null) {
				s.push(e.pleft);
			}
		}
		
		
	}
	
	// 将二叉树中序遍历，用于测试结果
	public static void inTraverseBinTree(BinaryTreeNode root) {
		if (root == null) {
			return;
		}
		if (root.pleft != null) {
			inTraverseBinTree(root.pleft);
		}
		System.out.print(root.value + " ");
		if (root.pright != null) {
			inTraverseBinTree(root.pright);
		}
	}

	public static void inTraverseBinTree2(BinaryTreeNode root) {
		if (root == null) {
			return;
		}
		
		Stack<BinaryTreeNode> s=new Stack<BinaryTreeNode>();
		
		do {
			while(root!=null) {
				s.push(root);
				root=root.pleft;
			}
			if(!s.empty()) {
				BinaryTreeNode e = s.pop();
				System.out.print(e.value+" ");
				root=e.pright;
			}
		}while(!s.empty()||root!=null);
		
	}
	
	
	// 将二叉树后序遍历，用于测试结果
	public static void postTraverseBinTree(BinaryTreeNode root) {
		if (root == null) {
			return;
		}
		if (root.pleft != null) {
			postTraverseBinTree(root.pleft);
		}
		if (root.pright != null) {
			postTraverseBinTree(root.pright);
		}
		System.out.print(root.value + " ");
	}
	
	public static void postTraverseBinTree2(BinaryTreeNode root) {
		if (root == null) {
			return;
		}
		Stack<BinaryTreeNode> s=new Stack<>();
		List<Integer> list=new ArrayList<Integer>();
		s.push(root);
		while(!s.empty()) {
			BinaryTreeNode e = s.pop();
			if(e.pleft!=null) {
				s.push(e.pleft);
			}
			if(e.pright!=null) {
				s.push(e.pright);
			}
			list.add(0, e.value);
		}
		
		for (Integer integer : list) {
			System.out.print(integer+" ");
		}
	}
	
}
