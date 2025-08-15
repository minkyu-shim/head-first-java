// Cat.java
public class Cat {
    private String name;
    private double weight; // kg
    private int age;       // years

    public Cat(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void meow() {
        System.out.println(name + " is meowing");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public boolean isFat() {
        return weight > 10.0;
    }

    public String isOld() {
        if (age > 7) return name + " is old";
        if (age > 1) return name + " is an adult cat";
        return name + " is a baby cat";
    }

    public String getName() { return name; }
    public double getWeight() { return weight; }
    public int getAge() { return age; }
}
