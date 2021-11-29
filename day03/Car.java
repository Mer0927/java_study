package day03;

public class Car {
	
	//멤버변수(필드)
	String type;
	String name;
	double cc; //배기량

	Car(String type, String name){
		this(type, name, 0);
	}
	
	Car(String type, String name, double cc){ //생성자 함수
		this.type = type;
		this.name = name;
		this.cc = cc;
		
	}
	
	//리턴타입 이름()
	void printInfo(){
		System.out.println("type:"+type+", name:"+name+", cc:"+cc);
	}
	

}
