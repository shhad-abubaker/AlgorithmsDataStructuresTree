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
public class TreeTest
{

	private final static int TREE_SIZE = 10;

	public static void main(String args[])
	{
		Tree tree = new Tree();

		FillTreeWithRandomValues(tree);

		System.out.println("\n\nPreorder traversal");
		tree.preorderTraversal();

		System.out.println("\n\nInorder traversal");
		tree.inorderTraversal();

		System.out.println("\n\nPostorder traversal");
		tree.postorderTraversal();

		System.out.println();
		System.exit(0);
	}

	protected static void FillTreeWithRandomValues(Tree tree)
	{
		System.out.println("Inserting the following values: ");

		for (int number = 1; number <= TREE_SIZE; number++)
		{
			int intVal = (int) (Math.random() * 100);
			System.out.print(intVal + " ");
			tree.insertNode(intVal+"");
		}
	}
}
