package prj211129;

public class TestProduct {

	public static void main(String[] args) {
		//Product 클래스 테스트 코드
		//Product 배열
		Product[] parr = new Product[100];
		int count = 0;
		Product p = new Product("냉장고", "삼성", 100);
		parr[count++] = p;
		p = new Product("세탁기", "LG", 110);
		parr[count++] = p;
		parr[count++] = new Product("김치냉장고", "만도", 120);
		System.out.println("저장갯수="+count);
		
		System.out.println("*** 전체출력 ***");
		for(int i=0; i<count; i++) {
			parr[i].printInfo();
		}
		
		//"김치냉장고"를 찾아서 가격 130으로 변경
		System.out.println("*** 김치냉장고 가격변경 ***");
		int findIndex = -1;
		String findName = "김치냉장고";
		for(int i=0; i<count; i++) {
			Product pr = parr[i];
			if(pr.getName() == findName) {
				findIndex = i;
				break;
			}
		}
		if(findIndex == -1) {
			System.out.println(findName+" 검색실패");
		} else {
			System.out.println(findName+" 검색성공");
			parr[findIndex].setPrice(130);
		}
		
		System.out.println("*** 전체출력 ***");
		for(int i=0; i<count; i++) {
			parr[i].printInfo();
		}

		//"세탁기"를 찾아서 가격 130으로 변경
		System.out.println("*** 세탁기 삭제 ***");
		findIndex = -1;
		findName = "세탁기";
		for(int i=0; i<count; i++) {
			Product pr = parr[i];
			if(pr.getName() == findName) {
				findIndex = i;
				break;
			}
		}
		if(findIndex == -1) {
			System.out.println(findName+" 검색실패");
		} else {
			System.out.println(findName+" 검색성공");
			//정보삭제
			parr[findIndex] = parr[count-1]; //마지막정보를 삭제하려는 위치에 덮어씌우기
			parr[count-1] = null; //마지막정보삭제
			count--; //갯수감소
		}
		
		System.out.println("*** 전체출력 ***");
		for(int i=0; i<count; i++) {
			parr[i].printInfo();
		}
	}

}
