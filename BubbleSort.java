public class BubbleSort
{
	public static void main(String[] args) 
	{
    //declare integer array, named nums, and assign it the array produced by the makeRandom method
		int[] nums = makeRandom();

    //sort numbs array with bubbleSort method
		bubbleSort(nums);

    //print nums
		printArr(nums);
	}
	
	/*
	 * makeRandom method: creates an array containing 2000 large numbers
	 * @return bigNums, the array created
	 */
	private static int[] makeRandom() {

    //declare int array called bigNumbs, length 2000
		int[] bigNums = new int[2000];

    //declare int called len, is the length of bigNums
		int len = bigNums.length;

    //make for loop, sets int i to 0 and increments it until its not less than len
		for (int i = 0; i < len; i++)
		{

      //declare int called randomNumber that picks a random int 1 to 100
			int randomNumber = (int) ((Math.random() * 1000) + 1);
			bigNums[i] = randomNumber; 
			
		}

    //return bigNums
		return bigNums;
	}
	
	/**
	 * bubbleSort method: bubble sorts an integer array
	 * @param arr, the integer array being sorted
	 */
	public static void bubbleSort(int[] arr)
	{

    //make for loop that set int i to 0 increments it until it is not less than the length of the array
		for (int i = 0; i < arr.length; i++)
		{

      //for loop sets j int to 0 and incrememnts till it is not less than the length of the array
			for (int j = 0; j < arr.length-1; j++)
			{

        //If statement to check if current element is being checked is greater than next one
				if (arr[j] > arr[j+1])
      
				{ //if true, swap the current element with the next element
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	/**
	 * printArr method: prints out an array
	 * @param arr
	 */
	public static void printArr(int[] arr)
	{
		int traverser;
		for (traverser = 0; traverser < arr.length; traverser++)
		{
			System.out.println(arr[traverser]);
		}
	}
}
