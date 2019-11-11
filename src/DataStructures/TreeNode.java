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
public class TreeNode
{
// package access members

	TreeNode left;   // left node
	String data;        // data item	          - data will differ depending on the application.
	TreeNode right;  // right node

	// Constructor: initialize data to d and make this a leaf node
	public TreeNode(String d)
	{
		data = d;
		left = right = null;  // this node has no children
	}
// Insert a TreeNode into a Tree that contains nodes.( Ignore duplicate values).

	public synchronized void insert(String data)
	{
		//if (data.compareTo(this.data) == -1)
		if((Comparison.IsLessThan(data.compareTo(this.data))))
		{
			if (left == null)
			{
				left = new TreeNode(data);
			} else
			{
				left.insert(data);
			}
		} else if (Comparison.IsGreaterThan(data.compareTo(this.data)))
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
