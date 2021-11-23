package day01;

public class 변수연습 {

	public static void main(String[] args) {
		int age = 30;
		String name = "박하은";
		System.out.println( name );
		// 아래에 age 변수의 값을 출력하는 코드 작성
		System.out.println( age );
		// 문자열 사이에 넣는 + 는 문자열간의 연결이다.
		System.out.println( name + "의 나이는 " + age + "입니다.");
		
		age = age + 1;
		System.out.println( name + "의 나이는 " + age + "입니다.");
		
		age = age - 5;
		System.out.println( name + "의 나이는 " + age + "입니다.");
		
	}

}
