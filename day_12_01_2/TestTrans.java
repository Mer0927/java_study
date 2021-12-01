package day_12_01_2;

// 연습

public class TestTrans {

	public static void main(String[] args) {
		
		Trans[] tarr = new Trans[1000];
		int count = 0;
		tarr[count++] = new 승용차("1가 1111", "소나타", 2000, 5);
		tarr[count++] = new 트럭("2가 1111", "포터", 2000, 1000);
		tarr[count++] = new 승용차("1가 2222", "카니발", 2000, 7);
		tarr[count++] = new 트럭("2가 2222", "포터", 2000, 5000);

		for(int i=0; i<count; i++){
			System.out.println(tarr[i].getInfo());
			}

	}

}
