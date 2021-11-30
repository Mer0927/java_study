package day_11_30;

import java.util.Scanner;

public class TestProductManager {

	static Scanner sc = new Scanner(System.in); //Ű���忡�� �� �Է¿�
	
	static Product[] parr = new Product[2000]; //��ǰ���� �����
	static int count = 0; //��ǰ���� ���� �����

	public static void main(String[] args) {
		
		//Ű���� �Է� ó�� ��ü ����
		while(true) { //���ѹݺ�
			printMainMenu(); //���θ޴� ���
			int menuNo = Integer.parseInt(sc.nextLine()); //Ű���忡�� ���� �б�
			if(menuNo == 99) {
				break; //�ݺ����� - ���α׷� ����
			}
			if(menuNo == 1) {
				registProduct(); //��ǰ���
			} else if(menuNo ==2) {
				printAll(); //��� ��ǰ���� ���
			}
			
		}//end while
		System.out.println("** ���α׷� ���� **");

	}//end main
	
	/** ��� ��ǰ���� ��� */
	private static void printAll() {
		System.out.println("*** ��ǰ���� ��ü��� ***");
		System.out.println("< ��ǰ���� - ��ǰ�̸� - ������ - ���� - ���� >");
		for(int i=0; i<count; i++) {
			parr[i].printInfo();
		}//end for
		
	}//end printAll

	/** ��ǰ��� */
	private static void registProduct() {
		System.out.println("��ǰ��ȣ �Է� >> ");
		int no = Integer.parseInt(sc.nextLine()); //���ڿ��б�
		System.out.println("��ǰ�̸� �Է� >> ");
		String name = sc.nextLine(); //���ڿ��б�
		System.out.println("��ǰ������ �Է� >> ");
		String factory = sc.nextLine(); //���ڿ��б�
		System.out.println("��ǰ���� �Է� >> ");
		int price = Integer.parseInt(sc.nextLine()); //���ڿ��б�
		System.out.println("��ǰ���� �Է� >> ");
		int qnt = Integer.parseInt(sc.nextLine()); //���ڿ��б�
		
		//�ٸ� Ÿ���� ������ ��Ƽ� �����ϱ� ���� Ŭ���� �����ϰ� ��ü�� ����� ����
		Product p = new Product(no, name, factory, price, qnt);
		parr[count++] = p;
	
	}//end registProduct
	

	/** ���θ޴� ��� */
	private static void printMainMenu() {
		System.out.println("(1)��ǰ���  (2)��ǰ���  (3)��ǰ�˻� - ��, ����, ����  (99)����");
		System.out.println("��ȣ�Է� >> ");
	}
	
}//end class
