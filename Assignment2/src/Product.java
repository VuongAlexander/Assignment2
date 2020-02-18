
public class Product {
	
	String name;
	String description;
	double price;
	int quantity;
	
	public Product(String name, String description, double price, int quantity) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Getters
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int quantity() {
		return quantity;
	}
	
	public String toString(){
		return name + " " + description + " " + price + " " + quantity;
	}
}
