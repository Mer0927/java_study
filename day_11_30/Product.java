package day_11_30;

public class Product {

	private int no;
	private String name;
	private String factory;
	private int price;
	private int qnt;

	public Product(int no, String name, String factory, int price, int qnt) {
		this.no = no;
		this.name = name;
		this.factory = factory;
		this.price = price;
		this.qnt = qnt;
	}
	
	public Product() {
	}

	//getter, setter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	
	//printInfo
	public void printInfo() {
		System.out.println(no+". "+name+" - "+factory+" - "+price+" - "+qnt);
	}

}//end class
