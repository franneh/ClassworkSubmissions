
public class DiceRoller {

	public static void main(String[] args) {
		
		
		//for (int i = 1; i<200; i++) 
		{
		
			//System.out.println((int)((double)Math.random()*17+1));	
		}
	//string we're searching for letter
	String x = ("AAAqAqAA");
	//letter we're searching for
	Character y  = 'q';
	//declare method with string and char
	countChars(x,y);
		
		

	}
	//method checks amount of times char shows up in string
	private static void countChars(String x, Character y) {
	
	//number of char starts at 0
	int count = 0;
	
	//for loop that checks each letter for char
	 for(int i=0; i < x.length(); i++)
	 {    if(x.charAt(i) == y)
		 //add one to the count when it equals what we want
         count++;
 }
 //print the final count
 System.out.println(count);
		
	}

}
