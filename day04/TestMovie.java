package day04;

public class TestMovie {

	public static void main(String[] args) {
		Movie m1 = new Movie("지옥", "연상호", 300);
		m1.printInfo();
		Movie m2 = new Movie("오징어게임", "황동혁", 200);
		m2.printInfo();
		
		System.out.println("제목:"+m1.getTitle()+", 감독:"+m1.getDirector());
		System.out.println("제목:"+m2.getTitle()+", 감독:"+m2.getDirector());

	}

}
