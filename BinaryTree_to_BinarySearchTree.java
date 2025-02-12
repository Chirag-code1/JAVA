
import java.util.*;

public class Main{
	
	/* A binary tree node structure */
	static class Node {
		int data;
		Node left;
		Node right;
	};

	// index pointer to pointer to the array index
	static int index;


	/* A helper function that stores inorder traversal of a tree rooted
	with node */
	static void storeInorder(Node node, int inorder[])
	{
		// Base Case
		if (node == null)
			return;

		/* first store the left subtree */
		storeInorder(node.left, inorder);

		/* Copy the root's data */
		inorder[index] = node.data;
		index++; // increase index for next entry

		/* finally store the right subtree */
		storeInorder(node.right, inorder);
	}

	/* A helper function to count nodes in a Binary Tree */
	static int countNodes(Node root)
	{
		if (root == null)
			return 0;
		return countNodes(root.left) + countNodes(root.right) + 1;
	}

	/* A helper function that copies contents of arr[] to Binary Tree.
	This function basically does Inorder traversal of Binary Tree and
	one by one copy arr[] elements to Binary Tree nodes */
	static void arrayToBST(int[] arr, Node root)
	{
		// Base Case
		if (root == null)
			return;

		/* first update the left subtree */
		arrayToBST(arr, root.left);

		/* Now update root's data and increment index */
		root.data = arr[index];
		index++;

		/* finally update the right subtree */
		arrayToBST(arr, root.right);
	}

	// This function converts a given Binary Tree to BST
	static void binaryTreeToBST(Node root)
	{
		// base case: tree is empty
		if (root == null)
			return;

		/* Count the number of nodes in Binary Tree so that
		we know the size of temporary array to be created */
		int n = countNodes(root);

		// Create a temp array arr[] and store inorder traversal of tree in arr[]
		int arr[] = new int[n];

		storeInorder(root, arr);

		// Sort the array using library function for quick sort
		Arrays.sort(arr);
		
		
		// Copy array elements back to Binary Tree
		index = 0;
		arrayToBST(arr, root);
	}

	/* Utility function to create a new Binary Tree node */
	static Node newNode(int data)
	{
		Node temp = new Node();
		temp.data = data;
		temp.left = null;
		temp.right = null;
		return temp;
	}

	/* Utility function to print inorder traversal of Binary Tree */
	static void printInorder(Node node)
	{
		if (node == null)
			return;

		/* first recur on left child */
		printInorder(node.left);

		/* then print the data of node */
		System.out.print(node.data + " ");

		/* now recur on right child */
		printInorder(node.right);
	}

	/* Driver function to test above functions */
	public static void main(String args[])
	{
		Node root = null;

		root = newNode(10);
		root.left = newNode(30);
		root.right = newNode(15);
		root.left.left = newNode(20);
		root.right.right = newNode(5);

		// convert Binary Tree to BST
		binaryTreeToBST(root);

		System.out.println("Following is Inorder Traversal of the converted BST: ");
		printInorder(root);

	}
}

