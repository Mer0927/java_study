package day03;

public class TestMyCalc {

	public static void main(String[] args) {
		MyCalc mc = new MyCalc();
		mc.add(5); //�������
		mc.add(7);
		System.out.println(mc.getTotal());
		int r = mc.plus(5, 7); //�� ���ڸ� ���� ����� �޾ƿ���
		int r2 = mc.add(5, 7);
		System.out.println(r);
		System.out.println(r2);

	}

}
