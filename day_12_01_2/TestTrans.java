package day_12_01_2;

// ����

public class TestTrans {

	public static void main(String[] args) {
		
		Trans[] tarr = new Trans[1000];
		int count = 0;
		tarr[count++] = new �¿���("1�� 1111", "�ҳ�Ÿ", 2000, 5);
		tarr[count++] = new Ʈ��("2�� 1111", "����", 2000, 1000);
		tarr[count++] = new �¿���("1�� 2222", "ī�Ϲ�", 2000, 7);
		tarr[count++] = new Ʈ��("2�� 2222", "����", 2000, 5000);

		for(int i=0; i<count; i++){
			System.out.println(tarr[i].getInfo());
			}

	}

}