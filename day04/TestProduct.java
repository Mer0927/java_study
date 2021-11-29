package day04;

public class TestProduct {

	public static void main(String[] args) {
		
		Product[] products = new Product[100];
		int count = 0;
		products[count++] = new Product("�����", 100, "�Ｚ");
		products[count++] = new Product("��Ź��", 110, "LG");
		products[count++] = new Product("��ġ�����", 120, "����");
		
		
		//��ü���� ���
		System.out.println("*** ��ü������� ***");
		for(int i=0; i<count; i++) {
			products[i].printInfo();
		}
		
		//����
		String product = "��ġ�����";
		int findIndex = -1;
		for(int i=0; i<count; i++) {
			if(products[i].getName() == product) {
				findIndex = i;
				break;
			}
		}
		if(findIndex == -1) {
			System.out.println(product+" �˻�����!");
		} else {
			products[findIndex].setPrice(130);
		}
		
		//��ü�������
		System.out.println("*** ��ü������� ***");
		for(int i=0; i<count; i++) {
			products[i].printInfo();
		}
		
		//����
		product = "��Ź��";
		findIndex = -1;
		for(int i=0; i<count; i++) {
			if(products[i].getName() == product) {
				findIndex = i;
				break;
			}
		}
		if(findIndex == -1) {
			System.out.println(product+" �˻�����!");
		} else {
			products[findIndex] = products[count-1];
			products[count-1] = null;
			count--;
		}
	
		//��ü�������
		System.out.println("*** ��ü������� ***");
		for(int i=0; i<count; i++) {
			products[i].printInfo();
		}
		
	}
	
}
