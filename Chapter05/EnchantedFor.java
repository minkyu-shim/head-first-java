public class EnchantedFor{
	public static void main(String[] args) {
		String[] names = new String[3];
		names[0] = "Alice";
		names[1] = "Bob";
		names[2] = "Charlie";
		
		for (String name : names) {
			System.out.println(name + " says hi");
		}
	}
}