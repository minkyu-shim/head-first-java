public class DogTestDrive {
	public static void main(String[] args) {
		Dog fido = new Dog();
		fido.name = "Fido";
		
		fido.bark();
		fido.chaseCat();
		
		Dog[] myDogs = new Dog[3];
		
		myDogs[0] = new Dog();
		myDogs[0].name = "Coon";
		myDogs[0].bark();
		myDogs[1] = new Dog();
		myDogs[2] = new Dog();
	}
}