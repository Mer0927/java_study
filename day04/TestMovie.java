package day04;

public class TestMovie {

	public static void main(String[] args) {
		Movie m1 = new Movie("����", "����ȣ", 300);
		m1.printInfo();
		Movie m2 = new Movie("��¡�����", "Ȳ����", 200);
		m2.printInfo();
		
		System.out.println("����:"+m1.getTitle()+", ����:"+m1.getDirector());
		System.out.println("����:"+m2.getTitle()+", ����:"+m2.getDirector());

	}

}
