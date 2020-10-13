package com.sampurna.javabootcamp;

/** Pre-order traversal */

class TreeNode {
	Integer key;
	TreeNode left;
	TreeNode right;

	TreeNode(Integer key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
}

class BinaryTree {

	TreeNode root;
	
	void doPreorderTraversal(TreeNode node) {
		
		if(node == null) {
			return;
		}
		System.out.print(node.key + " ");
		doPreorderTraversal(node.left);
		doPreorderTraversal(node.right);
	}
}

public class PreOrderTraversal {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		
		System.out.print("Preorder traversal" + "\n");
		tree.doPreorderTraversal(tree.root);

	}

}
