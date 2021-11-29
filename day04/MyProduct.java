package day04;

/** 상품정보 정의용 클래스 */
public class MyProduct {
	
	private String name, factory;
	private int price;
	
	//
	public MyProduct(String name, String factory, int price) {
		super();
		this.name = name;
		this.factory = factory;
		this.price = price;
	}

	//
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

	//
	public void printInfo() {
		System.out.println("name:"+name+", factory:"+factory+", price:"+price);
	}
	
}
