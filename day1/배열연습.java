package day1;

public class �迭���� {

	public static void main(String[] args) {
		// �л�����
		int score1 = 90;
		int score2 = 80;
		int score3 = 85;
		
		// �迭
		int[] scores = new int[3];
		System.out.println(scores);
		System.out.println(scores[0]);
		scores[0] = 90;
		scores[1] = 80;
		scores[2] = 85;
		
		int[] scores2 = {90,80,85};
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		
		int[] scores3 = new int[]{90,80,85};
		//���Ҵ�
//		scores2 = {80,90,80}; // �������� �� �� ���
		scores3 = new int[] {50,80,90};

	}

}
