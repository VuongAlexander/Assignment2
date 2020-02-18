
public class Racoon extends Animal implements Domesticated, Swim{
	
	String type;
	String name;
	int age;
	String gender;
	String environment;
	int speed;
	
	public Racoon(String type, String name, int age, String gender, String environment, int speed) {
		this.type = type;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.environment = environment;
		this.speed = speed;
	}
	
	public String getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getEnvironment() {
		return environment;
	}
	public int getSpeed() {
		return speed;
	}
	
	/*public String setType(String type) {
		return this.type = type;
	}
	public String setName(String name) {
		return this.name = name;
	}
	public int setAge(int age) {
		return this.age = age;
	}
	public String setGender(String gender) {
		return this.gender = gender;
	}
	public String setEnvironment(String environment) {
		return this.environment = environment;
	}
	public int setSpeed(int speed) {
		return this.speed = speed;
	}*/
	
	public String sound() {
		return "Chitter";
	}
	
	public String scratch() {
		return "Scratch";
	}

	@Override
	public String swim() {
		return "Swim";
	}

	@Override
	public String walk() {
		return "Walk";
	}

	@Override
	public String greetHuman() {
		return "Greet Humans";
	}
}
