package day03;

public class TestCar {

	public static void main(String[] args) {
		Car c1 = new Car("cuv","캐스퍼");
		c1.printInfo();
//		System.out.println(c1);
//		System.out.println(c1.name+"의 배기량은 "+c1.cc);
		
		Car c2 = new Car("suv","소렌토",1.6);
		c2.printInfo();
		
	}

}
