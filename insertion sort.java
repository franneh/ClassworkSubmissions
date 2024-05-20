public class InsertionSort 
{
	public static void main(String[] args) 
	{
		int[] arr = {1, 5, 8, 10, 3, 7, 2}; 
		insertionSort(arr); 
	}
	
	
	public static void arrayShifter(int[] arr, int index)
	{
		int last = arr[index];
		for (int i = index-1; i >= 0; i--) 
		{
			if (last < arr[i]) 
			{
				
				int temp = last;
				arr[i+1] = arr[i];
				arr[i] = temp;
				last = arr[i]; 
			}
		}
	}
	

	public static void insertionSort(int[] arr)
	{for (int i = 1; i < arr.length; i++) 
		{
			arrayShifter(arr, i); 
		}
	}
}
