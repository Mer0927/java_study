package day_11_30_1;

public class TestSchool {

	public static void main(String[] args) {
		//�л�����: Student �̸�, ��ȭ��ȣ, �а�
		//��������: Emp �̸�, ��ȭ��ȣ, �μ�
		
		//�л��� ���� ���뺯���� Person: �̸�, ��ȭ
		//�л�: �а�
		//����: �μ�
		
		Student st1 = new Student("ȫ�浿","111-222","�İ�");
		st1.printInfo();
		
		Emp e1 = new Emp("��븮","111-223","�ѹ���"); //name, tel, dept
		e1.printInfo();
		
		/////////////////
		Person p1 = st1;
		System.out.println("p1="+p1);
		System.out.println("st1="+st1);
		
		System.out.println("Hakgwa="+st1.getHakgwa());
//		System.out.println("Hakgwa="+p1.getHakgwa());
		
		p1 = e1;
	
	}//end main

}//end class
