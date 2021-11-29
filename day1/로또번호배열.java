package day1;

public class 로또번호배열 {

	public static void main(String[] args) {
		
		int[] lottos = new int[6];
		for(int i=1; i<=lottos.length; i++) {
			int r = (int)(Math.random()*45+1);
			lottos[i-1] = r;
		}//end for
		//전체출력
		for(int i=0; 1<lottos.length; i++) {
			System.out.println(lottos[i]);
		}
		System.out.println("길이는 "+lottos.length);
		
		//향상된 for문
		for(int n : lottos) {
			System.out.println("n="+n);
		}
		
	}//end main
}//end class
