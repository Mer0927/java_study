package day03;

public class Car {
	
	//�������(�ʵ�)
	String type;
	String name;
	double cc; //��ⷮ

	Car(String type, String name){
		this(type, name, 0);
	}
	
	Car(String type, String name, double cc){ //������ �Լ�
		this.type = type;
		this.name = name;
		this.cc = cc;
		
	}
	
	//����Ÿ�� �̸�()
	void printInfo(){
		System.out.println("type:"+type+", name:"+name+", cc:"+cc);
	}
	

}
