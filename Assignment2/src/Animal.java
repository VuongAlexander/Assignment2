
public class Animal{
	
	public static String move() {
		return "Move";
	}
	
	public String sound() {
		return "...";
	}
	
	public String eat() {
		return "Eat";
	}
	
	public String sleep() {
		return "Sleep";
	}
	
	public String toString() {
		return ("I can " + move() + ", " + sound() + ", " + eat() + ", and " + sleep());
	}
}
