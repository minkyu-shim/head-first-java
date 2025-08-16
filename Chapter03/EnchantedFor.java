public class EnchantedFor{
	public static void main(String[] args) {
		String[] names = new String[3];
		String[0] = "Alice";
		String[1] = "Bob";
		String [2] = "Charlie";
		
		for (String name : names) {
			System.out.println(name + " says hi");
		}
	}
}