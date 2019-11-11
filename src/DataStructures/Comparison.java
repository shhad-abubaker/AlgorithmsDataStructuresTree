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
public class Comparison
{

	public final static int LessThan = -1;
	public final static int GreaterThan = 1;
	public final static int Equal = 0;

	public static boolean IsLessThan(int result)
	{
		return result == LessThan;
	}

	public static boolean IsGreaterThan(int result)
	{
		return result == GreaterThan;
	}

	public static boolean IsEqual(int result)
	{
		return result == Equal;
	}
}
