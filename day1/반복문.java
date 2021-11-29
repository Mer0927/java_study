package day1;

public class 반복문 {

	public static void main(String[] args) {
		// for  선언부에 시작, 조건, 증감 포함
		// 1 ~ 5까지 출력
		// 1~5사이 짝수의 합 출력
		
//		for (int i=1; i<=5; i++) {
//			System.out.println(i);
//		}
		int sum = 0;
		for (int i=1; i<=5; i++) {
			if(i%2==0) {
				sum = sum + 1;
			}
		}
		System.out.println("짝수 합="+sum);
		
		// 구구단
		// 3단만 출력
		int dan = 3;
		for (int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		//2~9단
		for(dan=2; dan<=9; dan++) {
			System.out.println("*** "+dan+"단 ***");
			for (int i=1; i<=9; i++) {
				System.out.println(dan+"*"+i+"="+(dan*i));
			}
		}
		
		// while문
		int dan3 = 3;
		int i3 = 1;
		while(i3<=9) {
			System.out.println(dan3+"*"+i3+"="+(dan3*i3));
			i3++;
		}
		
	}//end main
}//end class
