package day1;

public class 조건문 {

	public static void main(String[] args) {
		int a = 101;
		// 짝수 홀수 판정
		if ( a%2 == 0 ) { // 나머지가 0이면
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	// 학점계산
		int score = 92;
		if( score >= 90 ) {
			System.out.println("A");
		} else if( score >= 80 ) {
			System.out.println("B");
		} else if( score >= 70 ) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		
		/// switch 문
		int 평점 = 4; //1~5
		switch(평점) {
		case 5:
			System.out.println("아주잘함");
			break;
		case 4:
			System.out.println("잘함");
			break;
		case 3:
			System.out.println("보통");
			break; //break를 쓰지 않으면 만날때까지 실행하기 때문에 필요할때는 꼭 써주기
		}
		
		
	} // end main

} //end class
