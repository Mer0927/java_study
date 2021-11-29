package day1;

import java.util.Scanner;

public class 숫자맞추기 {

	public static void main(String[] args) {
		// 저장된 1~100사이 컴퓨터 난수를 맞춰보기
		// 컴퓨터가 임의의 숫자 저장. 사용자가 값 제시(키보드를 통한 입력)
		// 컴퓨터가 제시한 값과 난수를 비교해서 "높여주세요", "낮춰주세요", "정답입니다"를 출력
		double r = Math.random(); 
		r = r*100; //0.0~0.99999...
		int ri = (int)r; //0~99
		ri = ri+1; //1~100
		System.out.println(r);
		System.out.println(ri);
		
//		int ri2 = (int)(Math.random()*100+1);
//		System.out.println(ri2);
		Scanner sc = new Scanner(System.in);
		while(true) {//무한반복
			System.out.println("1~100사이 숫자를 입력>>");
			int num = sc.nextInt(); // 키보드에서 입력한 숫자 읽기
			
			//숫자비교
			if(ri == num) {
				System.out.println("딩동댕~~ 정답입니다!");
				break;
			} else if(ri<num) {
				System.out.println("낮춰주세요");
			} else {
				System.out.println("높여주세요");
			}
			
		}
		System.out.println("게임 종료");
		
	} //end main

} //end class
