package day1;

public class Ÿ�Ժ�ȯ {

	public static void main(String[] args) {
		// ūŸ�� = ����Ÿ�� (o)
		// ����Ÿ�� = ūŸ�� (����)
		// byte < short < int < long < float < double
		// int i = 100L; <<����
		int i = (int)100.1; // ��������ȯ
		System.out.println(i);
		System.out.println( 1/2 );
		System.out.println( 1/2.0 );
		
		System.out.println(1+2);
		System.out.println(1+" "+2);
		System.out.println(1+2+" "+3+4);
		System.out.println(1+2+" "+(3+4));
//		System.out.println(1 * " "); <����
		System.out.println(1*2+" "+3*4);
		
		// ���ڿ� => ����
		String s = "100";
		int i2 = Integer.parseInt(s);
		System.out.println(i2 - 7);
		
		String s2 = "3.14";
		double d1 = Double.parseDouble(s2);
		System.out.println(d1);
		
		// ���� -> ���ڿ�
		int i3 = 200;
		String s3 = i3+"";
		System.out.println(s3);
		
		System.out.println(100);
		System.out.println(200);
	}

}
