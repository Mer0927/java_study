package day1;

import java.util.Scanner;

public class ���ڸ��߱� {

	public static void main(String[] args) {
		// ����� 1~100���� ��ǻ�� ������ ���纸��
		// ��ǻ�Ͱ� ������ ���� ����. ����ڰ� �� ����(Ű���带 ���� �Է�)
		// ��ǻ�Ͱ� ������ ���� ������ ���ؼ� "�����ּ���", "�����ּ���", "�����Դϴ�"�� ���
		double r = Math.random(); 
		r = r*100; //0.0~0.99999...
		int ri = (int)r; //0~99
		ri = ri+1; //1~100
		System.out.println(r);
		System.out.println(ri);
		
//		int ri2 = (int)(Math.random()*100+1);
//		System.out.println(ri2);
		Scanner sc = new Scanner(System.in);
		while(true) {//���ѹݺ�
			System.out.println("1~100���� ���ڸ� �Է�>>");
			int num = sc.nextInt(); // Ű���忡�� �Է��� ���� �б�
			
			//���ں�
			if(ri == num) {
				System.out.println("������~~ �����Դϴ�!");
				break;
			} else if(ri<num) {
				System.out.println("�����ּ���");
			} else {
				System.out.println("�����ּ���");
			}
			
		}
		System.out.println("���� ����");
		
	} //end main

} //end class
