package day03;
/** 로또번호 저장객체 */
public class LottoNumbers {
	
	int[] nums = new int[6];

	/** 6개의 로또번호를 난수로 채우기 */
	public void makeNumbers() {
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random()*45+1);
		}//end for
		
	}//end makeNumbers

	public void printInfo() {
		for(int n: nums) {
			System.out.print(n+" ");
		}
		System.out.println(); //공백줄 출력
	}//end printInfo

}//end class
