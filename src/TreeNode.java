/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author k00225307
 */
public class TreeNode
{
// package access members

	TreeNode left;   // left node
	int data;        // data item	          - data will differ depending on the application.
	TreeNode right;  // right node

	// Constructor: initialize data to d and make this a leaf node
	public TreeNode(int d)
	{
		data = d;
		left = right = null;  // this node has no children
	}
// Insert a TreeNode into a Tree that contains nodes.( Ignore duplicate values).

	public synchronized void insert(int data)
	{
		if (data < this.data)
		{
			if (left == null)
			{
				left = new TreeNode(data);
			} else
			{
				left.insert(data);
			}
		} else if (data > this.data)
		{
			if (right == null)
			{
				right = new TreeNode(data);
			} else
			{
				right.insert(data);
			}
		}
	}
}
