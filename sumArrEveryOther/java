public class sumArrEveryOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instantiate doubles
		double [] arr = { 3.1, 2.1, 8.4};
		
		//instantiate int
		int [] nums = { 3, 17, 12, 8, 9, 4, 12 };
		
		
		System.out.println(sumArrElements( arr ));
		
		
		int [] brr = makeEveryOther( nums );
		
		printArr(brr);
	}

	private static int[] makeEveryOther(int[] nums) {
		
		
		for ( int i = 1; i <= nums.length - 1; i+= 2)
		{
			nums[i] = 1;
		}
		
		return nums;
	}

	private static double sumArrElements(double[] arr) {
		
		double a = 0;
		
		for ( int i = 0; i <= arr.length - 1; i++)
		{
			a += arr[i];
		}
		return a;
	}
	public static void printArr ( int[] arr )
	{
		
		for ( int i = 0; i <= arr.length - 1; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
