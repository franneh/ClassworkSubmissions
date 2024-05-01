public class arrayMethodsIntroPractice 
{
	public static void main(String[] args) 
	{

    //declare new int array
		int[] arr = {2, 4, 6, 8, 10, 12};

    //call divideElementByTwo
		divideElementByTwo(arr, 3);

    //declare new int array
		int[] firstAndLast = giveFirstAndLastArray(arr);
	}
	
	/**
	 * TASK 1: Create a method divideElementByTwo that is passed an integer array arr and and integer n.
	 * The method will change arr such that its nth element is divided by two.
	 * @param arr, the integer array being changed.
	 * @param n, the index of the array that will be divided by two
	 */
	public static void divideElementByTwo(int[] arr, int n)
	{
		arr[n] /= 2;
	}
	
	/**
	 * TASK 2: Create a method giveFirstAndLastArray that if passed an array, will return an array consisting of only the first and last elements.
	 * @param arr, the array, from which the method will grab the first and last elements
	 * @return firstAndLast, a new array consisting of the first and last elements of the original array
	 */
	public static int[] giveFirstAndLastArray(int[] arr)
	{
		int[] firstAndLast = {arr[0], arr[arr.length-1]};
		return firstAndLast;
	}
}
