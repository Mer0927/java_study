package prj211129;

public class TestProduct2 {

	public static void main(String[] args) {
		//������ ���忡 ���õ� ������ �Լ��� ���� Ŭ������ ���� -> XXXManager
		ProductManager pm = new ProductManager(); //�迭�� count ����
		
		Product p = new Product("�����", "�Ｚ", 100);
		System.out.println(p);
		pm.add(p);
		p = new Product("��Ź��", "LG", 110);
		pm.add(p);
		p = new Product("��ġ�����", "����", 120);
		pm.add(p);
		
		System.out.println("*** ���尹��: "+pm.getCount()+" ***");
		
		System.out.println("** ��ü��� **");
		pm.printAll(); //����� ��� ������ ���
		
		// "��Ź��" ã�Ƽ� ���� > 130���� ����
		String findName = "�����";
		int findIndex = pm.findByName(findName);
		if(findIndex == -1) {
			System.out.println(findName+" �˻�����");
		} else {
			System.out.println(findName+" �˻�����");
		}

	}

}
