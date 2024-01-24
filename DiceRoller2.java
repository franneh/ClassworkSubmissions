import java.util.Scanner;
public class Psuedocode {

	public static void main(String[] args)
	{
		
		
	//import scanner
	Scanner myReader = new Scanner (System.in);
	
	//instantiate string
	String str = myReader.nextLine();	
	
	//make method to get numbers
	getNums(str);
	
	//close scanner
	myReader.close();

	getNums(str);
	
	}

	private static void getNums(String str) {
		// TODO Auto-generated method stub
	//start at the beginning of number up to "d"
	String left = str.substring(0,str.indexOf("d"));	
	//would identify number after the "d" on the right side
	String right = str.substring(str.indexOf("d") + 1, str.length());
	//print out number with first number on left and second on right
	System.out.print(left + " " + right);
	
	//call method for 
	turnInt(left,right);
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
		System.out.print(adder);
		
		//add current roll to running roll
		hold += adder;
		
	}
			
	//print all the rolls
	System.out.println(hold);
	
}
	


	
}
