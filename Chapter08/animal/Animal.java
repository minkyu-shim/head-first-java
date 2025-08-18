public abstract class Animal {
	private String name;
	private String food;
	private int hunger;
	private int[] boundaries;
	private int[] location;
	
	public void makeNoise() {
		System.out.println("animal sound");
	}
	
	public void eat() {
		System.out.println("animal eats");
	}
	
	public void sleep() {
		System.out.println("animal sleeps");
	}
	
	public void roam() {
		System.out.println("animal roams");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}