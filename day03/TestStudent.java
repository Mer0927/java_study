package day03;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 1122);
		s1.setName("강길동");
		s1.setHakbun(1234);
		s1.printInfo();
		Student s2 = new Student("김길동",2233);
		s2.printInfo();
		
		System.out.println(s1.getName()+"의 학번은 "+s1.getHakbun());
		

	}

}
