package day1;

public class 배열연습 {

	public static void main(String[] args) {
		// 학생점수
		int score1 = 90;
		int score2 = 80;
		int score3 = 85;
		
		// 배열
		int[] scores = new int[3];
		System.out.println(scores);
		System.out.println(scores[0]);
		scores[0] = 90;
		scores[1] = 80;
		scores[2] = 85;
		
		int[] scores2 = {90,80,85};
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		
		int[] scores3 = new int[]{90,80,85};
		//재할당
//		scores2 = {80,90,80}; // 변수선언 할 때 사용
		scores3 = new int[] {50,80,90};

	}

}
