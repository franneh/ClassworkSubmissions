import java.util.ArrayList;
public class ArrayListMethodsInDepth {

	public static void main(String[] args)
	{
		
		//instantiate an ArrayList named foods
		ArrayList<String> foods = new ArrayList<String>(); 
		// add apples
		foods.add("Apples"); 
		//add bread
		foods.add("Bread"); 
		//add cookies
		foods.add("Cookies"); 
		
		//print out length of foods
		System.out.println(foods.size()); 
		//the .size() method gets the length of the ArrayList
		//and returns the length
		
		//add Dole Whip to foods
		System.out.println(foods.add("Dole Whip"));
		//the .add(E) method adds another element to an ArrayList attached to the end,
		//and returns a boolean 
		System.out.println(foods.size());
		
		//change bread in food to butter
		System.out.println(foods.set(1, "Butter")); 
		//the .set(int, E) method replaces the element of an ArrayList at the specified index
		//replaces it with a new element
		//and returns the element which was removed
		System.out.println(foods.size());
		
		//remove cookies from foods
		System.out.println(foods.remove(2)); 
		//the .remove(int) method removes an element from an ArrayList at the specified index
		//and returns the element which was removed
		System.out.println(foods.size());

		
		
	}

}
