import java.util.ArrayList;

public class countUnique {
	public static int uniqueCounter(ArrayList<String> elements) {
		
		int counter = 0;
		for (int i = 0; i < elements.size(); i++)
		{
			int j;
			for (j = 0; j < i; j++)
			{
				if (elements.get(i).equals(elements.get(j))){
					break;
            }
		
	}
			if (j == i) {
				counter++;
			}
		}
		return counter;
	}
	public static void main(String[] args) {
		ArrayList<String> elements = new ArrayList<>();
		elements.add("Gold");
		elements.add("Silver");
		elements.add("Boron");
		elements.add("Gold");
		elements.add("Hydrogen");
		elements.add("Helium");
	
	System.out.println("There are a total of " + uniqueCounter(elements)+ " unique elements");
	}
}

