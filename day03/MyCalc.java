package day03;

/** 간단한 계산기 */
public class MyCalc {
	
	private int total = 0; //값 누적용
	int getTotal() {
		return total;
	}
			
	void add(int num) {
		total = total + num; //값 누적시키기
	}
	int add(int n1, int n2) {
		return n1 + n2;
	}
	
	int plus(int i1, int i2) {
		int c = i1 + i2;
		return c;
	}

}
