package day1;

public class 배열연습2 {

	public static void main(String[] args) {
		// 산악동호회 회원정보 관리
		String[] names = new String[3]; //이름 저장용
		int[] ages = new int[3]; //나이 저장용
		System.out.println(names[0]);
		System.out.println(ages[0]);
		
		String s = "홍";
		int age = 30;
		
		String s1 = "김";
		int age1 = 35;
		
		names[0] = "홍길동";
		ages[0] = 30;
		
		names[1] = "김길동";
		ages[1] = 35;
		
		System.out.println(names[0]+" "+ages[0]+"세");
		System.out.println(names[1]+" "+ages[1]+"세");
		System.out.println(names[2]+" "+ages[2]+"세");

	}

}
