package day03;

public class Student {

	//�������(�ʵ�)
	private String name;
	private int hakbun;

	Student(String name, int num){ //������ �Լ�
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
