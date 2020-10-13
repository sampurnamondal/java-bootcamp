package com.sampurna.javabootcamp;

/*Post-order traversal*/

class TreeNode2 {

	Integer key;
	TreeNode2 left, right;

	public TreeNode2(Integer key) {
		this.key = key;
	}
}

class BinaryTree2 {

	TreeNode2 root;

	void doPostorderTraversal(TreeNode2 node) {

		if (node == null) {
			return;
		}
		doPostorderTraversal(node.left);
		doPostorderTraversal(node.right);
		System.out.println(node.key);
	}

}

public class PostorderTraversal {

	public static void main(String[] args) {

		BinaryTree2 tree = new BinaryTree2();
		tree.root = new TreeNode2(1);
		tree.root.left = new TreeNode2(2);
		tree.root.right = new TreeNode2(3);
		tree.root.left.left = new TreeNode2(4);
		tree.root.left.right = new TreeNode2(5);

		System.out.println("Postorder traversal");
		tree.doPostorderTraversal(tree.root);
	}

}
