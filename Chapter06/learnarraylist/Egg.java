import java.util.ArrayList;

public class Egg{
	public static void main(String[] args) {
		// making an ArrayList
		ArrayList<Egg> myList = new ArrayList<Egg>();
		// putting eggs in the ArrayList
		Egg egg1 = new Egg();
		myList.add(egg1);
		Egg egg2 = new Egg();
		myList.add(egg2);
		System.out.println(myList);
		// Find out how many eggs
		int theSize = myList.size();
		System.out.println(theSize);
		// Find out where something is (index)
		int idx = myList.indexOf(egg2);
		System.out.println(idx);
		// Find out if it's empty
		boolean empty = myList.isEmpty();
		// Remove something from it
		myList.remove(egg1);
		System.out.println(myList);
	}
}