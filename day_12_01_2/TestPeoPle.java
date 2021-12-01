package day_12_01_2;

public class TestPeoPle {

	public static void main(String[] args) {
		
		사람[] parr = new 사람[1000];
		int count = 0;
		parr[count++] = new 직원("홍길동", "111-222", "010-111", "총무부");
		parr[count++] = new 직원("김길동", "111-333", "010-222", "관리부");
		parr[count++] = new 강사("박길동", "111-444", "010-223", "자바");
		parr[count++] = new 강사("이길동", "111-555", "010-332", "파이썬");
		parr[count++] = new 수강생("최길동", "111-666", "010-443", "자바기본");
		parr[count++] = new 수강생("강길동", "111-777", "010-553", "파이썬중급");
		
		System.out.println("*** 전제정보 ***");
		System.out.println("총인원: "+count);
		for(int i=0; i<count; i++){
		   System.out.println(parr[i].getInfo());
		}//end for

	}//end main
	
}//end class

class 사람 {
	private String 이름;
	private String 주민번호;
	private String 전화;

	public 사람(String 이름, String 주민번호, String 전화) {
		this.이름 = 이름;
		this.주민번호 = 주민번호;
		this.전화 = 전화;
	}

	public 사람() {
	}

	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public String get주민번호() {
		return 주민번호;
	}

	public void set주민번호(String 주민번호) {
		this.주민번호 = 주민번호;
	}

	public String get전화() {
		return 전화;
	}

	public void set전화(String 전화) {
		this.전화 = 전화;
	}

	public String getInfo() {
		return 이름+", "+주민번호+", "+전화;
	}
	
}//end class 사람

class 직원 extends 사람 {

	private String 부서;

	public 직원(String 이름, String 주민번호, String 전화, String 부서) {
		super(이름, 주민번호, 전화);
		this.부서 = 부서;
	}

	public 직원() {
	}

	public String get부서() {
		return 부서;
	}

	public void set부서(String 부서) {
		this.부서 = 부서;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+", "+부서;
	}
	
}//end class 직원

class 강사 extends 사람{

	private String 강의과목;

	public 강사(String 이름, String 주민번호, String 전화, String 강의과목) {
		super(이름, 주민번호, 전화);
		this.강의과목 = 강의과목;
	}
	
	public 강사() {
	}

	public String get강의과목() {
		return 강의과목;
	}

	public void set강의과목(String 강의과목) {
		this.강의과목 = 강의과목;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+", "+강의과목;
	}
	
}//end class 강사

class 수강생 extends 사람{

	private String 수강과목;

	public 수강생(String 이름, String 주민번호, String 전화, String 수강과목) {
		super(이름, 주민번호, 전화);
		this.수강과목 = 수강과목;	
	}
	
	public 수강생() {
	}

	public String get수강과목() {
		return 수강과목;
	}

	public void set수강과목(String 수강과목) {
		this.수강과목 = 수강과목;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+", "+수강과목;
	}
		
}//end class 수강생
	