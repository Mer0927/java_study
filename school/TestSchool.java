package school;

public class TestSchool {

	public static void main(String[] args) {
		// �б����� ������� ����
		// �л�: �̸�, �ֹ�, ��ȭ, �ּ�, �̸���, �й�, �а�
		// ����: �̸�, �ֹ�, ��ȭ, �ּ�, �̸���, ���, �μ�
		// ����: �̸�, �ֹ�, ��ȭ, �ּ�, �̸���, ����, �������ּ�
		
//		Person p1 = new Person("��浿", 1113); //�̸�, ��ȣ
		Mystudent ms1 = new Mystudent("��浿", 1113, "�İ�"); //�л� = Person + �а�
		ms1.printInfo();

		MyEmp me1 = new MyEmp("�ڴ븮", 9011, "�ѹ���"); //���� = Person + �μ�
		me1.printInfo(); //�ڴ븮, 9011, �ѹ���
		
		MyTeacher mt1 = new MyTeacher("�ֱ���", 88013, "������ 103ȣ"); //���� = Person + ������ �ּ�
		mt1.printInfo(); //�ֱ���, 88013, ������ 103ȣ

	}//end main
}//end class