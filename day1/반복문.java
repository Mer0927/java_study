package day1;

public class �ݺ��� {

	public static void main(String[] args) {
		// for  ����ο� ����, ����, ���� ����
		// 1 ~ 5���� ���
		// 1~5���� ¦���� �� ���
		
//		for (int i=1; i<=5; i++) {
//			System.out.println(i);
//		}
		int sum = 0;
		for (int i=1; i<=5; i++) {
			if(i%2==0) {
				sum = sum + 1;
			}
		}
		System.out.println("¦�� ��="+sum);
		
		// ������
		// 3�ܸ� ���
		int dan = 3;
		for (int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		//2~9��
		for(dan=2; dan<=9; dan++) {
			System.out.println("*** "+dan+"�� ***");
			for (int i=1; i<=9; i++) {
				System.out.println(dan+"*"+i+"="+(dan*i));
			}
		}
		
		// while��
		int dan3 = 3;
		int i3 = 1;
		while(i3<=9) {
			System.out.println(dan3+"*"+i3+"="+(dan3*i3));
			i3++;
		}
		
	}//end main
}//end class
