package prj211129;

public class TestProduct2 {

	public static void main(String[] args) {
		//데이터 저장에 관련된 변수와 함수를 따로 클래스로 묶기 -> XXXManager
		ProductManager pm = new ProductManager(); //배열과 count 포함
		
		Product p = new Product("냉장고", "삼성", 100);
		System.out.println(p);
		pm.add(p);
		p = new Product("세탁기", "LG", 110);
		pm.add(p);
		p = new Product("김치냉장고", "만도", 120);
		pm.add(p);
		
		System.out.println("*** 저장갯수: "+pm.getCount()+" ***");
		
		System.out.println("** 전체출력 **");
		pm.printAll(); //저장된 모든 데이터 출력
		
		// "세탁기" 찾아서 가격 > 130으로 수정
		String findName = "냉장고";
		int findIndex = pm.findByName(findName);
		if(findIndex == -1) {
			System.out.println(findName+" 검색실패");
		} else {
			System.out.println(findName+" 검색성공");
		}

	}

}
