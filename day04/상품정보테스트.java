package day04;

public class 상품정보테스트 {

	public static void main(String[] args) {
		//상품 정보를 저장할 배열객체 생성
		MyProduct[] pa = new MyProduct[100];
		int count = 0; //저장갯수 관리용
		//
		pa[count++] = new MyProduct("냉장고", "삼성", 100);
		pa[count++] = new MyProduct("세탁기", "LG", 110);
		pa[count++] = new MyProduct("김치냉장고", "만도", 120);
		
	}//end main

}//end class
