
public class traversalMethodHw 
{
	
	public static void main(String[] args)
	{
			
		//make array of ints
		int[] arr =	{3, 8, 4, 9, 2, 6, 7};
		
		//make array of doubles
		double[] arr1 = { 7.1, 4.3, 6.9, 24, 5.7};
		
		//arr of int 
		int[] arr2 = { 4,1, 9};
		
		
		//arr of int
		int[] arr4 = { 7, 6, 4};
		
		//array of doubles
		double[] arr3 = { 2.0, 8.8, 8.8, 8.8, 9.0, 3.1};
		
		
		
		System.out.println(findHighest(arr));
		
		System.out.println(findAvg(arr1));
		
		System.out.println(checkEven(arr2));
		
		System.out.println(checkAllEven(arr4));
		
		CheckThreeSame( arr3);
		
		
	}
	/*
	 * 1: Make a method that is passed an int array 
	 * and returns the highest value in that array.
	 */
	public static boolean checkEven (int[] arr)
	{
		int trav;
		
		for (trav = 0; trav < arr.length; trav++) 
		{
			if (arr[trav] % 2 == 0) 
			{
				return true;
			}
		}
		return false; 
	}
	

	
	/*
	 * 2: Make a method that is passed an array of doubles
	 *  and returns a double consisting of their average. 
	 */ 
	private static double findAvg(double[] arr1) {
		// TODO Auto-generated method stub
		double count =  0;
		for (int i = 0; i < arr1.length; i++)
		{
			count += arr1[i];
		}
		count = count/arr1.length;
		return count;
	}
	
	
	
	/*
	 * /3: Make a method that is passed an int array and returns whether
	 *  or not the array has any even numbers in it.
	 */
	
	public static boolean checkAllEven (int[] arr)
	{
		int count = 0;
		int trav;
		for (trav = 0; trav < arr.length; trav++) 
		{
			if (arr[trav] % 2 == 0) 
			{
				count ++;
			}
		}
		if (count == arr.length)
		{
			
			return true;
		}
		return false; 
	}
		
		
	
	
	/*
	 * /4: Make a method that is passed an int array and returns 
	 * whether or not the array has ALL even numbers in it 
	 */
	
	private static int findHighest(int[] arr) {
			int max = arr[0];
			int trav;
			for (trav = 1; trav < arr.length; trav ++)
			{
				if (arr[trav] > max)
				{
					max = arr[trav];
				}
			}
			
			
			return max;
	}
		
		
		
	/*
	 * /5: Make a method that is passed a double array and returns 
	 * whether or not three consecutive doubles of the same value appear
	 * in the array
	 */
	
public static boolean CheckThreeSame(double[] arr3) {
		
		
		int trav = 0;
		boolean  hasThree = false;
		for (; trav < arr3.length - 3; trav++)
			
		{
			if (arr3[trav] == arr3[trav + 1] && arr3[trav] ==  arr3[trav + 2]);
			{
				hasThree = true;
			}
			
		}
		return hasThree;
	}
	
}
