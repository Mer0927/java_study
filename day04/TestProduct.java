package day04;

public class TestProduct {

	public static void main(String[] args) {
		
		Product[] products = new Product[100];
		int count = 0;
		products[count++] = new Product("냉장고", 100, "삼성");
		products[count++] = new Product("세탁기", 110, "LG");
		products[count++] = new Product("김치냉장고", 120, "만도");
		
		
		//전체정보 출력
		System.out.println("*** 전체정보출력 ***");
		for(int i=0; i<count; i++) {
			products[i].printInfo();
		}
		
		//수정
		String product = "김치냉장고";
		int findIndex = -1;
		for(int i=0; i<count; i++) {
			if(products[i].getName() == product) {
				findIndex = i;
				break;
			}
		}
		if(findIndex == -1) {
			System.out.println(product+" 검색실패!");
		} else {
			products[findIndex].setPrice(130);
		}
		
		//전체정보출력
		System.out.println("*** 전체정보출력 ***");
		for(int i=0; i<count; i++) {
			products[i].printInfo();
		}
		
		//삭제
		product = "세탁기";
		findIndex = -1;
		for(int i=0; i<count; i++) {
			if(products[i].getName() == product) {
				findIndex = i;
				break;
			}
		}
		if(findIndex == -1) {
			System.out.println(product+" 검색실패!");
		} else {
			products[findIndex] = products[count-1];
			products[count-1] = null;
			count--;
		}
	
		//전체정보출력
		System.out.println("*** 전체정보출력 ***");
		for(int i=0; i<count; i++) {
			products[i].printInfo();
		}
		
	}
	
}
