package prj211129;
/** Product 배열과 count 변수를 보호하는 역할 */
public class ProductManager {
	private Product[] parr = new Product[100];
	private int count = 0;
	
	public void add(Product p) {
		System.out.println("add내부 "+p);
		parr[count++] = p;
		
	}
	
	public int getCount() {
		return count;
	}
	
	/** 이름으로 검색. 해당 이름의 번호를 반환 */
	public int findByName(String name) {
		for(int i=0; i<count; i++) {
			if(parr[i].getName() == name) {
				return i;//해당위치를 반환하고 종료
			}
		}
		return -1;//이름을 못찾으면 -1 반환
	}

	public void printAll() {
		for(int i=0; i<count; i++) {
			System.out.println(parr[i]);
		}
		
	}

}
