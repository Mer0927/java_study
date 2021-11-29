package prj211129;

public class Product {
	private String name, factory;
	private int price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String name, String factory, int price) {
		super();
		this.name = name;
		this.factory = factory;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	/** 가지고 있는 모든 변수값을 출력 */
	public void printInfo() {
		System.out.println("name="+name+", factory="+factory+", price="+price);
	}

}
