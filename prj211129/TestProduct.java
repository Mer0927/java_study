package prj211129;

public class TestProduct {

	public static void main(String[] args) {
		//Product Ŭ���� �׽�Ʈ �ڵ�
		//Product �迭
		Product[] parr = new Product[100];
		int count = 0;
		Product p = new Product("�����", "�Ｚ", 100);
		parr[count++] = p;
		p = new Product("��Ź��", "LG", 110);
		parr[count++] = p;
		parr[count++] = new Product("��ġ�����", "����", 120);
		System.out.println("���尹��="+count);
		
		System.out.println("*** ��ü��� ***");
		for(int i=0; i<count; i++) {
			parr[i].printInfo();
		}
		
		//"��ġ�����"�� ã�Ƽ� ���� 130���� ����
		System.out.println("*** ��ġ����� ���ݺ��� ***");
		int findIndex = -1;
		String findName = "��ġ�����";
		for(int i=0; i<count; i++) {
			Product pr = parr[i];
			if(pr.getName() == findName) {
				findIndex = i;
				break;
			}
		}
		if(findIndex == -1) {
			System.out.println(findName+" �˻�����");
		} else {
			System.out.println(findName+" �˻�����");
			parr[findIndex].setPrice(130);
		}
		
		System.out.println("*** ��ü��� ***");
		for(int i=0; i<count; i++) {
			parr[i].printInfo();
		}

		//"��Ź��"�� ã�Ƽ� ���� 130���� ����
		System.out.println("*** ��Ź�� ���� ***");
		findIndex = -1;
		findName = "��Ź��";
		for(int i=0; i<count; i++) {
			Product pr = parr[i];
			if(pr.getName() == findName) {
				findIndex = i;
				break;
			}
		}
		if(findIndex == -1) {
			System.out.println(findName+" �˻�����");
		} else {
			System.out.println(findName+" �˻�����");
			//��������
			parr[findIndex] = parr[count-1]; //������������ �����Ϸ��� ��ġ�� ������
			parr[count-1] = null; //��������������
			count--; //��������
		}
		
		System.out.println("*** ��ü��� ***");
		for(int i=0; i<count; i++) {
			parr[i].printInfo();
		}
	}

}
