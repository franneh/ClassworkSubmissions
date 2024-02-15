import java.util.Scanner;
public class Psuedocode {

	public static void main(String[] args)
	{
		
		
	//import scanner
	Scanner myReader = new Scanner (System.in);
	
	//instantiate string
	String str = myReader.nextLine();	
	
	Character delete = ' ';
	Character plus = '+';
	int a = countChar(str, delete);
	int b = countChar(str, plus);
	//make method to get numbers
	getNums(str, a);
	
	//close scanner
	myReader.close();


	
	//instantiate a new String phrase
		String str2 = new String("I love carl");
		
	//instantiate a new String, which uses removeSpaces to remove the spaces from str
		String str3 = new String(removeSpaces(str)); 
		
	//print str3
		System.out.println(str3); 
		


	
	
	}

	

	private static void getNums(String str, int a) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < a; i++)
		{

	//start at the beginning of number up to "d"
	String left = str.substring(0,str.indexOf("d"));	
	//would identify number after the "d" on the right side
	String right = str.substring(str.indexOf("d") + 1, str.length());
	//print out number with first number on left and second on right
	System.out.println("Rolling Dice" + left + " " + right+ "times");
	
	//call method for 
	turnInt(left,right);
		}
	}

private static void turnInt(String left, String right) {
	//changes left string into integers
	int a = Integer.valueOf(left);
	//changes right string into integers
	int b = Integer.valueOf(right);
	
	//print out the integers
	System.out.println(a+b);
	
	//call method that rolls dice
	rollDice(a,b);
		
	}

private static void rollDice(int a, int b) {
	// TODO Auto-generated method stub
	//make int that will hold the value of running count
	int hold = 0;
	
	//make loop that iterates the first number 
	//how many times the user puts it
	for (int i = 1; i < a + 1; i++) {
		
		//make int thats an equal value to one roll
		int adder = (int)((double)Math.random() * b + 1);
		
		//print roll
		System.out.println(adder);
		
		//add current roll to running roll
		hold += adder;
		
		
		
	}
	//print out total of rolls		
	System.out.println("The total of your rolls is " + hold);
	
	
}
	
private static String removeSpaces(String str)
{
	//declare int spaceIndex to be 0 
	int spaceIndex = 0; 
	
	//instantiate a new String
	String noSpaces = new String("");
	
	//for loop that declares which int i as 0 and increments till its not less than the str
	for (int i = 0; i < str.length(); i++) 
	//this makes the loop runs the proper amount of times
	{
		
	//if statement to check if the character at the ith index of the String is a space
	if (str.charAt(i) == ' ')
		//this ensures each character of the String is checked
		{
//concatenate noSpaces to include the str value from the previous space's index to the current index
noSpaces = noSpaces.concat(str.substring(spaceIndex + 1, i)); 
			
	 //reassigns spaceIndex as the current index
	spaceIndex = i; //reassigns spaceIndex as the current index 
		}
	}
	 //constructs final noSpaces value through concatenation
	noSpaces = String.valueOf(str.charAt(0)).concat(noSpaces).concat(str.substring(spaceIndex + 1)); 
	//includes 1st character of str and characters after the last space 
	
	 //return noSpaces
	return noSpaces;


	
}




	
}
