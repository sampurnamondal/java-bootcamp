package com.sampurna.javabootcamp;

/*Pre-order traversal without recursion */

class TreeNode3 {
	Integer key;
	TreeNode3 left;
	TreeNode3 right;

	TreeNode3(Integer key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
}

class BinaryTree3 {

	TreeNode3 root;

	void doPreorderTraversal(TreeNode3 node) {

		System.out.println(node.key);
		
	}
}

public class PreorderTraversalWithoutRecursion {

	public static void main(String[] args) {

		BinaryTree3 tree = new BinaryTree3();
		tree.root = new TreeNode3(1);
		tree.root.left = new TreeNode3(2);
		tree.root.right = new TreeNode3(3);
		tree.root.left.left = new TreeNode3(4);
		tree.root.left.right = new TreeNode3(5);

		System.out.print("Preorder traversal" + "\n");
		tree.doPreorderTraversal(tree.root);
	}

}
