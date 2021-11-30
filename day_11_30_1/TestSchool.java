package day_11_30_1;

public class TestSchool {

	public static void main(String[] args) {
		//학생정보: Student 이름, 전화번호, 학과
		//직원정보: Emp 이름, 전화번호, 부서
		
		//학생과 직원 공통변수는 Person: 이름, 전화
		//학생: 학과
		//직원: 부서
		
		Student st1 = new Student("홍길동","111-222","컴공");
		st1.printInfo();
		
		Emp e1 = new Emp("김대리","111-223","총무부"); //name, tel, dept
		e1.printInfo();
		
		/////////////////
		Person p1 = st1;
		System.out.println("p1="+p1);
		System.out.println("st1="+st1);
		
		System.out.println("Hakgwa="+st1.getHakgwa());
//		System.out.println("Hakgwa="+p1.getHakgwa());
		
		p1 = e1;
	
	}//end main

}//end class
