package day03;

public class TestBook {

	public static void main(String[] args) {
		Book b1 = new Book("ABC", 20000, "ȫ�浿", "xxx");
		b1.setName("ABCD");
		b1.setPrice(25000);
		b1.printInfo();
		Book b2 = new Book("abc", 15000, "��ö��", "yyy");
		b2.setName("abcd");
		b2.setPrice(20000);
		b2.printInfo();
		
		System.out.println(b1.getName()+"�� ������ "+b1.getPrice());
		System.out.println(b2.getName()+"�� ������ "+b2.getPrice());
		
	}

}
