package day1;

public class 타입변환 {

	public static void main(String[] args) {
		// 큰타입 = 작은타입 (o)
		// 작은타입 = 큰타입 (오류)
		// byte < short < int < long < float < double
		// int i = 100L; <<오류
		int i = (int)100.1; // 강제형변환
		System.out.println(i);
		System.out.println( 1/2 );
		System.out.println( 1/2.0 );
		
		System.out.println(1+2);
		System.out.println(1+" "+2);
		System.out.println(1+2+" "+3+4);
		System.out.println(1+2+" "+(3+4));
//		System.out.println(1 * " "); <오류
		System.out.println(1*2+" "+3*4);
		
		// 문자열 => 숫자
		String s = "100";
		int i2 = Integer.parseInt(s);
		System.out.println(i2 - 7);
		
		String s2 = "3.14";
		double d1 = Double.parseDouble(s2);
		System.out.println(d1);
		
		// 숫자 -> 문자열
		int i3 = 200;
		String s3 = i3+"";
		System.out.println(s3);
		
		System.out.println(100);
		System.out.println(200);
	}

}
