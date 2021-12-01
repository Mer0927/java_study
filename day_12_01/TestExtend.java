package day_12_01;

public class TestExtend {

	public static void main(String[] args) {
		B b1 = new B();
		b1.name = "ȫ�浿";
		b1.age = 30;
		
		C c1 = new C();
		c1.name = "��浿";
		c1.tel = "111-222";
		
		A a1 = c1; //�θ�Ƽ�� ������ �ڽİ�ü ����  / Up-Casting
		a1.name = "�ڱ浿";
		System.out.println("a1.getInfo() "+a1.getInfo());
		//ȣ���ϴ� �޼��带 ���� ��ü�� ������ �ϰ� ������ �����ǵ� ���õ� ȣ����.
		
		A a2 = c1;
		System.out.println("a2.getInfo() "+a2.getInfo());
		
		//���̺���� BŸ��Ȯ���ϰ� ����ȯ �� age����
		System.out.println(a1 instanceof B); //true
		System.out.println(a1 instanceof C); //false
		if(a1 instanceof B) {
			System.out.println("a1�� BŸ��");
			B b2 = (B)a1; // Down-Casting
			b2.age = 35;
		}
		if(a1 instanceof C) {
			System.out.println("a1�� CŸ��");
			C c2 = (C)a1;
			c2.tel = "222-333";
		}

		//�޼��� ������
		
		A[] arr = new A[3];
		arr[0] = b1;
		arr[1] = c1;
		arr[2] =new B();
		for(int i=0; i<arr.length; i++) {
			System.out.println("i="+i+" "+arr[i].getInfo());
		}

	}//end main

}//end class

class A {
	String name;
	public String getInfo() { //��� �������� ��� 
		return "name="+name;
	}
}

class B extends A {
	int age;
	public String getInfo() { //��� �������� ��� 
		return super.getInfo()+", "+age;
	}
	
}

class C extends A {
	String tel;
	public String getInfo() { //��� �������� ��� 
		return super.getInfo()+", "+tel;
	}
}
	
