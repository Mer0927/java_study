package day03;

public class TestProduct {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.name = "블투 스피커";
		p1.no = 12341234;
		p1.price1 = 89000;
		
		System.out.println(p1.name + "의 가격은 " + p1.price1);
		
		Product p2 = new Product();
		p2.name = "PC 스피커";
		p2.no = 23452345;
		p2.price1 = 50000;

		System.out.println(p2.name + "의 가격은 " + p2.price1);
		
	}

}
