package day_12_01_2;

public class TestPeoPle {

	public static void main(String[] args) {
		
		���[] parr = new ���[1000];
		int count = 0;
		parr[count++] = new ����("ȫ�浿", "111-222", "010-111", "�ѹ���");
		parr[count++] = new ����("��浿", "111-333", "010-222", "������");
		parr[count++] = new ����("�ڱ浿", "111-444", "010-223", "�ڹ�");
		parr[count++] = new ����("�̱浿", "111-555", "010-332", "���̽�");
		parr[count++] = new ������("�ֱ浿", "111-666", "010-443", "�ڹٱ⺻");
		parr[count++] = new ������("���浿", "111-777", "010-553", "���̽��߱�");
		
		System.out.println("*** �������� ***");
		System.out.println("���ο�: "+count);
		for(int i=0; i<count; i++){
		   System.out.println(parr[i].getInfo());
		}//end for

	}//end main
	
}//end class

class ��� {
	private String �̸�;
	private String �ֹι�ȣ;
	private String ��ȭ;

	public ���(String �̸�, String �ֹι�ȣ, String ��ȭ) {
		this.�̸� = �̸�;
		this.�ֹι�ȣ = �ֹι�ȣ;
		this.��ȭ = ��ȭ;
	}

	public ���() {
	}

	public String get�̸�() {
		return �̸�;
	}

	public void set�̸�(String �̸�) {
		this.�̸� = �̸�;
	}

	public String get�ֹι�ȣ() {
		return �ֹι�ȣ;
	}

	public void set�ֹι�ȣ(String �ֹι�ȣ) {
		this.�ֹι�ȣ = �ֹι�ȣ;
	}

	public String get��ȭ() {
		return ��ȭ;
	}

	public void set��ȭ(String ��ȭ) {
		this.��ȭ = ��ȭ;
	}

	public String getInfo() {
		return �̸�+", "+�ֹι�ȣ+", "+��ȭ;
	}
	
}//end class ���

class ���� extends ��� {

	private String �μ�;

	public ����(String �̸�, String �ֹι�ȣ, String ��ȭ, String �μ�) {
		super(�̸�, �ֹι�ȣ, ��ȭ);
		this.�μ� = �μ�;
	}

	public ����() {
	}

	public String get�μ�() {
		return �μ�;
	}

	public void set�μ�(String �μ�) {
		this.�μ� = �μ�;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+", "+�μ�;
	}
	
}//end class ����

class ���� extends ���{

	private String ���ǰ���;

	public ����(String �̸�, String �ֹι�ȣ, String ��ȭ, String ���ǰ���) {
		super(�̸�, �ֹι�ȣ, ��ȭ);
		this.���ǰ��� = ���ǰ���;
	}
	
	public ����() {
	}

	public String get���ǰ���() {
		return ���ǰ���;
	}

	public void set���ǰ���(String ���ǰ���) {
		this.���ǰ��� = ���ǰ���;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+", "+���ǰ���;
	}
	
}//end class ����

class ������ extends ���{

	private String ��������;

	public ������(String �̸�, String �ֹι�ȣ, String ��ȭ, String ��������) {
		super(�̸�, �ֹι�ȣ, ��ȭ);
		this.�������� = ��������;	
	}
	
	public ������() {
	}

	public String get��������() {
		return ��������;
	}

	public void set��������(String ��������) {
		this.�������� = ��������;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+", "+��������;
	}
		
}//end class ������
	