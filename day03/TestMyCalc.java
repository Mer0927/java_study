package day03;

public class TestMyCalc {

	public static void main(String[] args) {
		MyCalc mc = new MyCalc();
		mc.add(5); //누적기능
		mc.add(7);
		System.out.println(mc.getTotal());
		int r = mc.plus(5, 7); //두 숫자를 더한 결과를 받아오기
		int r2 = mc.add(5, 7);
		System.out.println(r);
		System.out.println(r2);

	}

}
