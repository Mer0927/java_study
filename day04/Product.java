package day04;

public class Product {
	
	private String name, made;
	private int price;
	
	public Product(String name, int price, String made){
		this.name = name;
		this.price = price;
		this.made = made;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMade() {
		return made;
	}

	public void setMade(String made) {
		this.made = made;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void printInfo() {
		System.out.println("P_name:"+name+", price:"+price+", made:"+made);
	}
	
}
