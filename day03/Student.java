package day03;

public class Student {

	//멤버변수(필드)
	private String name;
	private int hakbun;

	Student(String name, int num){ //생성자 함수
		this.name = name;
		this.hakbun = num;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHakbun() {
		return hakbun;
	}

	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}

	void printInfo(){
		System.out.println("name:"+name+", s_number:"+hakbun);
	}



}//end class
