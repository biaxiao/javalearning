package offer.树;
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
	}
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

	// 将二叉树先序遍历，用于测试结果
	public static void preTraverseBinTree(BinaryTreeNode node) {
		if (node == null) {
			return;
		}
		System.out.print(node.value + " ");
		if (node.pleft != null) {
			preTraverseBinTree(node.pleft);
		}
		if (node.pright != null) {
			preTraverseBinTree(node.pright);
		}
	}

	// 将二叉树中序遍历，用于测试结果
	public static void inTraverseBinTree(BinaryTreeNode node) {
		if (node == null) {
			return;
		}
		if (node.pleft != null) {
			inTraverseBinTree(node.pleft);
		}
		System.out.print(node.value + " ");
		if (node.pright != null) {
			inTraverseBinTree(node.pright);
		}
	}

	// 将二叉树后序遍历，用于测试结果
	public static void postTraverseBinTree(BinaryTreeNode node) {
		if (node == null) {
			return;
		}
		if (node.pleft != null) {
			postTraverseBinTree(node.pleft);
		}
		if (node.pright != null) {
			postTraverseBinTree(node.pright);
		}
		System.out.print(node.value + " ");
	}
}
