package day1;

public class �ζǹ�ȣ�迭 {

	public static void main(String[] args) {
		
		int[] lottos = new int[6];
		for(int i=1; i<=lottos.length; i++) {
			int r = (int)(Math.random()*45+1);
			lottos[i-1] = r;
		}//end for
		//��ü���
		for(int i=0; 1<lottos.length; i++) {
			System.out.println(lottos[i]);
		}
		System.out.println("���̴� "+lottos.length);
		
		//���� for��
		for(int n : lottos) {
			System.out.println("n="+n);
		}
		
	}//end main
}//end class
