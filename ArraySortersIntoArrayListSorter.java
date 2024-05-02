import java.util.ArrayList;

public class ArraySortersIntoArrayListSorters {

	public static void main(String[] args) {
	
	//instantiate ArrayList nums
	ArrayList <Integer> nums = new ArrayList <Integer>();
			
	nums.add(2);
	nums.add(6);
	nums.add(1);
	nums.add(9);
	nums.add(4);
	
	//print nums
	System.out.println(nums);
	//sort nums with this method
	bubbleSortNumbers(nums);
	//print nums sorted
	System.out.println(nums);
	
	//instantiate ArrayList names
	ArrayList<String> names = new ArrayList<String>();
	
	names.add("Phil");
	names.add("Stacy");
	names.add("Cade");
	names.add("Kyra");
	names.add("Debra");
	
	//print names
	System.out.println(names);
	//sort names using this method
	bubbleSortStrings(names);
	//print names sorted
	System.out.println(names);
	}


	private static void bubbleSortStrings(ArrayList<String> arr)
	{
		//for loop sets int i to 0 and increments till not less than length of ArrayList
		for (int i = 0; i < arr.size(); i++) 
		{
			//for loop sets int j to 0 and increments till not less than length ArrayList
			for (int j = 0; j < arr.size() - 1; j++) 
			{
				//if statements to check if current element being checked is greater than next
				if (arr.get(j).compareTo(arr.get(j+1)) > 0)
				{ //if true, swap the current element with the next element
					
					//declare String which stores the current String at index j+1
					String temp = arr.set(j+1, arr.get(j)); 
					//the j+1 index of the ArrayList will also be set to the String at index j of the ArrayList
					arr.set(j, temp); //set the Integer at index j of the ArrayList to the temp
				}
			
			}
		}
	}
		


	public static void bubbleSortNumbers(ArrayList<Integer> arr)
	{
		
		//for loop that sets int i to 0
		for (int i = 0; i < arr.size(); i++) 
		{
			//for loop sets int j to 0 and increments till not less than length ArrayList
			for (int j = 0; j < arr.size() - 1; j++) 
			{
			//if statements to check if current element being checked is greater than next
				if (Integer.compare(arr.get(j), arr.get(j+1)) > 0) 
				{ //if true, swap the current element with the next element
			//decalre an Int which stores current Int at index j+1
					Integer temp = arr.set(j+1, arr.get(j));
			//the j+1 index of the ArrayList will also be set to the Integer at index j of the ArrayList
					arr.set(j, temp); //set the Integer at index j of the ArrayList to the temp
				}
			}
		}
	}
		
		
		
	}








