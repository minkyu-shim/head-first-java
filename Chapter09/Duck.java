public class Duck extends Animal {
	String name;
	int size;
	
	public Duck(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	
	public void Walk() {
		System.out.println(this.name + " is walking");
	}
}