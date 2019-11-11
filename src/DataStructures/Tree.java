/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

/**
 *
 * @author k00225307
 */
public class Tree
{

	private TreeNode root;

	// Construct an empty Tree of integers
	public Tree()
	{
		root = null;
	}

	public synchronized void insertNode(String value)
	{
		if (this.isEmpty())
		{
			root = new TreeNode(value);
		} else
		{
			root.insert(value);
		}
	}

	public void clear()
	{
		this.root = null;
	}

	public boolean isEmpty()
	{
		return root == null;
	}

	public synchronized void preorderTraversal()
	{
		preorderHelper(root);
	}

	private void preorderHelper(TreeNode node)
	{
		if (node == null)
		{
			return;
		}
		System.out.print(node.data + " ");
		preorderHelper(node.left);
		preorderHelper(node.right);
	}

	public synchronized String inorderTraversal()
	{
		return inorderHelper(root);
	}

	private String inorderHelper(TreeNode node)
	{
		if (node == null)
		{
			return "";
		}
		String left = inorderHelper(node.left);
		String root = node.data + " ";
		String right = inorderHelper(node.right);
		return left + root + right;
	}

	public synchronized void postorderTraversal()
	{
		postorderHelper(root);
	}

	private void postorderHelper(TreeNode node)
	{
		if (node == null)
		{
			return;
		}
		postorderHelper(node.left);
		postorderHelper(node.right);
		System.out.print(node.data + " ");
	}
}
