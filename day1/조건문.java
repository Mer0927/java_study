package day1;

public class ���ǹ� {

	public static void main(String[] args) {
		int a = 101;
		// ¦�� Ȧ�� ����
		if ( a%2 == 0 ) { // �������� 0�̸�
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
	// �������
		int score = 92;
		if( score >= 90 ) {
			System.out.println("A");
		} else if( score >= 80 ) {
			System.out.println("B");
		} else if( score >= 70 ) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		
		/// switch ��
		int ���� = 4; //1~5
		switch(����) {
		case 5:
			System.out.println("��������");
			break;
		case 4:
			System.out.println("����");
			break;
		case 3:
			System.out.println("����");
			break; //break�� ���� ������ ���������� �����ϱ� ������ �ʿ��Ҷ��� �� ���ֱ�
		}
		
		
	} // end main

} //end class
