package day04;

public class �迭���� {

	public static void main(String[] args) {
		int[] scores = new int[2];
		int[][] scores2 = new int[2][3];
		
		System.out.println(scores2); // 1���� �迭�� ��ġ��
		System.out.println(scores2[0]); // 2���� �迭 ù��°�� �ּ�
		System.out.println(scores2[1]); // 2���� �迭 �ι�°�� �ּ�
		System.out.println("scores2[0][0]"+scores2[0][0]);
		
		//�Ʒ� �۾��� ������������ �̷��� �ϴ°��� ���� �平
		int[] scores3 = {70, 90, 80}; //����, �ʱ�ȭ���� �Ѳ����� ó��
		System.out.println(scores3[0]+", "+scores3[1]+", "+scores3[2]);
		
		//��κ� �۾��ڵ�
		int[] scores4 = new int[3];
		scores4[0] = 70;
		scores4[1] = 80;
		scores4[2] = 90;
		
		// ************ 2�����迭 ************ // �Խ����� ���鶧 ������ �ʰ�, �ַ� ��������� ���� �� ����.
		
		int[][] scores5 = {
				{1, 3, 5},
				{2, 4, 6}
		}; //2�� 3��
		System.out.println(scores5[0][0]);
		System.out.println(scores5[0][1]);
		System.out.println(scores5[0][2]);
		System.out.println(scores5[1][0]);
		System.out.println(scores5[1][1]);
		System.out.println(scores5[1][2]);
		
		
		////�ϱ� �����ϱ�
		String[] diary = new String[365];
		//1��1��
		int month = 1;
		int day = 1;
		diary[(month-1)*31 + (day-1)] = "������ 1�� 1��.";
		
		month = 11;
		day = 25;
		diary[(month-1)*31 + (day-1)] = "������ 11�� 25��.";
		
		//�ϱ�� 2���������� ����
		String[][] diary2 = new String[12][31];
		diary2[0][0] = "������ 1�� 1��";
		diary2[10][24] =  "������ 11�� 25��";
		
		
	}

}
