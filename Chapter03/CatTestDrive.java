// CatTestDrive.java
public class CatTestDrive {
    public static void main(String[] args) {
        Cat tom = new Cat("Tom", 8.5, 5);

        tom.meow();
        tom.eat();

        System.out.println("Is " + tom.getName() + " fat? " + tom.isFat());
        System.out.println("Age status: " + tom.isOld());
    }
}
