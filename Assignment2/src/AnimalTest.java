
public class AnimalTest {
	public static void main(String args[]) {
		Dog d = new Dog("PitBull", "Mocha", 6, "Male", "House", 30);
		Cat c = new Cat("Persian", "Mochi", 7, "Female", "House", 25);
		Whale w = new Whale("Beluga", "Mamu", 32, "Male", "Ocean", 60);
		Racoon r = new Racoon("Barbados", "Sniper", 14, "Female", "Forest", 25);

		System.out.println(d.getType() + " Age: " + d.getAge() + " Gender: " + d.getGender() + " Enviornment: " + d.getEnvironment() + " Miles per Hour: " + d.getSpeed());
		System.out.println("Dog: Hi my name is " + d.getName());
		System.out.println(d.sound());
		System.out.println(d.toString());
		System.out.println("As a domesticated dog, I can also " + d.walk() + " and " + d.greetHuman());
		System.out.println("I also " + d.swim());
		System.out.println();
		
		System.out.println(c.getType() + " Age: " + c.getAge() + " Gender: " + c.getGender() + " Enviornment: " + c.getEnvironment() + " Miles per Hour: " + c.getSpeed());
		System.out.println("Cat: Hi my name is " + c.getName());
		System.out.println(c.sound());
		System.out.println(c.toString());
		System.out.println("As a domesticated cat, I can also " + c.walk() + " and " + c.greetHuman());
		System.out.println("I also " + c.scratch());
		System.out.println();

		
		System.out.println(w.getType() + " Age: " + w.getAge() + " Gender: " + w.getGender() + " Enviornment: " + w.getEnvironment() + " Miles per Hour: " + w.getSpeed());
		System.out.println("Whale: Hi my name is " + w.getName());
		System.out.println(w.sound());
		System.out.println(w.toString());
		System.out.println("I also " + w.swim());
		System.out.println();

		
		System.out.println(r.getType() + " Age: " + r.getAge() + " Gender: " + r.getGender() + " Enviornment: " + r.getEnvironment() + " Miles per Hour: " + r.getSpeed());
		System.out.println("Racoon: Hi my name is " + r.getName());
		System.out.println(r.sound());
		System.out.println(r.toString());
		System.out.println("As a domesticated racoon, I can also " + r.walk() + " and " + r.greetHuman());
		System.out.println("I also " + r.swim() + " and " + r.scratch());
		System.out.println();
	}
}
