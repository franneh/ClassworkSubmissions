public class TwoDArrTrav {

	public static void main(String[] args) {
		
		
		String [][] name = {{"Alice", "Bob", "Stacy", "Kai", "John", "Carl", },
				{"Charlie", "David", "Hammah", "Bob", "Duke", "Fanum"},
				{"Ella", "Fiona", "Cris", "Dillon", "Keola", "Taryn"},
				{"Kaitlyn", "Kam", "Kira", "Len", "Tyler", "Fran"},
				{"Luke", "Micah", "Ian", "Taum", "Vaughn", "Jhase"},
				{"Paige", "Emma", "Calissa", "Reese", "Maila", "Maile"},
				{"Abby", "Nua", "Kennedy", "Lacey", "Mimi", "Rylee"}};
			
		for(int i = 0; i < name.length; i++)
		{
			System.out.println(name [i][0]);
			
		}
		
		for(int i = 0; i < name[0].length; i++)
		{
			System.out.println(name [0][i]);
		}
		
		for (int i = 0; i < name.length; i++)
		{
			for (int j = 0; j < name[0].length; i++)
			{
				System.out.println(name[i] [j]);
			}
		}
		
		
		
		}
		
		
		

	}


