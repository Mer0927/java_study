package day03;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿", 1122);
		s1.setName("���浿");
		s1.setHakbun(1234);
		s1.printInfo();
		Student s2 = new Student("��浿",2233);
		s2.printInfo();
		
		System.out.println(s1.getName()+"�� �й��� "+s1.getHakbun());
		

	}

}
