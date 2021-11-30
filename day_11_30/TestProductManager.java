package day_11_30;

import java.util.Scanner;

public class TestProductManager {

	static Scanner sc = new Scanner(System.in); //키보드에서 값 입력용
	
	static Product[] parr = new Product[2000]; //상품정보 저장용
	static int count = 0; //상품정보 갯수 저장용

	public static void main(String[] args) {
		
		//키보드 입력 처리 객체 생성
		while(true) { //무한반복
			printMainMenu(); //메인메뉴 출력
			int menuNo = Integer.parseInt(sc.nextLine()); //키보드에서 숫자 읽기
			if(menuNo == 99) {
				break; //반복종료 - 프로그램 종료
			}
			if(menuNo == 1) {
				registProduct(); //상품등록
			} else if(menuNo ==2) {
				printAll(); //모든 상품정보 출력
			}
			
		}//end while
		System.out.println("** 프로그램 종료 **");

	}//end main
	
	/** 모든 상품정보 출력 */
	private static void printAll() {
		System.out.println("*** 상품정보 전체출력 ***");
		System.out.println("< 상품정보 - 상품이름 - 제조사 - 가격 - 수량 >");
		for(int i=0; i<count; i++) {
			parr[i].printInfo();
		}//end for
		
	}//end printAll

	/** 상품등록 */
	private static void registProduct() {
		System.out.println("상품번호 입력 >> ");
		int no = Integer.parseInt(sc.nextLine()); //문자열읽기
		System.out.println("상품이름 입력 >> ");
		String name = sc.nextLine(); //문자열읽기
		System.out.println("상품제조사 입력 >> ");
		String factory = sc.nextLine(); //문자열읽기
		System.out.println("상품가격 입력 >> ");
		int price = Integer.parseInt(sc.nextLine()); //문자열읽기
		System.out.println("상품수량 입력 >> ");
		int qnt = Integer.parseInt(sc.nextLine()); //문자열읽기
		
		//다른 타입의 정보를 모아서 관리하기 위해 클래스 정의하고 객체를 만들어 저장
		Product p = new Product(no, name, factory, price, qnt);
		parr[count++] = p;
	
	}//end registProduct
	

	/** 메인메뉴 출력 */
	private static void printMainMenu() {
		System.out.println("(1)상품등록  (2)상품목록  (3)상품검색 - 상세, 수정, 삭제  (99)종료");
		System.out.println("번호입력 >> ");
	}
	
}//end class
