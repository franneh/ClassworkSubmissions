public class printPrevNextElement 
{
	public static void main(String[] args) 
	{

    //declare double array, named arr, and assign it double data types
		double[] arr = 4.54, 2.78, 8.36, 5.71, 6.72, 9.67, 1.74}; 

    //declare int
		int index = 3;

    //call printPrevNextElement
		printPrevNextElement(arr, index); 
	}
	
	public static void printPrevNextElement(double[] nums, int n)
	{

    //print to show number before index
		System.out.println("The number before index " + n + " is " + nums[n-1] + "."); 

    //print to show number after index
		System.out.println("The number after index " + n + " is " + nums[n+1] + "."); 
	}
}
