package day04;

public class ��ü�迭 {

	public static void main(String[] args) {
		
		Movie[] movies = new Movie[10000]; //Movie�� �迭��ü 1�� ����. Movie ��ü�� 100�� �����Ҽ� �ִ� ���� 1���� ������ٴ� ��.
		int count = 0;
		movies[count++] = new Movie("����", "����ȣ", 300);
		System.out.println("count="+count);
		movies[count++] = new Movie("��¡�����", "Ȳ����", 200);
		System.out.println("count="+count);
		movies[count++] = new Movie("��ü��Ż��", "������", 100);
		System.out.println("count="+count);
		/// ��ü���� ���
		System.out.println("*** ��ü������� ***");
		for(int i=0; i<count; i++) {
			movies[i].printInfo();
		}
		
		// �˻� > ��ȭ����: ��¡�����
		for(int i=0; i<count; i++) {
			if(movies[i].getTitle() == "��¡�����") {
				System.out.println("��¡����� ã�Ҵ�! ��ȣ:"+i);
			}//end if
		}//end for
		
		// ���� > ��ü��Ż���� ���ۺ� 150���� ����
		String movieTitle = "��ü��Ż��";
		int findIndex = -1; //�˻��Ŀ��� -1 �״���̸� �˻�����
		for(int i=0; i<count; i++) {
			if(movies[i].getTitle() == movieTitle) {
				findIndex = i; //ã����
				break; //�˻�����
			}//end if
		}//end for
		// �˻� �������� ����
		if(findIndex == -1) {
			System.out.println(movieTitle+" �˻�����!");
		} else {
			System.out.println(movieTitle+" ã����! ��ȣ:"+findIndex);
			movies[findIndex].setCost(150);
		}
		
		//����
		movieTitle = "��¡�����"; //����
		findIndex = -1; //�˻��Ŀ��� -1 �״���̸� �˻�����
		for(int i=0; i<count; i++) {
			if(movies[i].getTitle() == movieTitle) {
				findIndex = i; //ã����
				break; //�˻�����
			}//end if
		}//end for

		// �˻� �������� ����
		if(findIndex == -1) {
			System.out.println(movieTitle+" �˻�����!");
		} else {
			System.out.println(movieTitle+" ã����! ��ȣ:"+findIndex);
			//�ش� ��ȣ ����
			//������������ �ʰ� ������ ����
			movies[findIndex] = movies[count-1]; //�����������͸� ������
			movies[count-1] = null; //������ ������ �����
			count--; //���� 1 ����
		}

		//��ü���
		System.out.println("*** ��ü������� ***");
		for(int i=0; i<count; i++) {
			movies[i].printInfo();
		}
		
		
	}//end main

}//end class
