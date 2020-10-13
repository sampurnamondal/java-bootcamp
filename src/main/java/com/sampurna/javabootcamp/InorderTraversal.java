package com.sampurna.javabootcamp;

/*In order traversal*/

class TreeNode1 {

	Integer key;
	TreeNode1 left, right;

	public TreeNode1(Integer key) {
		this.key = key;
	}
}

class BinaryTree1 {

	TreeNode1 root;

	void doInorderTraversal(TreeNode1 node) {

		if (node == null) {
			return;
		}
		doInorderTraversal(node.left);
		System.out.println(node.key);
		doInorderTraversal(node.right);
	}
}

public class InorderTraversal {

	public static void main(String[] args) {

		BinaryTree1 tree = new BinaryTree1();
		tree.root = new TreeNode1(1);
		tree.root.left = new TreeNode1(2);
		tree.root.right = new TreeNode1(3);
		tree.root.left.left = new TreeNode1(4);
		tree.root.left.right = new TreeNode1(5);

		System.out.println("Inorder traversal");
		tree.doInorderTraversal(tree.root);
	}

}
