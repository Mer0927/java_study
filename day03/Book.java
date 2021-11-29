package day03;

public class Book {
	
	private String name;
	private int price;
	private String writer;
	private String publisher;
	
		
	Book(String name, int price, String writer, String publisher){
		this.name = name;
		this.price = price;
		this.publisher = publisher;
		this.writer = writer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void printInfo() {
		System.out.println("도서명:"+name+", 가격:"+price);
		
	}
	

}


//도서관리 프로그램 제작
//책정보를 관리하는 기본 코드를 작성하세요
//책: 도서명, 가격, 저자명, 출판사
//조건: 변수는 private으로 지정, 변수별로 get/set 메서드를 제공
//       printInfo()를 통해 모든 변수를 출력한다
//
//책테스트 클래스를 작성
//1. 2권의 책 객체를 생성
//2. 각 객체의 전체정보를 출력하시오( printInfo() 호출 )
//3. 각 객체의 도서명과 가격을 출력하시오.(
//      System.out.println(도서명추출함수  가격추출함수)
