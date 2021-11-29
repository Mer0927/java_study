package school;

public class TestSchool {

	public static void main(String[] args) {
		// 학교정보 관리기능 구현
		// 학생: 이름, 주번, 전화, 주소, 이메일, 학번, 학과
		// 직원: 이름, 주번, 전화, 주소, 이메일, 사번, 부서
		// 교수: 이름, 주번, 전화, 주소, 이메일, 교번, 연구실주소
		
//		Person p1 = new Person("김길동", 1113); //이름, 번호
		Mystudent ms1 = new Mystudent("김길동", 1113, "컴공"); //학생 = Person + 학과
		ms1.printInfo();

		MyEmp me1 = new MyEmp("박대리", 9011, "총무부"); //직원 = Person + 부서
		me1.printInfo(); //박대리, 9011, 총무부
		
		MyTeacher mt1 = new MyTeacher("최교수", 88013, "연구동 103호"); //교수 = Person + 연구실 주소
		mt1.printInfo(); //최교수, 88013, 연구동 103호

	}//end main
}//end class