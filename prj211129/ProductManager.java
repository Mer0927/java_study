package prj211129;
/** Product �迭�� count ������ ��ȣ�ϴ� ���� */
public class ProductManager {
	private Product[] parr = new Product[100];
	private int count = 0;
	
	public void add(Product p) {
		System.out.println("add���� "+p);
		parr[count++] = p;
		
	}
	
	public int getCount() {
		return count;
	}
	
	/** �̸����� �˻�. �ش� �̸��� ��ȣ�� ��ȯ */
	public int findByName(String name) {
		for(int i=0; i<count; i++) {
			if(parr[i].getName() == name) {
				return i;//�ش���ġ�� ��ȯ�ϰ� ����
			}
		}
		return -1;//�̸��� ��ã���� -1 ��ȯ
	}

	public void printAll() {
		for(int i=0; i<count; i++) {
			System.out.println(parr[i]);
		}
		
	}

}
