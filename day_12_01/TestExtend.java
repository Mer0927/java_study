package day_12_01;

public class TestExtend {

	public static void main(String[] args) {
		B b1 = new B();
		b1.name = "홍길동";
		b1.age = 30;
		
		C c1 = new C();
		c1.name = "김길동";
		c1.tel = "111-222";
		
		A a1 = c1; //부모티입 변수에 자식객체 저장  / Up-Casting
		a1.name = "박길동";
		System.out.println("a1.getInfo() "+a1.getInfo());
		//호출하는 메서드를 실제 객체가 재정의 하고 있으면 재정의된 예시도 호출함.
		
		A a2 = c1;
		System.out.println("a2.getInfo() "+a2.getInfo());
		
		//나이변경시 B타입확인하고 형변환 후 age수정
		System.out.println(a1 instanceof B); //true
		System.out.println(a1 instanceof C); //false
		if(a1 instanceof B) {
			System.out.println("a1은 B타입");
			B b2 = (B)a1; // Down-Casting
			b2.age = 35;
		}
		if(a1 instanceof C) {
			System.out.println("a1은 C타입");
			C c2 = (C)a1;
			c2.tel = "222-333";
		}

		//메서드 재정의
		
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
	public String getInfo() { //모든 변수정보 출력 
		return "name="+name;
	}
}

class B extends A {
	int age;
	public String getInfo() { //모든 변수정보 출력 
		return super.getInfo()+", "+age;
	}
	
}

class C extends A {
	String tel;
	public String getInfo() { //모든 변수정보 출력 
		return super.getInfo()+", "+tel;
	}
}
	
