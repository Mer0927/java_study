package day_11_30_2;

/** �������� ���� ���� */
public class TestShape {

	public static void main(String[] args) {
		Line l1 = new Line("black", 3, 3, 9, 9); //x1, y1, x2, y2 ��ǥ��
		System.out.println(l1.getInfo());
		
		Circle c1 = new Circle("blue", 3, 4, 12); //x1, y1, ������
		System.out.println(c1.getInfo());

//		Shape[] sarr = new Shape[1000];
//		sarr[0] = l1;
//		sarr[1] = c1;
	}

}
