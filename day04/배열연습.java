package day04;

public class 배열연습 {

	public static void main(String[] args) {
		int[] scores = new int[2];
		int[][] scores2 = new int[2][3];
		
		System.out.println(scores2); // 1차원 배열의 위치값
		System.out.println(scores2[0]); // 2차원 배열 첫번째의 주소
		System.out.println(scores2[1]); // 2차원 배열 두번째의 주소
		System.out.println("scores2[0][0]"+scores2[0][0]);
		
		//아래 작업의 축약버전이지만 이렇게 하는경우는 극히 드뭄
		int[] scores3 = {70, 90, 80}; //생성, 초기화까지 한꺼번에 처리
		System.out.println(scores3[0]+", "+scores3[1]+", "+scores3[2]);
		
		//대부분 작업코드
		int[] scores4 = new int[3];
		scores4[0] = 70;
		scores4[1] = 80;
		scores4[2] = 90;
		
		// ************ 2차원배열 ************ // 게시판을 만들때 쓰이진 않고, 주로 보드게임을 만들 때 쓰임.
		
		int[][] scores5 = {
				{1, 3, 5},
				{2, 4, 6}
		}; //2행 3열
		System.out.println(scores5[0][0]);
		System.out.println(scores5[0][1]);
		System.out.println(scores5[0][2]);
		System.out.println(scores5[1][0]);
		System.out.println(scores5[1][1]);
		System.out.println(scores5[1][2]);
		
		
		////일기 저장하기
		String[] diary = new String[365];
		//1월1일
		int month = 1;
		int day = 1;
		diary[(month-1)*31 + (day-1)] = "오늘은 1월 1일.";
		
		month = 11;
		day = 25;
		diary[(month-1)*31 + (day-1)] = "오늘은 11월 25일.";
		
		//일기는 2차원형식이 편함
		String[][] diary2 = new String[12][31];
		diary2[0][0] = "오늘은 1월 1일";
		diary2[10][24] =  "오늘은 11월 25일";
		
		
	}

}
